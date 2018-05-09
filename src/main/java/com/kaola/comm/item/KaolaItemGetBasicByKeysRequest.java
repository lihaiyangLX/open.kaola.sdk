package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * 批量查询商品，获取库存信息
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaItemGetBasicByKeysRequest extends KaolaRequest {

	public KaolaItemGetBasicByKeysRequest() {
		super("kaola.item.getBasicByKeys", KaolaItemGetBasicByKeysResponse.class);
	}

	private String item_key_list; // 商品的key，以逗号分隔；不能超过40个  示例值：10098-3049,10097-3049

	public String getItem_key_list() {
		return item_key_list;
	}

	public void setItem_key_list(String item_key_list) {
		this.item_key_list = item_key_list;
	}
}