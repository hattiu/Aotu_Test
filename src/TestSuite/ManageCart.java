package TestSuite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import Common.CommonFunction;
import Common.Constant;
import Interface.Interface_Home;

public class ManageCart {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule
	public TestName name = new TestName();

	@BeforeClass
	public static void setUp() throws Exception {
		driver = CommonFunction.initWebDriver(Constant.BASE_URL2);
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
	public void FUNC_04_01() throws Exception {
		CommonFunction.clickItem(driver, Interface_Home.ADD_TO_CART_BTN_XPATH.replace("INDEX", "1"));
		CommonFunction.assertTextValue(driver, Interface_Home.ADD_TO_CART_MSG_XPATH, Interface_Home.ADD_TO_CART_MSG);
	}
	
	@Test
	public void FUNC_04_02() throws Exception {
		CommonFunction.clickItem(driver, Interface_Home.ADD_TO_CART_BTN_XPATH.replace("INDEX", "1"));
		CommonFunction.assertTextValue(driver, Interface_Home.TOTAL_QTY_ICON_XPATH, "1");
	}
	
	@Test
	public void FUNC_04_03() throws Exception {
		CommonFunction.clickItem(driver, Interface_Home.ADD_TO_CART_BTN_XPATH.replace("INDEX", "2"));
		CommonFunction.assertTextValue(driver, Interface_Home.ADD_TO_CART_MSG_XPATH, Interface_Home.ADD_TO_CART_MSG);
	}
	
	@Test
	public void FUNC_04_04() throws Exception {
		CommonFunction.clickItem(driver, Interface_Home.CART_ICON_XPATH);
		CommonFunction.clickItem(driver, Interface_Home.REMOVE_ITEM_BTN_XPATH.replace("INDEX", "2"));
		CommonFunction.assertTextValue(driver, Interface_Home.TOTAL_QTY_ICON_XPATH, "1");
	}
	
	@Test
	public void FUNC_04_05() throws Exception {
		CommonFunction.clickItem(driver, Interface_Home.CART_ICON_XPATH);
		CommonFunction.clickItem(driver, Interface_Home.REMOVE_ITEM_BTN_XPATH.replace("INDEX", "1"));
		CommonFunction.assertTextValue(driver, Interface_Home.EMPTY_CART_MSG_XPATH, Interface_Home.EMPTY_CART_MSG);
	}
}
