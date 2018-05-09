package cn.item.test;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

import com.kaola.base.TaxNo;
import com.kaola.utils.ObjectFieldManager;

public class TestForFields {

	@Test
	public void testFieldReaderWithNullValueObject() {

		Map<String, Object> valuesMap = ObjectFieldManager.reader(new TaxNo());
		assertThat(valuesMap.keySet(), hasSize(2));
		valuesMap.values().forEach(value -> assertTrue(value == null));
	}

	@Test
	public void testFieldReaderWithValue() {

		TaxNo no = new TaxNo();
		no.setTax_no("tax_no");
		no.setTax_scope("scope");

		Map<String, Object> valueMap = ObjectFieldManager.reader(no);
		valueMap.entrySet().forEach(entry -> {

			if ("tax_no".equalsIgnoreCase(entry.getKey())) {

				assertEquals("tax_no", entry.getValue());
			} else {

				assertEquals("scope", entry.getValue());
			}
		});
	}
}