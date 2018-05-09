package cn.item.test;

import org.junit.Before;

import com.kaola.utils.KaolaClient;

/**
 * 考拉接口测试基类
 * @author LiHaiyang
 * 2018年3月27日
 */
public abstract class KaolaCommBaseTester {

	protected final String KAOLA_TEST_OAUTH_URL = "http://oauth-test.kaola.com/oauth/authorize?response_type=token&client_id=edb6c3b9ac4847e7584c38e2b630b14f&redirect_uri=http://www.kaola.com&state=mycode";

	protected final String KAOLA_OAUTH_URL = "https://oauth.kaola.com/oauth/authorize?response_type=token&client_id=appKey&redirect_uri=http://www.kaola.com&state=mycode";

	protected final String KAOLA_CODE_TEST_URL = "http://oauth-test.kaola.com/oauth/authorize?response_type=code&client_id=edb6c3b9ac4847e7584c38e2b630b14f&redirect_uri=http://www.kaola.com&state=1212&type=101";

	protected final String KAOLA_CODE_URL = "https://oauth.kaola.com/oauth/authorize?response_type=code&client_id=edb6c3b9ac4847e7584c38e2b630b14f&redirect_uri=http://www.kaola.com&state=1212&type=101";

	protected final String TOKEN_OAUTH_URL = "https://oauth.kaola.com/oauth/token";

	protected final String KAOLA_TEST_API_URL = "http://openapi-test.kaola.com/router";

	protected final String KAOLA_API_URL = "https://openapi.kaola.com/router";

	protected final String app_key = "edb6c3b9ac4847e7584c38e2b630b14f";

	protected final String app_secret = "8200ee92ec22fcae76e2f00bc5c79247188e0593";

	protected final String redirect_uri = "http://www.kaola.com";

	protected String accessToken = "b6ee443b-cba6-4327-83ae-0de0afd58c95";

	protected KaolaClient client;

	@Before
	public void initClient() {

		if (client == null) {

			client = new KaolaClient(accessToken, app_key, app_secret, KAOLA_TEST_API_URL);
		}
	}
}