package com.kaola.sdk.base;

import java.io.Serializable;
import java.util.List;

/**
 * KopResponse.java
 * @author LiHaiyang
 * 2018年5月23日
 */
public abstract class KopResponse implements Serializable {

	private static final long serialVersionUID = Long.MAX_VALUE;

	private String code;

	private String msg;

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private List<SubError> subErrors;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<SubError> getSubErrors() {
		return subErrors;
	}

	public void setSubErrors(List<SubError> subErrors) {
		this.subErrors = subErrors;
	}
}