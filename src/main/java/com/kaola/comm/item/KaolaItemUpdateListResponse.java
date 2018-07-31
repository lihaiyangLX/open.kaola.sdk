package com.kaola.comm.item;

import java.util.Date;

/**
 * KaolaItemUpdateList.java
 * @author LiHaiyang
 * 2018年5月25日
 */
public class KaolaItemUpdateListResponse {

	private int result;

	private Date listing_time;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public Date getListing_time() {
		return listing_time;
	}

	public void setListing_time(Date listing_time) {
		this.listing_time = listing_time;
	}
}