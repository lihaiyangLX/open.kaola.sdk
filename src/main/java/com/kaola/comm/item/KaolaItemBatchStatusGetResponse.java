package com.kaola.comm.item;

import com.kaola.item.ItemEdit;

/**
 * 根据状态获取商品信息结果
 * @author LiHaiyang
 * 2018年3月16日
 */
public class KaolaItemBatchStatusGetResponse {

	private ItemEdit[] item_edit_list; // 满足条件的商品集合

	private int total_count; // 满足条件的商品总数

	public ItemEdit[] getItem_edit_list() {
		return item_edit_list;
	}

	public void setItem_edit_list(ItemEdit[] item_edit_list) {
		this.item_edit_list = item_edit_list;
	}

	public int getTotal_count() {
		return total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}
}