package com.kaola.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.soomey.util.JsonUtils;


/**
 * 类属性处理器
 * @author LiHaiyang
 * 2018年3月19日
 */
public class ObjectFieldManager {

	public static Map<String, Object> reader(Object object) {

		Map<String, Object> objectValues = new HashMap<>();

		List<Field> fields = getFields(object.getClass(), null);
		Class<?> clazz = object.getClass();
		fields.forEach(field -> {

			String fieldName = field.getName();
			if (!"logger".equalsIgnoreCase(fieldName) && !"image".equals(fieldName)) { // 如果不为logger的话继续

				Object value = null;
				try {

					Method m = clazz.getMethod(composeMethodName("get", fieldName));
					value = m.invoke(object);
				} catch (Exception e) {
					e.printStackTrace();
				}

				objectValues.put(fieldName, value);
			}
		});

		return objectValues;
	}

	public static Map<String, String> StringMapReader(Object object) {

		Map<String, String> objectValues = new HashMap<>();

		List<Field> fields = getFields(object.getClass(), null);
		Class<?> clazz = object.getClass();
		fields.forEach(field -> {

			String fieldName = field.getName();
			if (!"logger".equalsIgnoreCase(fieldName) && !"image".equals(fieldName)) { // 如果不为logger的话继续

				Object value = null;
				try {

					Method m = clazz.getMethod(composeMethodName("get", fieldName));
					value = m.invoke(object);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (value != null && StringUtils.isNotBlank(String.valueOf(value))) {

					objectValues.put(fieldName, String.valueOf(value));
				}
			}
		});

		return objectValues;
	}

	public static Object pushValues(Object object, Map<Object, Object> values) {

		List<Field> fields = getFields(object.getClass(), null);
		Class<?> clazz = object.getClass();
		fields.forEach(field -> {

			String fieldName = field.getName();
			if (values.containsKey(fieldName)) {

				try {

					Class<?> fieldType = field.getType();
					Method m = clazz.getMethod(composeMethodName("set", fieldName), fieldType);
//					m.invoke(object, field.getType().cast(values.get(fieldName)));

					m.invoke(object, fieldType.getSuperclass() != null
										? JsonUtils.parse(values.get(fieldName).toString(), fieldType)
										: fieldType.cast(values.get(fieldName)));
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});

		return object;
	}

	private static String composeMethodName(String methodPre, String fieldName) {

		return methodPre + StringUtils.upperCase(fieldName.substring(0, 1)) + fieldName.substring(1);
	}

	private static List<Field> getFields(Class<?> clazz, List<Field> fields) {

		if (fields == null) {

			fields = new ArrayList<>();
		}
		fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
		Class<?> parent = clazz.getSuperclass();
		if (clazz != Object.class && parent != clazz) {

			getFields(parent, fields);
		}

		return fields;
	}
}