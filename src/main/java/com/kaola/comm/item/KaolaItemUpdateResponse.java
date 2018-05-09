package com.kaola.comm.item;

/**
 * 商品修改结果
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaItemUpdateResponse {

	private int result; // 1:成功 0:失败

	private String message; // TODO 文档喂Message

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}