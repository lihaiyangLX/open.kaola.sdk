package com.kaola.sdk.response;

import com.kaola.sdk.base.KopResponse;

/**
 * ItemUpdateResponse.java
 * @author LiHaiyang
 * 2018年5月25日
 */
public class ItemUpdateResponse extends KopResponse {

	private static final long serialVersionUID = 1L;

	private boolean result; // 1:成功 0:失败

	private String message; // TODO 文档喂Message

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
}