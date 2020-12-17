package org.rohini.test;

import org.openqa.selenium.support.PageFactory;
import org.rohini.constants.LoginCredentials;
import org.rohini.constants.PageTitles;
import org.rohini.constants.URLs;
import org.rohini.page.BasePage;
import org.rohini.page.CrmDashBoardPage;
import org.rohini.page.LoginPage;
import org.rohini.utils.SeleniumUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest extends BasePage {
	
	LoginPage loginPage ;
	SeleniumUtils seleniumUtils;
	CrmDashBoardPage crmDashBoardPage;
	
	@BeforeTest
	public void init() {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		seleniumUtils = PageFactory.initElements(driver, SeleniumUtils.class);
		crmDashBoardPage = PageFactory.initElements(driver, CrmDashBoardPage.class);
	}
	
	@Test
	public void loginWithGivenCredentialsTest() throws Exception {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

		seleniumUtils.goToUrl(URLs.crmHomePageUrl.getURL());
		
		Assert.assertEquals(seleniumUtils.getPageTitle(), PageTitles.LOGIN_PAGE_TITLE.getPageTitle());
		
		loginPage.loginToCRM(LoginCredentials.USER_ID.getCredentials(), LoginCredentials.PASSWORD.getCredentials());
		
		crmDashBoardPage.validateCRMDashBoardTitle();
		
		crmDashBoardPage.validateUserNameOnCRMDashBoard(LoginCredentials.USER_NAME.getCredentials());
		
	}
	
	
}
