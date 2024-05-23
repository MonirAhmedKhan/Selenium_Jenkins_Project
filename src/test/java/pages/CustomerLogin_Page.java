package pages;

import org.openqa.selenium.By;

import base.Base;

public class CustomerLogin_Page extends Base {
	//Locators
	public static By menuCustomerLogin = By.xpath("//a[@href='clogin.php']");
	public static By textBoxUserId = By.xpath("//input[@name='mailuid']");
	public static By textBoxPassword = By.xpath("//input[@name='pwd']");
	public static By buttonCustomerLogin = By.name("login-submit");
	
	//Actions
	public static String loginAsCustomer(String userId, String password) {
		navigateURL("https://it.microtechlimited.com");
		click( Landing_Page.menuLogin );
		click( CustomerLogin_Page.menuCustomerLogin );
		sendKeys(CustomerLogin_Page.textBoxUserId , userId );
		sendKeys(CustomerLogin_Page.textBoxPassword, password );
		click( CustomerLogin_Page.buttonCustomerLogin);
		String welcomeMsg =  getTextElement(CustomerHomePage_Page.labelWelcomeMessage);
		return welcomeMsg;
	}
}
