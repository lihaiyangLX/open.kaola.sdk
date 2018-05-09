package com.kaola.utils;

import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

/**
 * 签名生成器
 * @author LiHaiyang
 * 2018年3月21日
 */
public class SignGenerator {

	public static String sign(Map<String, Object> params, List<String> noSignKeys, String appSecret) {

		StringBuilder sb = composeValues(params, noSignKeys, appSecret);

		String result = "";

		try {

			result = md5(sb.toString());
		} catch (Exception e) {

			e.printStackTrace();
		}

		return result;
	}

	private static StringBuilder composeValues(Map<String, Object> params, List<String> noSignKeys, String appSecret) {

		StringBuilder sb = new StringBuilder(appSecret);

		List<String> names = params.keySet().stream().sorted().collect(Collectors.toList());
		names.removeAll(noSignKeys); // 移除不需要组装的内容

		names.forEach(name -> {

			String value = String.valueOf(params.get(name));
			if (StringUtils.isNoneBlank(name, value)) {

				sb.append(name).append(value);
			}
		});

		sb.append(appSecret);

		return sb;
	}

	private static String md5(String source) throws Exception {

		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] bytes = md.digest(source.getBytes("UTF8"));

		return byte2hex(bytes);
	}

	/**
	 * 二进制转十六进制字符串
	 *
	 * @param bytes
	 * @return
	 */
	private static String byte2hex(byte[] bytes) {

		StringBuilder sign = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {

			String hex = Integer.toHexString(bytes[i] & 0xFF);
			if (hex.length() == 1) {
				sign.append("0");
			}
			sign.append(hex.toUpperCase());
		}

		return sign.toString();
	}
}