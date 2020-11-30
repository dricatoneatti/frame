package support;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	BaseTest baseTest = new BaseTest();
	PropertiesManager prop = new PropertiesManager();

	@Before(value = "@web")
	public void beforeWeb() {
		baseTest.getChrome(this.prop.getPropWeb("urlTeste"));
	}

	@After(value = "@web")
	public void afterWeb() {
		baseTest.tearDown();
	}

}
