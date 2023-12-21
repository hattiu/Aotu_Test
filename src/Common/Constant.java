package Common;

public class Constant {

	public static String DRIVER_KEY 			= "webdriver.chrome.driver";
	public static String DRIVER_KEY_LOCATION 	= System.getProperty("user.dir") + "/src/chromedriver.exe";

	// Define general information to access test application
	public static String BASE_URL1 				= "https://colorme.vn/";
	public static String BASE_URL2 				= "https://e.colorme.vn/";

	// Username and password to access website
	public static String BASE_NAME 				= "auto test";
	public static String BASE_EMAIL 			= "anhhn1.spcntt@gmail.com";
	public static String BASE_EMAIL1 			= "autotest@gmail.com";
	public static String BASE_EMAIL2 			= "autotest1@gmail.com";
	public static String BASE_PASSWORD 			= "auto test";
	public static String BASE_PASSWORD1			= "auto test 123";
	public static String BASE_PHONE 			= "0987654321";
	public static String BASE_PHONE1 			= "0123456789";
	public static String CONTAIN_SPACE_PHONE	= "0123 456 789";
	
	public static String EMPTY 					= "";
	public static String FULL_SPACE 			= "        ";
	public static String ALPHABET_CHARS 		= "abcdefgh";
	public static String SPECIAL_CHARS			= "@#$%^&*(";
	public static String NUMERIC_CHARS 			= "1234567890";
	public static String INVALID_EMAIL 			= "test.com";
	public static String INVALID_SPACE_EMAIL	= "auto test@gmail.com";
	public static String INVALID_SPECIAL_EMAIL	= "auto#$%^&test@gmail.com";
	public static String PHONE_FULL0 			= "00000000";
	public static String PHONE_9_CHARS 			= "098765432";
	public static String PHONE_11_CHARS 		= "01234567890";
	
	public static String KEYWORD_4_CHARS 		= "phot";
	public static String KEYWORD_5_CHARS 		= "thien";
	public static String KEYWORD_6_CHARS 		= "nguyễn";
	public static String KEYWORD_ABSOLUTE		= "Nguyễn Việt Hùng";
	public static String KEYWORD_RELATIVE		= "Việt Hùng";
	public static String KEYWORD_UPPERCASE		= "NGUYỄN VIỆT HÙNG";
	public static String INVALID_KEYWORD		= "test search";

	public static String INVALID_CODE			= "123456";
	
	public static String EMAIL_VALUE			= "{Email}";
}
