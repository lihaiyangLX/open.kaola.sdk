package cn.kaola.comm.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import cn.item.test.KaolaCommBaseTester;

import com.fasterxml.jackson.databind.JsonNode;
import com.kaola.comm.KaolaCommonCountriesGetRequest;
import com.kaola.comm.vender.KaolaVenderBrandGetRequest;
import com.kaola.comm.vender.KaolaVenderBrandGetResponse;
import com.kaola.comm.vender.KaolaVenderCategoryGetRequest;
import com.kaola.comm.vender.KaolaVenderCategoryGetResponse;
import com.kaola.comm.vender.KaolaVenderInfoGetRequest;
import com.kaola.comm.vender.KaolaVenderInfoGetResponse;
import com.soomey.util.JsonUtils;

/**
 * vender接口测试工具
 * @author LiHaiyang
 * 2018年3月27日
 */
public class KaolaCommVenderTester extends KaolaCommBaseTester {

	@Test
	public void testGetCategory() {

		JsonNode result = null;

		result = client.excute(new KaolaVenderCategoryGetRequest());
		if (!result.has("error_response")) {

			KaolaVenderCategoryGetResponse response = (KaolaVenderCategoryGetResponse) JsonUtils.parse(result.toString().toLowerCase(), new KaolaVenderCategoryGetRequest().getResponseClass());
			assertNotNull(response);
			assertTrue(StringUtils.isNotEmpty(JsonUtils.toJson(response).replace("{", "").replaceAll("}", "")));
		}
	}

	@Test
	public void testGetBrand() {

		JsonNode result = null;
		result = client.excute(new KaolaVenderBrandGetRequest());
		if (!result.has("error_response")) {

			KaolaVenderBrandGetResponse response = (KaolaVenderBrandGetResponse) JsonUtils.parse(result.toString(), new KaolaVenderBrandGetRequest().getResponseClass());
			assertNotNull(response);
			assertTrue(StringUtils.isNotEmpty(JsonUtils.toJson(response).replace("{", "").replaceAll("}", "")));
		}
	}

	@Test
	public void testVenderInfo() {

		JsonNode result = client.excute(new KaolaVenderInfoGetRequest());
		if (!result.has("error_response")) {

			KaolaVenderInfoGetResponse response = (KaolaVenderInfoGetResponse) JsonUtils.parse(result.toString(), new KaolaVenderInfoGetRequest().getResponseClass());
			assertNotNull(response);
			assertTrue(StringUtils.isNotEmpty(JsonUtils.toJson(response).replace("{", "").replaceAll("}", "")));
		}
	}

	@Test
	public void testCountries() {

		JsonNode result = client.excute(new KaolaCommonCountriesGetRequest());
		System.out.println(result);
	}
}