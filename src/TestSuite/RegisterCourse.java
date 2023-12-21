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
import Interface.Interface_RegisterCourse;

public class RegisterCourse {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule
	public TestName name = new TestName();

	@BeforeClass
	public static void setUp() throws Exception {
		driver = CommonFunction.initWebDriver(Constant.BASE_URL1);
		CommonFunction.clickItem(driver, Interface_Home.COURSE_LINK_XPATH);
	}

	@Before
	public void setUpForEachTC() throws Exception {
		CommonFunction.clickItem(driver, Interface_RegisterCourse.REGISTER_NOW_BTN_XPATH);
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
	public void FUNC_05_01() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.EMPTY, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.EMAIL_FB_XPATH, Interface_RegisterCourse.EMPTY_EMAIL_MSG);
	}

	@Test
	public void FUNC_05_02() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.FULL_SPACE, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.EMAIL_FB_XPATH, Interface_RegisterCourse.EMPTY_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_05_03() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.INVALID_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.EMAIL_FB_XPATH, Interface_RegisterCourse.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_05_04() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, " " + Constant.BASE_EMAIL1 + " ", Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.SUCCESS_MSG_XPATH, Interface_RegisterCourse.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_05() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.INVALID_SPACE_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.EMAIL_FB_XPATH, Interface_RegisterCourse.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_05_06() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.INVALID_SPECIAL_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.EMAIL_FB_XPATH, Interface_RegisterCourse.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_05_07() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL2, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.SUCCESS_MSG_XPATH, Interface_RegisterCourse.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_08() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.EMPTY, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.NAME_FB_XPATH, Interface_RegisterCourse.EMPTY_NAME_MSG);
	}
	
	@Test
	public void FUNC_05_09() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.FULL_SPACE, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.NAME_FB_XPATH, Interface_RegisterCourse.EMPTY_NAME_MSG);
	}
	
	@Test
	public void FUNC_05_10() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, " " + Constant.BASE_NAME + " ", Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.SUCCESS_MSG_XPATH, Interface_RegisterCourse.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_11() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.SUCCESS_MSG_XPATH, Interface_RegisterCourse.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_12() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.SPECIAL_CHARS, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.NAME_FB_XPATH, Interface_RegisterCourse.INVALID_NAME_MSG);
	}
	
	@Test
	public void FUNC_05_13() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.NUMERIC_CHARS, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.NAME_FB_XPATH, Interface_RegisterCourse.INVALID_NAME_MSG);
	}
	
	@Test
	public void FUNC_05_14() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.EMPTY,
				Constant.EMPTY, Interface_RegisterCourse.PHONE_FB_XPATH, Interface_RegisterCourse.EMPTY_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_15() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.FULL_SPACE,
				Constant.EMPTY, Interface_RegisterCourse.PHONE_FB_XPATH, Interface_RegisterCourse.EMPTY_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_16() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.PHONE_FULL0,
				Constant.EMPTY, Interface_RegisterCourse.PHONE_FB_XPATH, Interface_RegisterCourse.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_17() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, " " + Constant.BASE_PHONE1 + " ",
				Constant.EMPTY, Interface_RegisterCourse.SUCCESS_MSG_XPATH, Interface_RegisterCourse.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_18() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.CONTAIN_SPACE_PHONE,
				Constant.EMPTY, Interface_RegisterCourse.SUCCESS_MSG_XPATH, Interface_RegisterCourse.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_19() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.SPECIAL_CHARS,
				Constant.EMPTY, Interface_RegisterCourse.PHONE_FB_XPATH, Interface_RegisterCourse.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_20() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.ALPHABET_CHARS,
				Constant.EMPTY, Interface_RegisterCourse.PHONE_FB_XPATH, Interface_RegisterCourse.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_21() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.PHONE_9_CHARS,
				Constant.EMPTY, Interface_RegisterCourse.PHONE_FB_XPATH, Interface_RegisterCourse.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_22() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.PHONE_11_CHARS,
				Constant.EMPTY, Interface_RegisterCourse.PHONE_FB_XPATH, Interface_RegisterCourse.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_23() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.SUCCESS_MSG_XPATH, Interface_RegisterCourse.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_24() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.FULL_SPACE, Interface_RegisterCourse.SUCCESS_MSG_XPATH, Interface_RegisterCourse.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_25() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.INVALID_CODE, Interface_RegisterCourse.COUPON_CODE_FB_XPATH, Interface_RegisterCourse.INVALID_COUPON_CODE_MSG);
	}
	
	@Test
	public void FUNC_05_26() throws Exception {
		Interface_RegisterCourse.registerCourse(driver, Constant.BASE_EMAIL1, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, Interface_RegisterCourse.SUCCESS_MSG_XPATH, Interface_RegisterCourse.SUCCESS_MSG);
	}
}
