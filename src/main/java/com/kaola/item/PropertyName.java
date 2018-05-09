package com.kaola.item;

/**
 * 属性名信息
 * @author LiHaiyang
 *
 */
public class PropertyName {

	private RawPropertyName raw_property_name; // 属性名基本信息

	private PropertyEditPolicy property_edit_policy; // 属性编辑策略

	public RawPropertyName getRaw_property_name() {
		return raw_property_name;
	}

	public void setRaw_property_name(RawPropertyName raw_property_name) {
		this.raw_property_name = raw_property_name;
	}

	public PropertyEditPolicy getProperty_edit_policy() {
		return property_edit_policy;
	}

	public void setProperty_edit_policy(PropertyEditPolicy property_edit_policy) {
		this.property_edit_policy = property_edit_policy;
	}
}