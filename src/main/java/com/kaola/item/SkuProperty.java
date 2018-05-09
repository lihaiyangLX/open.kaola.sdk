package com.kaola.item;

/**
 * SKU属性
 * @author LiHaiyang
 * 2018年3月16日
 */
public class SkuProperty {

	private RawSkuProperty raw_sku_property; // SKU基本信息

	private PropertyName property_name; // SKU属性列表

	private PropertyValue property_value; // SKU属性key

	public RawSkuProperty getRaw_sku_property() {
		return raw_sku_property;
	}

	public void setRaw_sku_property(RawSkuProperty raw_sku_property) {
		this.raw_sku_property = raw_sku_property;
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