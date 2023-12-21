package Interface;

import org.openqa.selenium.WebDriver;
import Common.CommonFunction;

public class Interface_RegisterCourse {
	public static String REGISTER_NOW_BTN_XPATH = "(//button[contains(text(),'Đăng kí')])[10]";
	
	public static String EMAIL_TXT_XPATH 		= "//input[@id='formRegisterEmail']";
	public static String NAME_TXT_XPATH 		= "//input[@id='formRegisterName']";
	public static String PHONE_TXT_XPATH 		= "//input[@id='formRegisterPhone']";
	public static String COUPON_CODE_TXT_XPATH	= "//input[@id='formRegisterCouponCode']";
	
	public static String REGISTER_BTN_XPATH 	= "//button[@id='formRegisterSubmit']";
	
	public static String SUCCESS_MSG_XPATH 		= "//*[@id='formRegisterMessage']";
	public static String EMAIL_FB_XPATH 		= "//*[@id='formRegisterEmail-error']";
	public static String NAME_FB_XPATH 			= "//*[@id='formRegisterName-error']";
	public static String PHONE_FB_XPATH 		= "//*[@id='formRegisterPhone-error']";
	public static String COUPON_CODE_FB_XPATH 	= "//*[@id='swal2-title']";
	
	public static String EMPTY_EMAIL_MSG 		= "Vui lòng nhập email";
	public static String INVALID_EMAIL_MSG		= "Vui lòng nhập đúng email";
	public static String EMPTY_NAME_MSG			= "Vui lòng nhập tên";
	public static String INVALID_NAME_MSG 		= "Vui lòng nhập đúng tên";
	public static String EMPTY_PHONE_MSG 		= "Vui lòng nhập số điện thoại";
	public static String INVALID_PHONE_MSG 		= "Vui lòng nhập đúng số điện thoại";
	public static String INVALID_COUPON_CODE_MSG= "Mã khuyến mãi không hợp lệ";
	public static String SUCCESS_MSG 			= "Đăng kí thành công, bạn vui lòng check mail để kiểm tra thông tin";
	
	public static void registerCourse(WebDriver driver, String email, String name, String phone, String couponCode, String msgXpath, String expectedMsg) throws Exception {
		CommonFunction.sendKeys(driver, EMAIL_TXT_XPATH, email);
		CommonFunction.sendKeys(driver, NAME_TXT_XPATH, name);
		CommonFunction.sendKeys(driver, PHONE_TXT_XPATH, phone);
		CommonFunction.sendKeys(driver, COUPON_CODE_TXT_XPATH, couponCode);
		CommonFunction.clickItem(driver, REGISTER_BTN_XPATH);
		CommonFunction.assertTextValue(driver, msgXpath, expectedMsg);
	}
}
