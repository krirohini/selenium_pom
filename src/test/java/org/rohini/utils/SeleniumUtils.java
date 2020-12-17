package org.rohini.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.rohini.page.BasePage;

public class SeleniumUtils extends BasePage {

	public WebDriver driver;

	//SeleniumUtils seleniumUtils = PageFactory.initElements(driver, SeleniumUtils.class); 
	
	public SeleniumUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void goToUrl(String url) {
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void setValueByXpath(WebElement elementXpath, String string) {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(elementXpath)).sendKeys(string);;
		elementXpath.sendKeys(string);
	}
	
	public void clickByXpath(WebElement elementXpath) throws InterruptedException {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(elementXpath));
		elementXpath.click();
		Thread.sleep(5000);
	}
	
	public String getText(WebElement element) throws InterruptedException {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(elementXpath));
		return element.getText();
	}


}
