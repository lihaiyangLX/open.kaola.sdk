package com.kaola.item;

import java.util.ArrayList;
import java.util.List;

/**
 * 类
 * @author LiHaiyang
 * 2018年3月16日
 */
public class ItemEdit {

	private RawItemEdit raw_item_edit; // 商品的基本信息

	private String key; // 商品的key

	private List<ItemCategory> item_category_list = new ArrayList<>(); // 商品类目信息

	private List<ItemProperty> item_property_list = new ArrayList<>(); // 商品预定义属性

	private List<ItemTextProperty> item_text_property_list = new ArrayList<>(); // 商品自定义属性

	private List<Sku> sku_list = new ArrayList<>(); // 商品包含的SKU

	private List<ItemImage> item_image_list = new ArrayList<>(); // 商品图片

	private ItemPostage item_postage; // 运费信息

	private String hide_add_to_cart; // 是否隐藏加入购物车（只允许直接购买），0：不隐藏，1：隐藏

	public RawItemEdit getRaw_item_edit() {
		return raw_item_edit;
	}

	public void setRaw_item_edit(RawItemEdit raw_item_edit) {
		this.raw_item_edit = raw_item_edit;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getHide_add_to_cart() {
		return hide_add_to_cart;
	}

	public List<ItemCategory> getItem_category_list() {
		return item_category_list;
	}

	public void setItem_category_list(List<ItemCategory> item_category_list) {
		this.item_category_list = item_category_list;
	}

	public List<ItemProperty> getItem_property_list() {
		return item_property_list;
	}

	public void setItem_property_list(List<ItemProperty> item_property_list) {
		this.item_property_list = item_property_list;
	}

	public List<ItemTextProperty> getItem_text_property_list() {
		return item_text_property_list;
	}

	public void setItem_text_property_list(
			List<ItemTextProperty> item_text_property_list) {
		this.item_text_property_list = item_text_property_list;
	}

	public List<Sku> getSku_list() {
		return sku_list;
	}

	public void setSku_list(List<Sku> sku_list) {
		this.sku_list = sku_list;
	}

	public List<ItemImage> getItem_image_list() {
		return item_image_list;
	}

	public void setItem_image_list(List<ItemImage> item_image_list) {
		this.item_image_list = item_image_list;
	}

	public void setHide_add_to_cart(String hide_add_to_cart) {
		this.hide_add_to_cart = hide_add_to_cart;
	}

	public ItemPostage getItem_postage() {
		return item_postage;
	}

	public void setItem_postage(ItemPostage item_postage) {
		this.item_postage = item_postage;
	}
}