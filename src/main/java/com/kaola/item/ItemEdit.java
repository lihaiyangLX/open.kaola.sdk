package com.kaola.item;
/**
 * 类
 * @author LiHaiyang
 * 2018年3月16日
 */
public class ItemEdit {

	private RawItemEdit raw_item_edit; // 商品的基本信息

	private String key; // 商品的key

	private ItemCategory[] item_category_list; // 商品类目信息

	private ItemProperty[] item_property_list; // 商品预定义属性

	private ItemTextProperty[] item_text_property_list; // 商品自定义属性

	private Sku[] sku_list; // 商品包含的SKU

	private ItemImage[] item_image_list; // 商品图片

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

	public ItemCategory[] getItem_category_list() {
		return item_category_list;
	}

	public void setItem_category_list(ItemCategory[] item_category_list) {
		this.item_category_list = item_category_list;
	}

	public ItemProperty[] getItem_property_list() {
		return item_property_list;
	}

	public void setItem_property_list(ItemProperty[] item_property_list) {
		this.item_property_list = item_property_list;
	}

	public ItemTextProperty[] getItem_text_property_list() {
		return item_text_property_list;
	}

	public void setItem_text_property_list(
			ItemTextProperty[] item_text_property_list) {
		this.item_text_property_list = item_text_property_list;
	}

	public Sku[] getSku_list() {
		return sku_list;
	}

	public void setSku_list(Sku[] sku_list) {
		this.sku_list = sku_list;
	}

	public ItemImage[] getItem_image_list() {
		return item_image_list;
	}

	public void setItem_image_list(ItemImage[] item_image_list) {
		this.item_image_list = item_image_list;
	}
}