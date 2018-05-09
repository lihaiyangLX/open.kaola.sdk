package com.kaola.utils;

import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

/**
 * 数据组装工具
 * @author LiHaiyang
 * 2018年3月20日
 */
public class ValuesComposer {

	private final static String DEFAULT_ENCODE = "UTF-8";

	/**
	 * 
	 * @param values
	 * @param separator 方法名与值之间的分隔符
	 * @param fieldSeparator 属性值之间的分隔符
	 * @throws Exception
	 */
	public static String composeValues(Map<String, Object> paramValues, List<String> ignoreParamNames, String separator, String fieldSeparator, boolean toBeEncodeValue) {

		ignoreParamNames.forEach(key -> paramValues.remove(key));

		List<String> values = paramValues.entrySet().stream()
												.filter(entry -> StringUtils.isNoneBlank(entry.getKey(), String.valueOf(entry.getValue())))
												.map(entry -> toBeEncodeValue ? toEncodedValue(entry, fieldSeparator) : noEncodeValue(entry, separator))
												.collect(Collectors.toList());

		return StringUtils.join(values, fieldSeparator);
	}

	private static String toEncodedValue(Entry<String, Object> entry, String separator) {

		String paramString = "";
		try {

			paramString = URLEncoder.encode(entry.getKey(), DEFAULT_ENCODE) + separator + URLEncoder.encode(String.valueOf(entry.getValue()), DEFAULT_ENCODE);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return paramString;
	}

	private static String noEncodeValue(Entry<String, Object> entry, String separator) {

		return entry.getKey() + separator + String.valueOf(entry.getValue());
	}
}