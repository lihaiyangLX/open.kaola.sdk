package com.kaola.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

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

	public static Object pushValues(Object object, Map<Object, Object> values) {

		List<Field> fields = getFields(object.getClass(), null);
		Class<?> clazz = object.getClass();
		fields.forEach(field -> {

			String fieldName = field.getName();
			if (values.containsKey(fieldName)) {

				try {

					Method m = clazz.getMethod(composeMethodName("set", fieldName), field.getType());
					m.invoke(object, field.getType().cast(values.get(fieldName)));
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