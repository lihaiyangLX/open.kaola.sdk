package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * 根据状态查询商品信息
 * @author LiHaiyang
 * 2018年3月16日
 */
public class KaolaItemBatchStatusGetRequest extends KaolaRequest {

	private int item_edit_status; // 商品的状态 1, 待提交审核, 2, 审核中, 3, 审核未通过, 4, 待上架(审核已通过), 5, 在售, 6, 下架, 8, 强制下架 9.待修改

	private String date_type; // 1-商品创建时间；2-商品修改时间

	private String start_time; // 格式为yyyy-MM-dd HH:mm:ss

	private String end_time; // 格式为yyyy-MM-dd HH:mm:ss

	private int page_no; // 默认为1

	private int page_size; // 默认为20,最大为100

	public int getItem_edit_status() {
		return item_edit_status;
	}

	public void setItem_edit_status(int item_edit_status) {
		this.item_edit_status = item_edit_status;
	}

	public String getDate_type() {
		return date_type;
	}

	public void setDate_type(String date_type) {
		this.date_type = date_type;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public int getPage_no() {
		return page_no;
	}

	public void setPage_no(int page_no) {
		this.page_no = page_no;
	}

	public int getPage_size() {
		return page_size;
	}

	public void setPage_size(int page_size) {
		this.page_size = page_size;
	}

	public KaolaItemBatchStatusGetRequest() {
		super("kaola.item.batch.status.get", KaolaItemBatchStatusGetResponse.class);
	}

}