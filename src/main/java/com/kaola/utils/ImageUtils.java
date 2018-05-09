package com.kaola.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

/**
 * 图片工具
 * @author LiHaiyang
 * 2018年3月27日
 */
public class ImageUtils {

	public static byte[] getImageBytes(String path) throws IOException {

		return IOUtils.toByteArray(new FileInputStream(new File(path)));
	}
}