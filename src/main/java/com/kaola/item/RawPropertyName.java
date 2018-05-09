package com.kaola.item;

public class RawPropertyName {

	private String prop_name_id; // 属性名id

	private String prop_name_cn; // 属性名中文

	private String prop_Name_en; // 属性名英文

	private int is_sku; // 是否SKU属性1: 是 0：否

	private int is_filter; // 是否筛选条件1：是 0：否

	private int is_display; // 是否显示 1：是 0：否

	private int is_color; // 是否是颜色属性。对于服装类，颜色属性需要上传图片。1：是 0：否

	private int is_logistics; // 是否物流属性 1：是 0：否

	private int status; // 状态 1：正常 0：无效

	public String getProp_name_id() {
		return prop_name_id;
	}

	public void setProp_name_id(String prop_name_id) {
		this.prop_name_id = prop_name_id;
	}

	public String getProp_name_cn() {
		return prop_name_cn;
	}

	public void setProp_name_cn(String prop_name_cn) {
		this.prop_name_cn = prop_name_cn;
	}

	public String getProp_Name_en() {
		return prop_Name_en;
	}

	public void setProp_Name_en(String prop_Name_en) {
		this.prop_Name_en = prop_Name_en;
	}

	public int getIs_sku() {
		return is_sku;
	}

	public void setIs_sku(int is_sku) {
		this.is_sku = is_sku;
	}

	public int getIs_filter() {
		return is_filter;
	}

	public void setIs_filter(int is_filter) {
		this.is_filter = is_filter;
	}

	public int getIs_display() {
		return is_display;
	}

	public void setIs_display(int is_display) {
		this.is_display = is_display;
	}

	public int getIs_color() {
		return is_color;
	}

	public void setIs_color(int is_color) {
		this.is_color = is_color;
	}

	public int getIs_logistics() {
		return is_logistics;
	}

	public void setIs_logistics(int is_logistics) {
		this.is_logistics = is_logistics;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}