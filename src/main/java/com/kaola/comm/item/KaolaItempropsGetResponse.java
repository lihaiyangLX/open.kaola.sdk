package com.kaola.comm.item;

import java.util.List;

import com.kaola.item.PropertyCategory;

/**
 * 商品类目属性结果
 * @author LiHaiyang
 * @date 2018年4月10日
 */
public class KaolaItempropsGetResponse {

	private List<PropertyCategory> property_category_list;

	public List<PropertyCategory> getProperty_category_list() {
		return property_category_list;
	}

	public void setProperty_category_list(
			List<PropertyCategory> property_category_list) {
		this.property_category_list = property_category_list;
	}
}