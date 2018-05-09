package com.kaola.item;
/**
 * sku的id对照关系
 * @author LiHaiyang
 * 2018年3月19日
 */
public class SkuOuterIdResult {

	private String sku_key; // 新增的sku的key

	private String sku_outer_id; // 创建商品传入的外键id

	public String getSku_key() {
		return sku_key;
	}

	public void setSku_key(String sku_key) {
		this.sku_key = sku_key;
	}

	public String getSku_outer_id() {
		return sku_outer_id;
	}

	public void setSku_outer_id(String sku_outer_id) {
		this.sku_outer_id = sku_outer_id;
	}
}