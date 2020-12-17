package org.rohini.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.rohini.constants.LoginCredentials;
import org.rohini.constants.PageTitles;
import org.rohini.utils.SeleniumUtils;
import org.testng.Assert;


public class CrmDashBoardPage {
	
	WebDriver driver;
	SeleniumUtils seleniumUtils;
	
	@FindBy(how = How.XPATH, using="//div[@class='nav-bar-account-details']//span[1]") WebElement userName;

	public CrmDashBoardPage (WebDriver driver) {
		this.driver = driver;
		seleniumUtils = PageFactory.initElements(driver, SeleniumUtils.class); 
	}

	
	public void validateCRMDashBoardTitle() {
		String homeDashBoardTitle = seleniumUtils.getPageTitle();
		Assert.assertEquals(homeDashBoardTitle, PageTitles.HOME_PAGE_DASHBOARD_TITLE.getPageTitle());
	}
	
	public void validateUserNameOnCRMDashBoard(String userName) throws InterruptedException {
		Assert.assertEquals(seleniumUtils.getText(this.userName), LoginCredentials.USER_NAME.getCredentials());
	}
	
	
	
	
}
