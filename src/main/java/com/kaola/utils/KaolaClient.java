package com.kaola.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response.Status;

import com.fasterxml.jackson.databind.JsonNode;
import com.kaola.base.KaolaRequest;
import com.kaola.base.KaolaUploadRequest;
import com.soomey.bean.collection.MultiValueHashMap;
import com.soomey.bean.log.JsonLogger;
import com.soomey.bean.log.JsonLogger.JsonLoggerFactory;
import com.soomey.bean.message.Reply;
import com.soomey.util.DateFormatUtils;
import com.soomey.util.JsonUtils;
import com.soomey.util.StringUtils;
import com.soomey.util.WebUtils;

public class KaolaClient {

	private static final JsonLogger logger = JsonLoggerFactory.getLogger(KaolaClient.class);

	private String access_token;

	private String app_key;

	private String app_secret;

	private String v = "1.0";

	private String serverUrl;

	public KaolaClient(String access_token, String app_key, String app_secret, String serverUrl) {

		this.access_token = access_token;
		this.app_key = app_key;
		this.app_secret = app_secret;
		this.serverUrl = serverUrl;
	}

	public KaolaClient(String app_key, String app_secret, String serverUrl) {

		this.app_key = app_key;
		this.app_secret = app_secret;
		this.serverUrl = serverUrl;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getApp_key() {
		return app_key;
	}

	public void setApp_key(String app_key) {
		this.app_key = app_key;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public String getApp_secret() {
		return app_secret;
	}

	public void setApp_secret(String app_secret) {
		this.app_secret = app_secret;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public JsonNode getToken(String code, String redirectUrl, String tokenUrl) {

//		MultiValueMap<String, String> parameters = new MultiValueHashMap<String, String>();
//		parameters.add("client_id", app_key);
//		parameters.add("code", code);
//		parameters.add("redirect_uri", redirectUrl);
////		parameters.add("state", state);
//		parameters.add("view", "web");
//		parameters.add("client_secret", app_secret);
//		parameters.add("grant_type", "authorization_code");
//		parameters.add("type", "101");

		Map<String, String> params = new HashMap<String, String>();
		params.put("client_id", app_key);
		params.put("code", code);
		params.put("redirect_uri", redirectUrl);
		params.put("view", "web");
		params.put("client_secret", app_secret);
		params.put("grant_type", "authorization_code");
		params.put("type", "101");

//		Reply reply = WebUtils.post(tokenUrl, parameters);
		String responsContents = HttpsClient.doPost(tokenUrl, params);
		JsonNode result = JsonUtils.read(responsContents != null ? responsContents : "");
		if (!result.has("access_token")) {

			throw new RuntimeException("获取考拉Oauth token失败，code = " + code + " reply is " + responsContents + " and params are " + params);
		}

		return result;
	}

	@Deprecated
	public JsonNode excuteOld(KaolaRequest request) {

		Reply result = WebUtils.post(buildUrl(request, true, null), new MultiValueHashMap<>());

		JsonNode response = null;
		if (Status.OK != result.getStatus()) {

			response = JsonUtils.toJsonNode(result);
			logger.error("something wrong with comm in method " + request.getMethod() + " result is " + response);
			return response;
		} else {

			response = JsonUtils.read(result.getContent());

			return !response.has("error_response")
					? getResponseJson(response, request.getResponseClass())
					: response;
		}
	}

	public JsonNode excute(KaolaRequest request) {

		String result = HttpsClient.doPost(buildUrl(request, true, null), new HashMap<>());

		logger.info("kaola excute result is " + result);
		JsonNode response = JsonUtils.read(result);

		return !response.has("error_response")
				? getResponseJson(response, request.getResponseClass())
				: response;
	}

	public JsonNode excuteUpload(KaolaUploadRequest request) {

		JsonNode result = null;
		
		String timestamp = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
		Map<String, Object> values = composeRequestValues(request, timestamp, false);
		String url = buildUrl(request, false, values);
		values.put("timestamp", timestamp);
		try {

			String response = FileUplodUtils.doPost(url, values, request.getFileParams(), 0, 0);
			if (response != null) {

				result = getResponseJson(JsonUtils.read(response), request.getResponseClass());
			}
		} catch (IOException e) {

			logger.error("upload has wrong " + e);
		}

		return result;
	}

	private JsonNode getResponseJson(JsonNode content, Class<?> clazz) {

		String responseKey = StringUtils.splitCamelCase(clazz.getSimpleName(), "_").toLowerCase();

		return content.has(responseKey) ? content.get(responseKey) : content;
	}

	private String buildUrl(KaolaRequest request, boolean needRequestValues, Map<String, Object> values) {

		values = values != null ? values : composeRequestValues(request, DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"), needRequestValues);

		StringBuilder url = new StringBuilder(serverUrl + "?");	
		url.append(ValuesComposer.composeValues(values, Arrays.asList("responseClass"), "=", "&", false));

		return url.toString();
	}

	private Map<String, Object> composeRequestValues(KaolaRequest request, String timestamp, boolean needRequestValues) {

		Map<String, Object> values = new HashMap<>();
		if (needRequestValues) {

			values = ObjectFieldManager.reader(request);
		} else {

			values.put("method", request.getMethod());
		}

		try {

			values.put("timestamp", URLEncoder.encode(timestamp, "UTF-8"));
		} catch (UnsupportedEncodingException e) {

			logger.error("encode date fail that " + e);
		}
//		String sign = getSignValues(request.getMethod(), timestamp);
		String newSign = getSignValues(request, timestamp);
		values.put("sign", newSign);
		values.put("app_key", app_key);
		values.put("access_token", access_token);

		return values;
	}

	private String getSignValues(KaolaRequest request, String timestamp) {

		Map<String, Object> params = ObjectFieldManager.reader(request);
		params.putAll(ObjectFieldManager.reader(this));
		params.put("timestamp", timestamp);
		params.remove("responseClass");

		return SignGenerator.sign(params, Arrays.asList("app_secret", "serverUrl", "v"), app_secret);
	}

	@SuppressWarnings("unused")
	private String getSignValues(String method, String timestamp) {

		Map<String, Object> params = ObjectFieldManager.reader(this);
		params.put("method", method);
		params.put("timestamp", timestamp);

		return SignGenerator.sign(params, Arrays.asList("app_secret", "serverUrl", "v"), app_secret);
	}
}