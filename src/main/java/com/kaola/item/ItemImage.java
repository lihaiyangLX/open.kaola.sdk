package com.kaola.item;

import com.kaola.base.Item;

public class ItemImage extends Item {

	private String image_url; // 图片url

	private String image_type; // MAIN(1, "商品主图片"), APP(2, "APP标示"),TMT(3, "透明图"),LONG(4, "长图");

	private int order_value; // 顺序

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getImage_type() {
		return image_type;
	}

	public void setImage_type(String image_type) {
		this.image_type = image_type;
	}

	public int getOrder_value() {
		return order_value;
	}

	public void setOrder_value(int order_value) {
		this.order_value = order_value;
	}
}