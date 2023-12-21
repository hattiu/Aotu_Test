package TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import Common.CommonFunction;
import Common.Constant;
import Interface.Interface_Home;
import Interface.Interface_Login;

public class Login {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule public TestName name = new TestName();
	
	@Before
	public void setUp() throws Exception {
		driver = CommonFunction.initWebDriver(Constant.BASE_URL1);
		CommonFunction.clickItem(driver, Interface_Home.LOGIN_BTN_XPATH);
	}
			
	@After
	public void tearDown() throws Exception {
		testcase = name.getMethodName();
		CommonFunction.captureScreen(driver, folder, testcase);
		CommonFunction.shutDownDriver(driver);
	}

	@Test
	public void FUNC_02_01() throws Exception {
		 Interface_Login.login(driver, Constant.EMPTY, Constant.BASE_PASSWORD, Constant.EMPTY);
	}

	@Test
	public void FUNC_02_02() throws Exception {
		 Interface_Login.login(driver, Constant.FULL_SPACE, Constant.BASE_PASSWORD, Interface_Login.INCORRECT_INFO_MSG);
	}

	@Test
	public void FUNC_02_03() throws Exception {
		 Interface_Login.login(driver, Constant.INVALID_EMAIL, Constant.BASE_PASSWORD, Interface_Login.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_02_04() throws Exception {
		 Interface_Login.login(driver, " " + Constant.BASE_EMAIL + " ", Constant.BASE_PASSWORD, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_02_05() throws Exception {
		 Interface_Login.login(driver, Constant.INVALID_SPACE_EMAIL, Constant.BASE_PASSWORD, Interface_Login.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_02_06() throws Exception {
		 Interface_Login.login(driver, Constant.INVALID_SPECIAL_EMAIL, Constant.BASE_PASSWORD, Interface_Login.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_02_07() throws Exception {
		 Interface_Login.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_02_08() throws Exception {
		 Interface_Login.login(driver, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD, Interface_Login.INCORRECT_INFO_MSG);
	}
	
	@Test
	public void FUNC_02_09() throws Exception {
		 Interface_Login.login(driver, Constant.BASE_EMAIL, Constant.EMPTY, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_02_10() throws Exception {
		 Interface_Login.login(driver, Constant.BASE_EMAIL, Constant.FULL_SPACE, Interface_Login.INCORRECT_INFO_MSG);
	}
	
	@Test
	public void FUNC_02_11() throws Exception {
		 Interface_Login.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD + "1234", Interface_Login.INCORRECT_INFO_MSG);
	}
	
	@Test
	public void FUNC_02_12() throws Exception {
		 Interface_Login.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD, Constant.EMPTY);
	}
}
