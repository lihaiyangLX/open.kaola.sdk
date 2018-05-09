package com.kaola.item;

import com.kaola.base.Item;

/**
 * 商品自定义属性
 * @author LiHaiyang
 * 2018年3月16日
 */
public class ItemTextProperty extends Item {

	private String prop_name_id; // 属性名id

	private String propn_name_cn; // 属性名中文

	private String text_value; // 属性对应的值(文本框的内容)

	public String getProp_name_id() {
		return prop_name_id;
	}

	public void setProp_name_id(String prop_name_id) {
		this.prop_name_id = prop_name_id;
	}

	public String getPropn_name_cn() {
		return propn_name_cn;
	}

	public void setPropn_name_cn(String propn_name_cn) {
		this.propn_name_cn = propn_name_cn;
	}

	public String getText_value() {
		return text_value;
	}

	public void setText_value(String text_value) {
		this.text_value = text_value;
	}
}