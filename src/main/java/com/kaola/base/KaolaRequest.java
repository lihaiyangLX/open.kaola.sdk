package com.kaola.base;

public abstract class KaolaRequest {

	private String method;

	private Class<?> responseClass;

	public KaolaRequest(String method, Class<?> responseClass) {

		this.method = method;
		this.responseClass = responseClass;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Class<?> getResponseClass() {
		return responseClass;
	}

	public void setResponseClass(Class<?> responseClass) {
		this.responseClass = responseClass;
	}
}