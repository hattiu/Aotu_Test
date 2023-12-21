package Interface;

import org.openqa.selenium.WebDriver;
import Common.CommonFunction;
import Common.Constant;

public class Interface_Login {
	public static String EMAIL_TXT_XPATH 		= "//input[@placeholder='Tên đăng nhập/Email']";
	public static String PWD_TXT_XPATH 			= "//input[@placeholder='Mật khẩu']";
	
	public static String LOGIN_BTN_XPATH 		= "//button[@id='submitLoginBtn']";
	public static String CREATE_ACC_LINK_XPATH 	= "//button[text()='Tạo tài khoản']";
	
	public static String ERROR_MSG_XPATH 		= "//div[@class='toast-message']";
	
	public static String INVALID_EMAIL_MSG 		= "Vui lòng nhập Email theo đúng định dạng";
	public static String INCORRECT_INFO_MSG 	= "Email hoặc Password không đúng";
	
	public static void login(WebDriver driver, String email, String password, String expectedErrorMsg) throws Exception {
		CommonFunction.sendKeys(driver, EMAIL_TXT_XPATH, email);
		CommonFunction.sendKeys(driver, PWD_TXT_XPATH, password);
		
		if (email == Constant.EMPTY || password == Constant.EMPTY) {
			CommonFunction.assertElementDisabled(driver, LOGIN_BTN_XPATH);
		}
		else if (expectedErrorMsg == Constant.EMPTY) {
			CommonFunction.clickItem(driver, LOGIN_BTN_XPATH);
			CommonFunction.assertElementDisplayed(driver, Interface_Home.USERNAME_LABEL_XPATH);
		}
		else {
			CommonFunction.clickItem(driver, LOGIN_BTN_XPATH);
			CommonFunction.assertTextValue(driver, ERROR_MSG_XPATH, expectedErrorMsg);
		}
	}
}
