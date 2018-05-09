package com.kaola.item;

public class ItemProperty {

	private RawItemProperty raw_item_property; // 商品属性对应信息

	private PropertyName property_name; // 属性名信息

	private PropertyValue property_value; // 属性值信息

	public RawItemProperty getRaw_item_property() {
		return raw_item_property;
	}

	public void setRaw_item_property(RawItemProperty raw_item_property) {
		this.raw_item_property = raw_item_property;
	}

	public PropertyName getProperty_name() {
		return property_name;
	}

	public void setProperty_name(PropertyName property_name) {
		this.property_name = property_name;
	}

	public PropertyValue getProperty_value() {
		return property_value;
	}

	public void setProperty_value(PropertyValue property_value) {
		this.property_value = property_value;
	}
}