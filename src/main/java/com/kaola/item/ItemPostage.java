package com.kaola.item;

import java.math.BigDecimal;

import com.kaola.base.Item;

/**
 * 运费信息
 * @author LiHaiyang
 * 2018年3月16日
 */
public class ItemPostage extends Item {

	private int is_postage_free; // 是否免邮1：免邮0：不免邮

	private BigDecimal post_fee; // 平邮邮费

	private BigDecimal express_fee; // 快递邮费

	private BigDecimal ems_fee; // Ems邮费

	private String postage_template_id; // 运费模板id

	public int getIs_postage_free() {
		return is_postage_free;
	}

	public void setIs_postage_free(int is_postage_free) {
		this.is_postage_free = is_postage_free;
	}

	public BigDecimal getPost_fee() {
		return post_fee;
	}

	public void setPost_fee(BigDecimal post_fee) {
		this.post_fee = post_fee;
	}

	public BigDecimal getExpress_fee() {
		return express_fee;
	}

	public void setExpress_fee(BigDecimal express_fee) {
		this.express_fee = express_fee;
	}

	public BigDecimal getEms_fee() {
		return ems_fee;
	}

	public void setEms_fee(BigDecimal ems_fee) {
		this.ems_fee = ems_fee;
	}

	public String getPostage_template_id() {
		return postage_template_id;
	}

	public void setPostage_template_id(String postage_template_id) {
		this.postage_template_id = postage_template_id;
	}
}