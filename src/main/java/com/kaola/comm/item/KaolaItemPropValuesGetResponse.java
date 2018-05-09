package com.kaola.comm.item;
/**
 * 标准商品类目属性值
 * @author LiHaiyang
 * 2018年3月16日
 */
public class KaolaItemPropValuesGetResponse {

	private String property_value_id; // 属性值id

	private String property_value; // 属性值

	private String property_name_id; // 属性名id

	private String property_value_icon; // 属性值图标

	private int is_sys_property; // 是否系统属性。1：系统属性 0：用户自定义

	private int show_order; // 显示顺序

	private int status; // 状态 1：正常 0：无效

	public String getProperty_value_id() {
		return property_value_id;
	}

	public void setProperty_value_id(String property_value_id) {
		this.property_value_id = property_value_id;
	}

	public String getProperty_value() {
		return property_value;
	}

	public void setProperty_value(String property_value) {
		this.property_value = property_value;
	}

	public String getProperty_name_id() {
		return property_name_id;
	}

	public void setProperty_name_id(String property_name_id) {
		this.property_name_id = property_name_id;
	}

	public String getProperty_value_icon() {
		return property_value_icon;
	}

	public void setProperty_value_icon(String property_value_icon) {
		this.property_value_icon = property_value_icon;
	}

	public int getIs_sys_property() {
		return is_sys_property;
	}

	public void setIs_sys_property(int is_sys_property) {
		this.is_sys_property = is_sys_property;
	}

	public int getShow_order() {
		return show_order;
	}

	public void setShow_order(int show_order) {
		this.show_order = show_order;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}