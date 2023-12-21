package TestSuite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import Common.CommonFunction;
import Common.Constant;
import Interface.Interface_Home;
import Interface.Interface_Login;
import Interface.Interface_CreateAccount;

public class CreateAccount {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule
	public TestName name = new TestName();

	@BeforeClass
	public static void setUp() throws Exception {
		driver = CommonFunction.initWebDriver(Constant.BASE_URL1);
	}
	
	@Before
	public void setUpForEachTC() throws Exception {
		CommonFunction.clickItem(driver, Interface_Home.LOGIN_BTN_XPATH);
		CommonFunction.clickItem(driver, Interface_Login.CREATE_ACC_LINK_XPATH);
	}
	
	@After
	public void tearDownForEachTC() throws Exception {
		testcase = name.getMethodName();
		CommonFunction.captureScreen(driver, folder, testcase);
		CommonFunction.refreshScreen(driver);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		CommonFunction.shutDownDriver(driver);
	}

	@Test
	public void FUNC_01_01() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.EMPTY, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.USERNAME_FB_XPATH,
				Interface_CreateAccount.EMPTY_NAME_MSG);
	}

	@Test
	public void FUNC_01_02() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.FULL_SPACE, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.USERNAME_FB_XPATH,
				Interface_CreateAccount.EMPTY_NAME_MSG);
	}

	@Test
	public void FUNC_01_03() throws Exception {
		Interface_CreateAccount.createAccount(driver, " " + Constant.BASE_NAME + " ", Constant.BASE_EMAIL1,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}

	@Test
	public void FUNC_01_04() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}

	@Test
	public void FUNC_01_05() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.SPECIAL_CHARS, Constant.BASE_EMAIL1,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				Interface_CreateAccount.USERNAME_FB_XPATH, Interface_CreateAccount.INVALID_NAME_MSG);
	}

	@Test
	public void FUNC_01_06() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.NUMERIC_CHARS, Constant.BASE_EMAIL1,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				Interface_CreateAccount.USERNAME_FB_XPATH, Interface_CreateAccount.INVALID_NAME_MSG);
	}

	@Test
	public void FUNC_01_07() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.EMPTY, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.EMAIL_FB_XPATH,
				Interface_CreateAccount.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_08() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.FULL_SPACE, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.EMAIL_FB_XPATH,
				Interface_CreateAccount.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_09() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.INVALID_EMAIL,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				Interface_CreateAccount.EMAIL_FB_XPATH, Interface_CreateAccount.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_10() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, " " + Constant.BASE_EMAIL1 + " ",
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}

	@Test
	public void FUNC_01_11() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.INVALID_SPACE_EMAIL,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				Interface_CreateAccount.EMAIL_FB_XPATH, Interface_CreateAccount.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_12() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.INVALID_SPECIAL_EMAIL,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				Interface_CreateAccount.EMAIL_FB_XPATH, Interface_CreateAccount.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_13() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL2, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}

	@Test
	public void FUNC_01_14() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.ERROR_CREATE_MSG_XPATH,
				Interface_CreateAccount.REGISTED_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_15() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.EMPTY,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.PWD_FB_XPATH,
				Interface_CreateAccount.EMPTY_PWD_MSG);
	}

	@Test
	public void FUNC_01_16() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.FULL_SPACE,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.PWD_FB_XPATH,
				Interface_CreateAccount.EMPTY_PWD_MSG);
	}

	@Test
	public void FUNC_01_17() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_18() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_19() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.SPECIAL_CHARS,
				Constant.SPECIAL_CHARS, Constant.BASE_PHONE1, Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_20() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.NUMERIC_CHARS,
				Constant.NUMERIC_CHARS, Constant.BASE_PHONE1, Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_21() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.EMPTY, Constant.BASE_PHONE1, Interface_CreateAccount.PWD_CFM_FB_XPATH,
				Interface_CreateAccount.EMPTY_PWD_CFM_MSG);
	}
	
	@Test
	public void FUNC_01_22() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.FULL_SPACE, Constant.BASE_PHONE1, Interface_CreateAccount.PWD_CFM_FB_XPATH,
				Interface_CreateAccount.EMPTY_PWD_CFM_MSG);
	}
	
	@Test
	public void FUNC_01_23() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD1, Constant.BASE_PHONE1, Interface_CreateAccount.PWD_CFM_FB_XPATH,
				Interface_CreateAccount.NOT_MATCH_PWD_MSG);
	}
	
	@Test
	public void FUNC_01_24() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.EMPTY, Interface_CreateAccount.PHONE_FB_XPATH,
				Interface_CreateAccount.EMPTY_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_25() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.FULL_SPACE, Interface_CreateAccount.PHONE_FB_XPATH,
				Interface_CreateAccount.EMPTY_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_26() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.PHONE_FULL0, Interface_CreateAccount.PHONE_FB_XPATH,
				Interface_CreateAccount.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_27() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, "" + Constant.BASE_PHONE1 + " ", Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_28() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.CONTAIN_SPACE_PHONE, Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_29() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.SPECIAL_CHARS, Interface_CreateAccount.PHONE_FB_XPATH,
				Interface_CreateAccount.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_30() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.ALPHABET_CHARS, Interface_CreateAccount.PHONE_FB_XPATH,
				Interface_CreateAccount.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_31() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.PHONE_9_CHARS, Interface_CreateAccount.PHONE_FB_XPATH,
				Interface_CreateAccount.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_32() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.PHONE_11_CHARS, Interface_CreateAccount.PHONE_FB_XPATH,
				Interface_CreateAccount.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_33() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE, Interface_CreateAccount.PHONE_FB_XPATH,
				Interface_CreateAccount.REGISTED_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_34() throws Exception {
		Interface_CreateAccount.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, Interface_CreateAccount.SUCCESS_MSG_XPATH,
				Interface_CreateAccount.SUCCESS_MSG);
	}
}
