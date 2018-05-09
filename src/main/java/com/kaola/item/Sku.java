package com.kaola.item;

/**
 * Sku
 * @author LiHaiyang
 * 2018年3月16日
 */
public class Sku {

	private RawSku raw_sku; // SKU基本信息

	private SkuProperty[] sku_property_list; // SKU属性列表

	private String key; // SKU 的key

	private int seq; // Sku 序列号

	private String sku_custom_property_list; // 商家自定义属性

	public RawSku getRaw_sku() {
		return raw_sku;
	}

	public void setRaw_sku(RawSku raw_sku) {
		this.raw_sku = raw_sku;
	}

	public SkuProperty[] getSku_property_list() {
		return sku_property_list;
	}

	public void setSku_property_list(SkuProperty[] sku_property_list) {
		this.sku_property_list = sku_property_list;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getSku_custom_property_list() {
		return sku_custom_property_list;
	}

	public void setSku_custom_property_list(String sku_custom_property_list) {
		this.sku_custom_property_list = sku_custom_property_list;
	}
}
