package com.kaola.comm.item;

import java.math.BigDecimal;

import com.kaola.base.KaolaRequest;

/**
 * 修改指定SKU的销售价
 * @author LiHaiyang
 * 2018年3月19日
 */
// TODO 备注：若key和outer_id_list 同时填写，则已key 为准，两者必选其一
public class KaolaItemSkuSalePriceUpdateRequest extends KaolaRequest {

	private String key; // SKU的key

	private BigDecimal sale_price; // 销售价，最多支持两位小数(即精确到分)，如果输入的数字为3位以上小数，系统会自动四舍五入成2位小数.

	private String sku_outer_id; // Sku的outerid

	public KaolaItemSkuSalePriceUpdateRequest() {
		super("kaola.item.sku.sale.price.update", KaolaItemSkuSalePriceUpdateResponse.class);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public BigDecimal getSale_price() {
		return sale_price;
	}

	public void setSale_price(BigDecimal sale_price) {
		this.sale_price = sale_price;
	}

	public String getSku_outer_id() {
		return sku_outer_id;
	}

	public void setSku_outer_id(String sku_outer_id) {
		this.sku_outer_id = sku_outer_id;
	}
}