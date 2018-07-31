package cn.kaola.comm.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import cn.item.test.KaolaCommBaseTester;

import com.fasterxml.jackson.databind.JsonNode;
import com.kaola.base.FileItem;
import com.kaola.comm.item.KaolaItemAddPartRequest;
import com.kaola.comm.item.KaolaItemImgUploadRequest;
import com.kaola.comm.item.KaolaItemImgUploadResponse;
import com.kaola.comm.item.KaolaItempropsGetRequest;
import com.kaola.comm.item.KaolaItempropsGetResponse;
import com.kaola.utils.ObjectFieldManager;
import com.soomey.util.JsonUtils;

/**
 * 考拉商品相关接口测试工具
 * @author LiHaiyang
 * 2018年3月27日
 */
public class KaolaCommItemTester extends KaolaCommBaseTester {

	private final String TEST_IMAGE_PATH = "C:/Users/super_L/Desktop/1688/testPictureUpload1.jpg";// 图片本地地址

	@Test
	public void test_imageUpload() throws IOException {

		KaolaItemImgUploadRequest request = new KaolaItemImgUploadRequest(new FileItem(TEST_IMAGE_PATH));

		JsonNode result = client.executeUpload(request);
		System.out.println(result);
		KaolaItemImgUploadResponse response = JsonUtils.parse(result.toString(), KaolaItemImgUploadResponse.class);
		assertTrue(StringUtils.isNotBlank(response.getUrl()));
	}

//	@Test
	public void test_addItem() throws NumberFormatException, InstantiationException, IllegalAccessException {

		KaolaItemAddPartRequest request = createAddPart();
		System.out.println(JsonUtils.toJson(request));
	}

//	@Test
	public void testGetCategory() {

		KaolaItempropsGetRequest request = new KaolaItempropsGetRequest();
		request.setCategory_id(29307L);
		JsonNode result = client.execute(request);
		KaolaItempropsGetResponse response = (KaolaItempropsGetResponse) JsonUtils.parse(result.toString(), request.getResponseClass());
		System.out.println(JsonUtils.toJson(response));
		System.out.println(result);
		System.out.println(JsonUtils.toJson(response.getProperty_category_list().get(0)));
	}

	private KaolaItemAddPartRequest createAddPart() {

		return (KaolaItemAddPartRequest) ObjectFieldManager.pushValues(new KaolaItemAddPartRequest(), getTextParams());
	}

	public Map<Object, Object> getTextParams() {

		Map<Object, Object> params = new HashMap<Object, Object>();
//		params.put("userId", "4661");
//		params.put("businessId", "4661");
		long now = System.currentTimeMillis();
		params.put("name", "单元测试商品" + now);
		params.put("sub_title", "单元测试商品"+ now);
		params.put("short_title", "单元测试商品" + now);
		params.put("ten_words_desc", "单元测试商品" + now);
		params.put("item_NO", "" + now);
		params.put("brand_id", 1002L);
		params.put("original_country_code_id", "303");
		params.put("consign_area", "浙江杭州市");
		params.put("consign_areaId", "120000-120100");
		params.put("description", "<img src=\"http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84\">");
		params.put("category_id", 3635L);
		params.put("property_valueId_list", "54216|48974");
		params.put("text_property_name_id", "826^xxxxxxxxxx");
		params.put("image_urls", "http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84^1|http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84^2|http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84^2");
		params.put("sku_market_prices", "1101|1102|1103|1104|1105|1106|1107|1108|1109|1110|1111|1112");
		params.put("sku_sale_prices", "101|102|103|104|105|106|107|108|109|110|111|112");
		params.put("sku_barcode", now + "1|" +now+"2|" + now + "3|"+ now + "4|"+ now + "5|"+ now + "6|"+ now + "7|"+ now + "8|"+ now + "9|"+ now + "10|"+ now + "11|"+ now + "12");
		params.put("sku_stock", "101|102|103|104|105|106|107|108|109|110|111|112");
		//params.put("sku_property_value", "47642^http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84,47645|47647^http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84,47688|47705^http://paopao.nosdn.127.net/2a32bfd5-0be7-440c-adeb-194ecce8bb84,47706");
		params.put("sku_property_value", "47905,54451,47910|47905,54451,47911|47905,54452,47910|47905,54452,47911|"+
				"47906,54451,47910|47906,54451,47911|47906,54452,47910|47906,54452,47911|"+
				"54456,54451,47910|54456,54451,47911|54456,54452,47910|54456,54452,47911");
		
		return params;
	}
}