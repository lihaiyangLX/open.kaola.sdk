package com.kaola.utils;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpsClient {

	private static final Logger logger = LoggerFactory.getLogger(HttpsClient.class);

	public static String doPost(String uri, Map<String, String> params) {

		logger.info("https doPost uri = " + uri + " and params = " + params);
		String responseContent = null; // 响应内容
		PoolingHttpClientConnectionManager connManager = null;

		try {

			SSLContext sslctx = createIgnoreVerifySSL();

			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
					.register("http", PlainConnectionSocketFactory.INSTANCE)
					.register("https", new SSLConnectionSocketFactory(sslctx)).build();
			connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
			HttpClients.custom().setConnectionManager(connManager);

			HttpClient client = HttpClients.custom().setConnectionManager(connManager).build();

			HttpPost httpPost = new HttpPost(uri); // 创建HttpPost

			httpPost.addHeader("accept-encoding", "gzip,deflate");

			List<NameValuePair> formParams = new ArrayList<NameValuePair>(); // 构建POST请求的表单参数
			for (Map.Entry<String, String> entry : params.entrySet()) {

				formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
			httpPost.setEntity(new UrlEncodedFormEntity(formParams, "UTF-8"));

			HttpResponse response = client.execute(httpPost); // 执行POST请求

			if (response != null && response.getStatusLine().getStatusCode() == 200) {

				HttpEntity entity = response.getEntity(); // 获取响应实体

				if (entity != null) {

					boolean isGzip = Arrays.asList(response.getAllHeaders()).stream()
							.anyMatch(header -> header.getValue().equals("gzip"));
					responseContent = isGzip
							? EntityUtils.toString(new GzipDecompressingEntity(response.getEntity()), Consts.UTF_8)
							: EntityUtils.toString(response.getEntity(), Consts.UTF_8);
					EntityUtils.consume(entity); // Consume response content
				}
			}

		} catch (Exception e) {

			logger.error("httpClients post has error " + e);
		} finally {

			if (connManager != null) {

				connManager.close();
			}
		}

		return responseContent;
	}

	public static SSLContext createIgnoreVerifySSL() throws NoSuchAlgorithmException, KeyManagementException {

		SSLContext sc = SSLContext.getInstance("SSLv3");

		X509TrustManager trustManager = new X509TrustManager() {
			@Override
			public void checkClientTrusted(java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
					String paramString) throws CertificateException {
			}

			@Override
			public void checkServerTrusted(java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
					String paramString) throws CertificateException {
			}

			@Override
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}
		};

		sc.init(null, new TrustManager[] { trustManager }, null);
		return sc;
	}
}