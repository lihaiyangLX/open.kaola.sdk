package com.kaola.comm.vender;

import java.util.List;

import com.kaola.base.Category;

/**
 * 获取商家类目结果
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaVenderCategoryGetResponse {

	private List<Category> item_cats;

	public List<Category> getItem_cats() {
		return item_cats;
	}

	public void setItem_cats(List<Category> item_cats) {
		this.item_cats = item_cats;
	}
}