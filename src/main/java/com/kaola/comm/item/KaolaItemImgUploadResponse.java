package com.kaola.comm.item;


/**
 * 图片上传结果
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaItemImgUploadResponse {

	private boolean result;

	private String url;

	private String created;

	public boolean isResult() {
		return result;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}