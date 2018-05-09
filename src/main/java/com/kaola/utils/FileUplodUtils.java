package com.kaola.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import com.kaola.base.FileItem;

/**
 * 图片上传工具
 * @author LiHaiyang
 * 2018年3月29日
 */
public class FileUplodUtils {

	private static final String DEFAULT_CHARSET = "UTF-8";

	private static final String METHOD_POST = "POST";

	/**
	 * 执行带文件上传的HTTP POST请求。
	 * 
	 * @param url 请求地址
	 * @param textParams 文本请求参数
	 * @param fileParams 文件请求参数
	 * @param connectTimeout 可以为0
	 * @param readTimeout 可以为0
	 * @return 响应字符串
	 * @throws IOException
	 */
	public static String doPost(String url, Map<String, Object> params, Map<String, FileItem> fileParams, int connectTimeout, int readTimeout) throws IOException {

		String charset = DEFAULT_CHARSET;
		String boundary = System.currentTimeMillis() + ""; // 随机分隔线
		HttpURLConnection conn = null;
		OutputStream out = null;
		String rsp = null;		
		try {

			// 连接基础参数录入
			String ctype = "multipart/form-data;charset=" + charset + ";boundary=" + boundary;
			conn = getConnection(new URL(url), METHOD_POST, ctype);
			conn.setConnectTimeout(connectTimeout);
			conn.setReadTimeout(readTimeout);

			// 获取输出流
			out = conn.getOutputStream();

			byte[] entryBoundaryBytes = ("\r\n--" + boundary + "\r\n").getBytes(charset);

			// 组装文本请求参数
			Set<Entry<String, Object>> textEntrySet = params.entrySet();

			for (Entry<String, Object> textEntry : textEntrySet) {
				byte[] textBytes = getTextEntry(textEntry.getKey(), String.valueOf(textEntry.getValue()), charset);
				out.write(entryBoundaryBytes);
				out.write(textBytes);
			}

			// 组装文件请求参数
			Set<Entry<String, FileItem>> fileEntrySet = fileParams.entrySet();
			for (Entry<String, FileItem> fileEntry : fileEntrySet) {
				FileItem fileItem = fileEntry.getValue();
				byte[] fileBytes = getFileEntry(fileEntry.getKey(), fileItem.getFileName(), fileItem.getMimeType(), charset);
				out.write(entryBoundaryBytes);
				out.write(fileBytes);
				out.write(fileItem.getContent());
			}

			// 添加请求结束标志
			byte[] endBoundaryBytes = ("\r\n--" + boundary + "--\r\n").getBytes(charset);
			out.write(endBoundaryBytes);
			rsp = getResponseAsString(conn);
		} finally {
			if (out != null) {
				out.close();
			}
			if (conn != null) {
				conn.disconnect();
			}
		}

		return rsp;
	}

	private static HttpURLConnection getConnection(URL url, String method, String ctype) throws IOException {

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod(method);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestProperty("Accept", "text/xml,text/javascript,text/html");
		conn.setRequestProperty("User-Agent", "kaola-sdk-java");
		conn.setRequestProperty("Content-Type", ctype);
		return conn;
	}

	private static byte[] getTextEntry(String fieldName, String fieldValue, String charset) throws IOException {

		StringBuilder entry = new StringBuilder();
		entry.append("Content-Disposition:form-data;name=\"");
		entry.append(fieldName);
		entry.append("\"\r\nContent-Type:text/plain\r\n\r\n");
		entry.append(fieldValue);
		return entry.toString().getBytes(charset);
	}

	protected static String getResponseAsString(HttpURLConnection conn) throws IOException {

		String charset = getResponseCharset(conn.getContentType());
		InputStream es = conn.getErrorStream();
		if (es == null) {
			return getStreamAsString(conn.getInputStream(), charset);
		} else {
			String msg = getStreamAsString(es, charset);
			if (StringUtils.isEmpty(msg)) {
				throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
			} else {
				throw new IOException(msg);
			}
		}
	}

	private static String getStreamAsString(InputStream stream, String charset) throws IOException {

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
			StringWriter writer = new StringWriter();

			char[] chars = new char[256];
			int count = 0;
			while ((count = reader.read(chars)) > 0) {
				writer.write(chars, 0, count);
			}

			return writer.toString();
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}

	private static String getResponseCharset(String ctype) {

		String charset = "UTF-8";

		String[] params = ctype.split(";", -1);
		if (Stream.of(params).anyMatch(param -> param.trim().startsWith("charset") && param.split("=", 2).length == 2)) {

			charset = Stream.of(params).filter(param -> param.trim().startsWith("charset") && param.split("=", 2).length == 2)
							.collect(Collectors.toList()).get(0).split("=",  2)[1].trim();
		}

		return charset;
	}

//	private static Map<String, String> getParamsFromUrl(String url) {
//
//		Map<String,String> map = new HashMap<String,String>();
//		if(url != null && url.indexOf('?') != -1) {
//
//			map = splitUrlQuery(url.substring(url.indexOf('?') + 1));
//		}
//
//		return map;
//	}

	/**
	 * 从URL中提取所有的参数。
	 * 
	 * @param query URL地址
	 * @return 参数映射
	 */
	public static Map<String, String> splitUrlQuery(String query) {

		Map<String, String> result = new HashMap<String, String>();

		String[] pairs = query.split("&");
		if (pairs != null && pairs.length > 0) {
			for (String pair : pairs) {
				String[] param = pair.split("=", 2);
				if (param != null && param.length == 2) {
					result.put(param[0], param[1]);
				}
			}
		}

		return result;
	}

	private static byte[] getFileEntry(String fieldName, String fileName, String mimeType, String charset) throws IOException {

		StringBuilder entry = new StringBuilder();
		entry.append("Content-Disposition:form-data;name=\"");
		entry.append(fieldName);
		entry.append("\";filename=\"");
		entry.append(fileName);
		entry.append("\"\r\nContent-Type:");
		entry.append(mimeType);
		entry.append("\r\n\r\n");
		return entry.toString().getBytes(charset);
	}
}