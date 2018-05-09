package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * 商品修改
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaItemUpdateRequest extends KaolaRequest {

	public KaolaItemUpdateRequest() {
		super("kaola.item.update", KaolaItemUpdateResponse.class);
	}

	private String description;

	private String image_urls;

	private String key; // 商品key

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage_urls() {
		return image_urls;
	}

	public void setImage_urls(String image_urls) {
		this.image_urls = image_urls;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}