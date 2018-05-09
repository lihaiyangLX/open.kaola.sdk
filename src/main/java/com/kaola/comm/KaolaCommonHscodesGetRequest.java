package com.kaola.comm;

import com.kaola.base.KaolaRequest;

/**
 * 考拉hscodes获取接口
 * @author LiHaiyang
 * 2018年4月17日
 */
public class KaolaCommonHscodesGetRequest extends KaolaRequest {

	public KaolaCommonHscodesGetRequest() {
		super("kaola.common.hscodes.get", KaolaCommonHscodesGetResponse.class);
	}

	private String keyword;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}