package org.rohini.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.rohini.utils.SeleniumUtils;

public class LoginPage {
	
	public static WebDriver driver;
	SeleniumUtils seleniumUtils;
	

	@FindBy(how = How.XPATH, using="//input[@ID=\"login:usernameDecorate:username\"]") WebElement userNameInput;
	@FindBy(how = How.XPATH, using="//input[@ID=\"login:passwordDecorate:password\"]") WebElement passwordInput;
	@FindBy(how = How.XPATH, using="//input[@ID=\"login:login\"]") WebElement loginButton;	
	
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
		seleniumUtils = PageFactory.initElements(driver, SeleniumUtils.class); 

	}




	
	
	
	public void loginToCRM(String userName, String password) throws InterruptedException {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

		System.out.println("userName: " + userName + "\t password : " + password);
		seleniumUtils.setValueByXpath(userNameInput, userName);
		seleniumUtils.setValueByXpath(passwordInput, password);
		seleniumUtils.clickByXpath(loginButton);

	}
	
	
	
	
}
