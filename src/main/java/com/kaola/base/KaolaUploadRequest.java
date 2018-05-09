package com.kaola.base;

import java.util.HashMap;
import java.util.Map;

/**
 * 类
 * @author LiHaiyang
 * 2018年3月30日
 */
public class KaolaUploadRequest extends KaolaRequest {

	public KaolaUploadRequest(String method, Class<?> responseClass) {
		super(method, responseClass);
	}

	protected FileItem image;

	public FileItem getImage() {
		return image;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public Map<String, FileItem> getFileParams() {

		Map<String, FileItem> map = new HashMap<String, FileItem>();
		map.put("pic", image);
		return map;
	}
}