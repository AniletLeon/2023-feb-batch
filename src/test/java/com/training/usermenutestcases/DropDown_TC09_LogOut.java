package com.training.usermenutestcases;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.MySettingPage;

public class DropDown_TC09_LogOut extends BaseTest {

	WebDriver driver;
	LoginPage login;
	String url;
	HomePage homepage;
	MySettingPage mysetting;

	@BeforeMethod
	@Parameters({ "browser" })
	public void beforeMethod(String browser) throws IOException, InterruptedException

	{
		driver = getDriver(browser);
		url = getUrl("appurl");
		driver.get(url);
		driver.manage().window().maximize();
		login = new LoginPage(driver);
		homepage = new HomePage(driver);
		mysetting = new MySettingPage(driver);
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Test 9");
		login.enterUserName("ani@anstar.com");
		login.enterpassword("le0nDhas");
		login.clickOnLoginButton();

	}

	@Test
	public void clickOnDeveloperonsole() throws InterruptedException {
		homepage.clickOnUserMenuDropDown();
		homepage.clicklogOutFromUserMenuDropDown();
	}

	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}
}

