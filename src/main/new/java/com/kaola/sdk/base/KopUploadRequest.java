package com.kaola.sdk.base;

import java.util.Map;

import com.kaola.base.FileItem;

/**
 * KopUploadRequest.java
 * @author LiHaiyang
 * 2018年5月23日
 */
public interface KopUploadRequest<T extends KopResponse> extends KopRequest<T> {
	public Map<String, FileItem> getFileParams();
}