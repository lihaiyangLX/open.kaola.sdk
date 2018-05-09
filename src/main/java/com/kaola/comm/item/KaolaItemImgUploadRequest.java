package com.kaola.comm.item;

import com.kaola.base.FileItem;
import com.kaola.base.KaolaUploadRequest;

/**
 * 图片上传
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaItemImgUploadRequest extends KaolaUploadRequest {

	public KaolaItemImgUploadRequest(FileItem image) {
		super("kaola.item.img.upload", KaolaItemImgUploadResponse.class);
		this.image = image;
	}
}