package com.kaola.item;

/**
 * 类目和属性对应信息
 * @author LiHaiyang
 *
 */
public class RawPropertyCategory {

	private String property_name_id; // 属性名id

	private Long category_id; //末级节点类目

	public String getProperty_name_id() {
		return property_name_id;
	}

	public void setProperty_name_id(String property_name_id) {
		this.property_name_id = property_name_id;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
}