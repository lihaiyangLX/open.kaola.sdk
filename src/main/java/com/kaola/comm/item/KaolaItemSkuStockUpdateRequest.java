package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * 修改指定SKU的库存
 * @author LiHaiyang
 * 2018年3月19日
 */
// TODO 备注：若key和outer_id_list 同时填写，则已key 为准，两者必选其一
public class KaolaItemSkuStockUpdateRequest extends KaolaRequest {

	private String key; // Sku的key

	private int stock; // 库存数（可售库存+冻结库存）

	private String sku_outer_id; // sku的outerid

	public KaolaItemSkuStockUpdateRequest() {
		super("kaola.item.sku.stock.update", KaolaItemSkuStockUpdateResponse.class);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getSku_outer_id() {
		return sku_outer_id;
	}

	public void setSku_outer_id(String sku_outer_id) {
		this.sku_outer_id = sku_outer_id;
	}
}