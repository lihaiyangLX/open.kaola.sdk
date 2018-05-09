package com.kaola.item;

import java.util.List;

/**
 * 类目属性集合
 * @author LiHaiyang
 *
 */
public class PropertyCategory {

	private RawPropertyCategory raw_property_category;

	private PropertyName property_name;

	private List<PropertyValue> property_value_list;

	public RawPropertyCategory getRaw_property_category() {
		return raw_property_category;
	}

	public void setRaw_property_category(RawPropertyCategory raw_property_category) {
		this.raw_property_category = raw_property_category;
	}

	public PropertyName getProperty_name() {
		return property_name;
	}

	public void setProperty_name(PropertyName property_name) {
		this.property_name = property_name;
	}

	public List<PropertyValue> getProperty_value_list() {
		return property_value_list;
	}

	public void setProperty_value_list(List<PropertyValue> property_value_list) {
		this.property_value_list = property_value_list;
	}
}