package com.kaola.comm.item;

import com.kaola.base.ItemBasic;

/**
 * 批量查询商品，获取库存信息结果
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaItemGetBasicByKeysResponse {

	private ItemBasic[] item_list;

	public ItemBasic[] getItem_list() {
		return item_list;
	}

	public void setItem_list(ItemBasic[] item_list) {
		this.item_list = item_list;
	}
}