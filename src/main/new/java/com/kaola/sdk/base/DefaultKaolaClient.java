package com.kaola.sdk.base;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kaola.sdk.utils.KopUtils;
import com.kaola.sdk.utils.WebUtils;

/**
 * DefaultKaolaClient.java
 * @author LiHaiyang
 * 2018年5月23日
 */
public class DefaultKaolaClient implements KaolaClient {

	private static final String APP_KEY = "app_key";

	private static final String METHOD = "method";

	private static final String TIMESTAMP = "timestamp";

	private static final String SIGN = "sign";

	private static final String ACCESS_TOKEN = "access_token";

	public static final String TIMESTAMPFORMAT = "yyyy-MM-dd HH:mm:ss";

	private String serverUrl;

	private String accessToken;

	private String appKey;

	private String appSecret;

	private int connectTimeout = 0;

	private int readTimeout = 0;

	public DefaultKaolaClient(String serverUrl, String accessToken, String appKey, String appSecret) {
		super();
		this.serverUrl = serverUrl;
		this.accessToken = accessToken;
		this.appKey = appKey;
		this.appSecret = appSecret;
	}

	public DefaultKaolaClient(String serverUrl, String accessToken, String appKey, String appSecret, int connectTimeout,
			int readTimeout) {
		super();
		this.serverUrl = serverUrl;
		this.accessToken = accessToken;
		this.appKey = appKey;
		this.appSecret = appSecret;
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	@Override
	public <T extends KopResponse> T execute(KopRequest<T> request) {
		try {
			return doPost(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private <T extends KopResponse> T doPost(KopRequest<T> request) throws IOException {
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put(APP_KEY, this.appKey);
		requestMap.put(METHOD, request.getApiMethodName());
		SimpleDateFormat df = new SimpleDateFormat(DefaultKaolaClient.TIMESTAMPFORMAT);
		requestMap.put(TIMESTAMP, df.format(
				new Date(request.getTimestamp() != null ? request.getTimestamp() : System.currentTimeMillis())));
		requestMap.put(ACCESS_TOKEN, this.accessToken);
		if (request.getTextParams() != null) {
			for (String key : request.getTextParams().keySet()) {
				requestMap.put(key, request.getTextParams().get(key));
			}
		}
		// 签名
		String sign = KopUtils.sign(requestMap, appSecret);
		requestMap.put(SIGN, sign);
		StringBuffer urlSb = new StringBuffer(serverUrl);
		String queryUrl = WebUtils.buildQuery(requestMap, WebUtils.DEFAULT_CHARSET);
		urlSb.append("?" + queryUrl);

		String response = null;
		if (request instanceof KopUploadRequest) {
			KopUploadRequest<T> uploadRequest = (KopUploadRequest<T>) request;
			response = WebUtils.doPost(urlSb.toString(), requestMap, uploadRequest.getFileParams(), connectTimeout,
					readTimeout);
		} else
			response = WebUtils.doPost(urlSb.toString(), null, connectTimeout, readTimeout);

		Map<String, JSONObject> jsonObject = (Map<String, JSONObject>) JSON.parse(response);
		for (Map.Entry<String, JSONObject> entry : jsonObject.entrySet()) {
			if (entry.getValue() == null)
				return null;
			T r = JSON.parseObject(entry.getValue().toJSONString(), request.getResponseClass());
			return r;
		}
		return null;
	}
}