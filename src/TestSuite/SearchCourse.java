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
import Interface.Interface_Search;

public class SearchCourse {
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
		CommonFunction.clickItem(driver, Interface_Home.SEARCH_LINK_XPATH);
	}
	
	@After
	public void tearDownForEachTC() throws Exception {
		testcase = name.getMethodName();
		CommonFunction.captureScreen(driver, folder, testcase);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		CommonFunction.shutDownDriver(driver);
	}

	@Test
	public void FUNC_03_01() throws Exception {
		Interface_Search.searchCourse(driver, Constant.EMPTY, Interface_Search.INVALID_KEYWORD_MSG);
	}

	@Test
	public void FUNC_03_02() throws Exception {
		Interface_Search.searchCourse(driver, Constant.FULL_SPACE, Interface_Search.INVALID_KEYWORD_MSG);
	}
	
	@Test
	public void FUNC_03_03() throws Exception {
		Interface_Search.searchCourse(driver, Constant.KEYWORD_4_CHARS, Interface_Search.INVALID_KEYWORD_MSG);
	}
	
	@Test
	public void FUNC_03_04() throws Exception {
		Interface_Search.searchCourse(driver, Constant.KEYWORD_5_CHARS, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_05() throws Exception {
		Interface_Search.searchCourse(driver, Constant.KEYWORD_6_CHARS, Constant.EMPTY);
	}

	@Test
	public void FUNC_03_06() throws Exception {
		Interface_Search.searchCourse(driver, Constant.KEYWORD_ABSOLUTE, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_07() throws Exception {
		Interface_Search.searchCourse(driver, Constant.KEYWORD_RELATIVE, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_08() throws Exception {
		Interface_Search.searchCourse(driver, Constant.KEYWORD_UPPERCASE, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_09() throws Exception {
		Interface_Search.searchCourse(driver, " " + Constant.KEYWORD_ABSOLUTE + " ", Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_10() throws Exception {
		Interface_Search.searchCourse(driver, Constant.INVALID_KEYWORD, Interface_Search.UNSUCCESS_SEARCH_MSG);
	}
}
