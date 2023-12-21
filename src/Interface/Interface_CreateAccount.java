package Interface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import Common.CommonFunction;
import Common.Constant;

public class Interface_CreateAccount {
	public static String NAME_TXT_XPATH 	= "//input[@id='validationServerUsername']";
	public static String EMAIL_TXT_XPATH 	= "//input[@id='validationServerEmail']";
	public static String PWD_TXT_XPATH 		= "//input[@id='password']";
	public static String PWD_CFM_TXT_XPATH 	= "//input[@id='confirm_password']";
	public static String PHONE_TXT_XPATH 	= "//input[@name='phone']";
	
	public static String CREATE_ACC_BTN_XPATH = "//*[@id='form-create']//button";
	
	public static String SUCCESS_MSG_XPATH 		= "//div[@id='success-create']";
	public static String USERNAME_FB_XPATH 		= "//div[@id='validationServerUsernameFeedback']";
	public static String EMAIL_FB_XPATH 		= "//div[@id='validationServerEmailFeedback']";
	public static String PWD_FB_XPATH 			= "(//div[@class='invalid-feedback'])[3]";
	public static String PWD_CFM_FB_XPATH 		= "//div[@id='invalidConfirmPassword']";
	public static String PHONE_FB_XPATH 		= "(//div[@class='invalid-feedback'])[5]";
	public static String ERROR_CREATE_MSG_XPATH = "//div[@id='error-create']";
	
	public static String EMPTY_NAME_MSG		= "Vui lòng nhập họ và tên";
	public static String INVALID_NAME_MSG 	= "Vui lòng nhập Họ và tên theo đúng định dạng";
	public static String INVALID_EMAIL_MSG	= "Vui lòng nhập Email theo đúng định dạng";
	public static String REGISTED_EMAIL_MSG = "Email đã tồn tại";
	public static String EMPTY_PWD_MSG 		= "Vui lòng nhập mật khẩu";
	public static String EMPTY_PWD_CFM_MSG 	= "Vui lòng nhập lại mật khẩu";
	public static String NOT_MATCH_PWD_MSG	= "Mật khẩu không trùng khớp";
	public static String EMPTY_PHONE_MSG 	= "Vui lòng nhập số điện thoại liên lạc";
	public static String INVALID_PHONE_MSG 	= "Vui lòng nhập Số điện thoại theo đúng định dạng";
	public static String REGISTED_PHONE_MSG	= "Vui lòng nhập Số điện thoại chưa được tạo tài khoản";
	public static String SUCCESS_MSG 		= "Color Me đã gửi email xác nhận vào hòm thư \"{Email}\". Bạn vui lòng kiểm tra email để hoàn thành đăng kí";
	
	public static void createAccount(WebDriver driver, String name, String email, String password, String passwordConfirm, String phone, String msgXpath, String expectedMsg) throws Exception {
		CommonFunction.sendKeys(driver, NAME_TXT_XPATH, name);
		CommonFunction.sendKeys(driver, EMAIL_TXT_XPATH, email);
		CommonFunction.sendKeys(driver, PWD_TXT_XPATH, password);
		CommonFunction.sendKeys(driver, PWD_CFM_TXT_XPATH, passwordConfirm);
		CommonFunction.sendKeys(driver, PHONE_TXT_XPATH, phone);
		CommonFunction.clickItem(driver, CREATE_ACC_BTN_XPATH);
		TimeUnit.SECONDS.sleep(3);
		if (expectedMsg == SUCCESS_MSG) {
			CommonFunction.assertTextValue(driver, msgXpath, expectedMsg.replace(Constant.EMAIL_VALUE, email));
		}
		else {
			CommonFunction.assertTextValue(driver, msgXpath, expectedMsg);
		}
	}
}
