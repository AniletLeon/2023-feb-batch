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

public class LoginTest_TC_1 extends BaseTest {

	WebDriver driver;
	LoginPage login;
	String url;
	

	@BeforeMethod
	@Parameters({"browser"})
	public void beforeMethod(String browser) throws IOException

	{
		driver=getDriver(browser);
		url=getUrl("appurl");
		driver.get(url);
		driver.manage().window().maximize();
		login = new LoginPage(driver);
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Test1");
	}

	@Test
	public void enterOnlyUserName() {
		login.enterUserName("ani@anstar.com");
		login.clearPasswordField();
		login.clickOnLoginButton();
		Log.info("I am logging in testcase1");
	}

	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}
}
