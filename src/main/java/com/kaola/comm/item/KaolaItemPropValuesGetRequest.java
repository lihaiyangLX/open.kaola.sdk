package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * 获取标准商品类目属性的值
 * @author LiHaiyang
 * 2018年3月16日
 */
public class KaolaItemPropValuesGetRequest extends KaolaRequest {

	public KaolaItemPropValuesGetRequest() {
		super("kaola.itempropvalues.get", KaolaItemPropValuesGetResponse.class);
	}

	private String property_value_id;

	public String getProperty_value_id() {
		return property_value_id;
	}

	public void setProperty_value_id(String property_value_id) {
		this.property_value_id = property_value_id;
	}
}