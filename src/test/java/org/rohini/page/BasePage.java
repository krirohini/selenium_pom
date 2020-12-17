package org.rohini.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BasePage {

	public static WebDriver driver = null;
	
	@BeforeTest
	public void setUp_lauchBrowser() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		// Instantiate a ChromeDriver class.
		driver = new ChromeDriver();
		
		//To maximize browser
		driver.manage().window().maximize();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	

	@AfterSuite
	public void closeBrowsers() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

		driver.quit();
	}

}
