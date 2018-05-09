package cn.item.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.kaola.comm.item.KaolaItemAddPartRequest;
import com.kaola.utils.ObjectFieldManager;
import com.kaola.utils.ValuesComposer;

/**
 * 类
 * @author LiHaiyang
 * 2018年3月20日
 */
public class ValuesComposerTest {

	@Test
	public void testWithValues() {

		KaolaItemAddPartRequest request = new KaolaItemAddPartRequest();

		Map<String, Object> valueMap = ObjectFieldManager.reader(request);

		String values = ValuesComposer.composeValues(valueMap, Arrays.asList("responseClass"), "=", "&", false);

		assertTrue(StringUtils.isNotBlank(values));
	}
}