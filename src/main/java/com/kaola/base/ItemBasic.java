package com.kaola.base;

import java.util.List;

/**
 * 商品的基本信息
 * @author LiHaiyang
 * 2018年3月19日
 */
public class ItemBasic {

	private int id; // 商品id

	private String name; // 商品名称

	private String item_no; // 商品货号

	private int item_status; // 商品状态

	private String item_key; // 商品key

	private List<SkuBasic> sku_list; // SKU基本信息列表

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItem_no() {
		return item_no;
	}

	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}

	public int getItem_status() {
		return item_status;
	}

	public void setItem_status(int item_status) {
		this.item_status = item_status;
	}

	public String getItem_key() {
		return item_key;
	}

	public void setItem_key(String item_key) {
		this.item_key = item_key;
	}

	public List<SkuBasic> getSku_list() {
		return sku_list;
	}

	public void setSku_list(List<SkuBasic> sku_list) {
		this.sku_list = sku_list;
	}
}