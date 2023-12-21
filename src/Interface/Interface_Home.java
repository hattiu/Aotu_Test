package Interface;

import org.openqa.selenium.WebDriver;

import Common.CommonFunction;

public class Interface_Home {
	public static String LOGIN_BTN_XPATH 		= "(//button[@data-bs-target='#modalLogin'])[2]";
	public static String SEARCH_LINK_XPATH 		= "//a[@class='top-head-item text-nowrap d-flex align-items-center']";
	public static String USERNAME_LABEL_XPATH 	= "(//a[@data-bs-toggle='dropdown'])[6]";
	public static String LOGOUT_LINK_XPATH 		= "(//a[@class='dropdown-item nav-link text-black'])[6]";
	
	public static String CART_ICON_XPATH 		= "//*[@data-bs-target='#canvasCart']";
	public static String TOTAL_QTY_ICON_XPATH 	= "//*[@data-bs-target='#canvasCart']//span";
		
	public static String COURSE_LINK_XPATH 		= "(//span[@class='course-price float-end no-translate'])[1]";
	
	public static String ADD_TO_CART_BTN_XPATH 	= "(//div[@class='add-hover fw-bold'])[INDEX]";
	public static String REMOVE_ITEM_BTN_XPATH 	= "(//div[@class='cart-item-remove'])[INDEX]";
	public static String ADD_TO_CART_MSG_XPATH	= "//div[@class='toast-message']";
	public static String EMPTY_CART_MSG_XPATH 	= "//div[@class='text-center mt-4']";
	
	public static String ADD_TO_CART_MSG 		= "Đã thêm khóa học vào giỏ hàng";
	public static String EMPTY_CART_MSG 		= "Giỏ hàng của bạn đang trống";
	
	public static void logout(WebDriver driver) throws Exception {
		CommonFunction.clickItem(driver, USERNAME_LABEL_XPATH);
		CommonFunction.clickItem(driver, LOGOUT_LINK_XPATH);
		CommonFunction.assertElementDisplayed(driver, LOGIN_BTN_XPATH);
	}
	
}
