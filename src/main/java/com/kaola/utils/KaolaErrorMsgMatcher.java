package com.kaola.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 接口错误匹配类
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaErrorMsgMatcher {

	public static Map<String, String> skuStockUpdateErrorMap = new HashMap<>();

	static {

		skuStockUpdateErrorMap.put("illegal_param", "操作商品不存在[或 库存小于0]");
		skuStockUpdateErrorMap.put("Business_error_code", "入仓商家不可以修改库存");
		skuStockUpdateErrorMap.put("Sys_error_code", "设置库存失败[或 系统异常]");
		skuStockUpdateErrorMap.put("Sku_null", "不存在的sku");
		skuStockUpdateErrorMap.put("Stock_little_than_negative", "总库存不能小于冻结库存");
	}
}