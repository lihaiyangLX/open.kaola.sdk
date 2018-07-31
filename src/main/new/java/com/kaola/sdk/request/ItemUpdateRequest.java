package com.kaola.sdk.request;

import java.util.Map;

import com.kaola.sdk.base.KopRequest;
import com.kaola.sdk.response.ItemUpdateResponse;
import com.kaola.utils.ObjectFieldManager;

/**
 * ItemUpdateRequest.java
 * @author LiHaiyang
 * 2018年5月25日
 */
public class ItemUpdateRequest implements KopRequest<ItemUpdateResponse> {

	private String description;

	private String image_urls;

	private String key; // 商品key

	@Override
	public String getApiMethodName() {
		return "kaola.item.update";
	}

	@Override
	public Map<String, String> getTextParams() {
		return ObjectFieldManager.StringMapReader(this);
	}

	@Override
	public Long getTimestamp() {
		return System.currentTimeMillis();
	}

	@Override
	public void setTimestamp(Long timestamp) {
	}

	@Override
	public Class<ItemUpdateResponse> getResponseClass() {
		return ItemUpdateResponse.class;
	}

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