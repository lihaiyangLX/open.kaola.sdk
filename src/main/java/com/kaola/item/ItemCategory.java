package com.kaola.item;

import com.kaola.base.Item;

public class ItemCategory extends Item {

	private Long category_id; // 类目id

	private Long rank; // 商品类目的rank

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}
}