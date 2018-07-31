package cn.item.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.kaola.sdk.base.DefaultKaolaClient;
import com.kaola.sdk.request.ItemAddRequest;
import com.kaola.sdk.response.ItemAddResponse;
import com.kaola.utils.ObjectFieldManager;
import com.soomey.util.JsonUtils;

/**
 * ItemAddTest.java
 * @author LiHaiyang
 * 2018年5月23日
 */
public class ItemAddTest {

	@Test
	public void test() {

//		String serverUrl = "http://localhost:8020/router";
//		String serverUrl = "http://10.165.124.39:8184/router";
		String serverUrl = "https://openapi.kaola.com/router";
		String accessToken = "a2d50342-d6c9-4bff-9329-ab289904cf68";
		String appKey = "3526616f2ecf2beeceac7f7a940dce41";
		String appSecret = "afab22a1e6124bbd93179adb37188fe5a9cdbc5d78dc1631be2d6a4efc896c83";
		DefaultKaolaClient client = new DefaultKaolaClient(serverUrl, accessToken, appKey, appSecret);

		ItemAddRequest request = (ItemAddRequest) ObjectFieldManager.pushValues(new ItemAddRequest(), createAddItemRequest());
		System.out.println(JsonUtils.toJson(request));
		ItemAddResponse response = client.execute(request);
		System.out.println(JsonUtils.toJson(response));
	}

	private Map<Object, Object> createAddItemRequest() {

		Map<Object, Object> params = new HashMap<Object, Object>();
//		params.put("userId", "4661");
//		params.put("businessId", "4661");
//		params.put("consign_area", "浙江杭州市");
//		params.put("consign_areaId", "120000-120100");
		long now = System.currentTimeMillis();
		params.put("name", "单元测试商品" + now);
		params.put("sub_title", "单元测试商品"+ now);
		params.put("short_title", "单元测试商品" + now);
		params.put("ten_words_desc", "单元测试商品" + now);
		params.put("item_NO", "" + now);
		params.put("brand_id", 4321L);
		params.put("original_country_code_id", "303");
		params.put("description", "<img src=\"http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84\">");
		params.put("category_id", 1659L);
		params.put("property_valueId_list", "1004194|1008353|3748356|3749824|1004179|5138940|1004167|1008212|1005336|1003410|1003222|3752632|3748633|1003035|1004169");
		params.put("text_property_name_id", "100252^丙纶|100255^刺绣/绣花");
		params.put("image_urls", "http://pop.nosdn.127.net/e1d9bcbd-3e70-469a-b5c0-7c33d31fcd67^1|http://pop.nosdn.127.net/f556a5f6-4714-4e1b-a083-97275fd738ba^1|http://pop.nosdn.127.net/f973caf5-4f99-4469-8313-376d38cb4c88^1|http://pop.nosdn.127.net/c0dd8434-5bf8-4f3a-90ee-1154bab9b8e7^1|http://pop.nosdn.127.net/c1d00856-e6a8-4fb9-b307-d6314f1d14ce^1|http://pop.nosdn.127.net/ded79cc2-26aa-403a-8052-0f2129d1b071^1|http://pop.nosdn.127.net/d10c7834-39a6-4f0e-991f-fcb7988c3aa2^1|http://pop.nosdn.127.net/e1d9bcbd-3e70-469a-b5c0-7c33d31fcd67^2");
//		params.put("sku_property_value", "100231:1001338:黄色:http://pop.nosdn.127.net/e1d9bcbd-3e70-469a-b5c0-7c33d31fcd67;100251:1003410:S");
//		params.put("sku_market_prices", "454.00");
//		params.put("sku_sale_prices", "454.00");
//		params.put("sku_barcode", "TEST123HY");
//		params.put("sku_stock", "4");
		params.put("item_outer_id", ("4321" + now).hashCode() + "4321");
//		params.put("sku_outer_id", ("4321" + now).hashCode() + "sku".hashCode() + "4321");
		
//		params.put("sku_property_value", "47905,54451,47910|47905,54451,47911|47905,54452,47910|47905,54452,47911|"+
//				"47906,54451,47910|47906,54451,47911|47906,54452,47910|47906,54452,47911|"+
//				"54456,54451,47910|54456,54451,47911|54456,54452,47910|54456,54452,47911");

		//params.put("sku_property_value", "47642^http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84,47645|47647^http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84,47688|47705^http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84,47706");
//		params.put("sku_property_value", "100231:1001338:黄色:http://pop.nosdn.127.net/e1d9bcbd-3e70-469a-b5c0-7c33d31fcd67;100251:1003410:S");

//		params.put("sku_property_value", "100251:1003410:S;100231:1001338:黄色:http://pop.nosdn.127.net/e1d9bcbd-3e70-469a-b5c0-7c33d31fcd67|100251:1003400:M;100231:1001338:黄色:http://pop.nosdn.127.net/e1d9bcbd-3e70-469a-b5c0-7c33d31fcd67|100251:1003399:L;100231:1001338:黄色:http://pop.nosdn.127.net/e1d9bcbd-3e70-469a-b5c0-7c33d31fcd67|100251:1003410:S;100231:1002224:翡翠绿:http://pop.nosdn.127.net/c1d00856-e6a8-4fb9-b307-d6314f1d14ce|100251:1003400:M;100231:1002224:翡翠绿:http://pop.nosdn.127.net/c1d00856-e6a8-4fb9-b307-d6314f1d14ce|100251:1003399:L;100231:1002224:翡翠绿:http://pop.nosdn.127.net/c1d00856-e6a8-4fb9-b307-d6314f1d14ce");
		params.put("gross_weight", "1");
		
		return params;
	}
}