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

public class DropDown_TC07_MtSetting extends BaseTest {

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
		Log.startTestCase("Test 7");
		login.enterUserName("ani@anstar.com");
		login.enterpassword("le0nDhas");
		login.clickOnLoginButton();
		homepage.clickOnUserMenuDropDown();
		homepage.clickOnMySetting();
	}

	@Test
	public void clickOnPersonalLink() throws InterruptedException {
		Thread.sleep(5000);
		mysetting.clickOnPersonaLink();
		mysetting.clickOnHistoryLink();
		mysetting.clickOnDownloadHistoryLink();
	}

	@Test
	public void clickOnDisplayAndLayout() throws InterruptedException {
		Thread.sleep(5000);
		mysetting.clickOnDisplayAndLayout();
		mysetting.clickOnCustomizeTab();
		mysetting.customizeAppDropDown("Salesforce Chatter");
		mysetting.clickOnAvailableDropDown("Reports");
		mysetting.clickOnAdd();
		mysetting.clickOnsave();
	}

	@Test
	public void clickOnEmailLink() throws InterruptedException {
		Thread.sleep(5000);
		mysetting.clickOnEmailLink();
		mysetting.clickOnMyEmailSettings();
		mysetting.clearMyEmailName();
		mysetting.enterMyEmailName("Ani");
		mysetting.clearemailAddress();
		mysetting.enterEmailAddress("anilet1987@gmail.com");
		mysetting.clickOnAutomatiBCC();
		mysetting.clickOnSaveInEmailLinkPage();
	}

	@Test
	public void clickOnCalenderAndRemainder() throws InterruptedException {
		Thread.sleep(5000);
		mysetting.clickOnCalenderAndRemainderLink();
		mysetting.clickOnActivityRemainderLink();
		mysetting.clickOnOpenTestRemainderButton();

	}
	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}
}
