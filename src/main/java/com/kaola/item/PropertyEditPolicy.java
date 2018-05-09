package com.kaola.item;

public class PropertyEditPolicy {

	private String property_name_id; // 属性名ID

	private String input_type; // 输入控件类型: TEXT(1, "单行文本框"),TEXTAREA(2, "多行文本框"),SELECT(3, "下拉列表"),RADIO(4, "单选项"),CHECKBOX(5, "多选项"),FILE(6, "文件")

	private String desc; // 输入描述信息

	private int max_len; // 最大输入文字数

	private int is_multichoice; // 是否多选

	private int need_image; // 是否需要图片, 主要针对服装鞋帽类不同颜色

	private int is_necessary; // 是否必须

	public String getProperty_name_id() {
		return property_name_id;
	}

	public void setProperty_name_id(String property_name_id) {
		this.property_name_id = property_name_id;
	}

	public String getInput_type() {
		return input_type;
	}

	public void setInput_type(String input_type) {
		this.input_type = input_type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getMax_len() {
		return max_len;
	}

	public void setMax_len(int max_len) {
		this.max_len = max_len;
	}

	public int getIs_multichoice() {
		return is_multichoice;
	}

	public void setIs_multichoice(int is_multichoice) {
		this.is_multichoice = is_multichoice;
	}

	public int getNeed_image() {
		return need_image;
	}

	public void setNeed_image(int need_image) {
		this.need_image = need_image;
	}

	public int getIs_necessary() {
		return is_necessary;
	}

	public void setIs_necessary(int is_necessary) {
		this.is_necessary = is_necessary;
	}
}