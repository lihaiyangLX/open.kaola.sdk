package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * 设置是否隐藏加入购物车
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaItemHidecartUpdateRequest extends KaolaRequest {

	public KaolaItemHidecartUpdateRequest() {
		super("kaola.item.hidecart.update", KaolaItemHidecartUpdateResponse.class);
	}

	private String key; // 商品key

	private int hide_add_to_cart; // 是否隐藏加入购物车（只允许直接购买），0：不隐藏，1：隐藏

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getHide_add_to_cart() {
		return hide_add_to_cart;
	}

	public void setHide_add_to_cart(int hide_add_to_cart) {
		this.hide_add_to_cart = hide_add_to_cart;
	}
}