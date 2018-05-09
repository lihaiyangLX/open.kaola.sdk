package cn.kaola.comm.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.kaola.comm.KaolaCommonTaxnosGetRequest;
import com.kaola.comm.KaolaCommonTaxnosGetResponse;
import com.kaola.comm.KaolaCommonUnitcodesGetRequest;
import com.kaola.comm.KaolaCommonUnitcodesGetResponse;
import com.soomey.util.JsonUtils;

import cn.item.test.KaolaCommBaseTester;

/**
 * COMM包下接口测试工具
 * @author LiHaiyang
 * 2018年3月27日
 */
public class KaolaCommTester extends KaolaCommBaseTester {

	@Test
	public void TestKaolaCommonUnitcodesGetRequest() {

		JsonNode result = client.excute(new KaolaCommonUnitcodesGetRequest());
		if (!result.has("error_response")) {

			KaolaCommonUnitcodesGetResponse response = (KaolaCommonUnitcodesGetResponse) JsonUtils.parse(result.toString(), new KaolaCommonUnitcodesGetRequest().getResponseClass());
			assertNotNull(response);
			assertTrue(StringUtils.isNotEmpty(JsonUtils.toJson(response).replace("{", "").replaceAll("}", "")));
		}
	}

//	@Test
	public void testTaxnosGetReqeust() {

		JsonNode result = client.excute(new KaolaCommonTaxnosGetRequest());
		if (!result.has("error_response")) {

			KaolaCommonTaxnosGetResponse response = (KaolaCommonTaxnosGetResponse) JsonUtils.parse(result.toString(), new KaolaCommonTaxnosGetRequest().getResponseClass());
			assertNotNull(response);
			assertTrue(StringUtils.isNotEmpty(JsonUtils.toJson(response).replace("{", "").replaceAll("}", "")));
		}
	}

//	@Test
	public void testTaxnosGdetReqeust() {

		JsonNode result = client.excute(new KaolaCommonTaxnosGetRequest());
		if (!result.has("error_response")) {

			KaolaCommonTaxnosGetResponse response = (KaolaCommonTaxnosGetResponse) JsonUtils.parse(result.toString(), new KaolaCommonTaxnosGetRequest().getResponseClass());
			assertNotNull(response);
			assertTrue(StringUtils.isNotEmpty(JsonUtils.toJson(response).replace("{", "").replaceAll("}", "")));
		}
	}
}