package com.kaola.base;
/**
 * Item基类
 * @author LiHaiyang
 * 2018年3月16日
 */
public class Item {

	private Long id; // 主键

	private Long item_id; // 商品id

	private Long business_id; // 商家id

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public Long getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(Long business_id) {
		this.business_id = business_id;
	}
}