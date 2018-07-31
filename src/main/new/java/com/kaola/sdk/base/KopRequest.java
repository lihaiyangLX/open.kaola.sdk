package com.kaola.sdk.base;

import java.util.Map;

/**
 * KaolaRequest.java
 * @author LiHaiyang
 * 2018年5月23日
 */
public interface KopRequest<T extends KopResponse> {

	public String getApiMethodName();

	public Map<String, String> getTextParams();

	public Long getTimestamp();

	public void setTimestamp(Long timestamp);

	public Class<T> getResponseClass();
}