package com.kaola.sdk.base;

/**
 * KaolaClient.java
 * @author LiHaiyang
 * 2018年5月23日
 */
public interface KaolaClient {

	public <T extends KopResponse> T execute(KopRequest<T> request);
}
