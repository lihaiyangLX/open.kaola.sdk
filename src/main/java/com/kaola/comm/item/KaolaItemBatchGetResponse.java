package com.kaola.comm.item;

import com.kaola.item.ItemEdit;

/**
 * 批量获取商品结果
 * @author LiHaiyang
 * 2018年3月16日
 */
public class KaolaItemBatchGetResponse {

	private ItemEdit[] item_edit_list;

	public ItemEdit[] getItem_edit_list() {
		return item_edit_list;
	}

	public void setItem_edit_list(ItemEdit[] item_edit_list) {
		this.item_edit_list = item_edit_list;
	}
}
