package com.training.testcases;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.LoginPage;

public class LoginPage_TC_2 extends BaseTest {

	WebDriver driver;
	LoginPage login;
	String url;

	@BeforeMethod
	@Parameters({ "browser" })
	public void beforeMethod(String browser) throws IOException

	{
		driver = getDriver(browser);
		url = getUrl("appurl");
		driver.get(url);
		driver.manage().window().maximize();
		login = new LoginPage(driver);
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Test 2");
	}

	@Test
	public void LoginToSalesforce() {
		login.enterUserName("ani@anstar.com");
		login.enterpassword("le0nDhas");
		login.clickOnLoginButton();
		Log.info("I am logging in testcase 2");
		login.validateString(driver.getTitle(), LoginPage.Messages.TITLE);

	}

	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}

}
