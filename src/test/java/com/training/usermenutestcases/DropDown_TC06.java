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

public class DropDown_TC06 extends BaseTest {

	WebDriver driver;
	LoginPage login;
	String url;
	HomePage homepage;

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
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Test 6");
		login.enterUserName("ani@anstar.com");
		login.enterpassword("le0nDhas");
		login.clickOnLoginButton();
		homepage.clickOnUserMenuDropDown();
		homepage.clickOnMyProfile();
	}

	@Test
	public void selectMyProfileOption() throws InterruptedException {
		Thread.sleep(5000);
		homepage.clickOnEditProfile();
		Thread.sleep(1000);
		homepage.switchToFrameInEditprofilepage();
		homepage.clickOnAboutTabInEditProfilePage();
		homepage.clearLastNameInEditProfilePage();
		homepage.EnterLastNameInEditProfilePage("Leon");
		homepage.clickSaveAllButtonInAboutTab();

	}
	@Test
	public void clickOnPostLink() throws InterruptedException {
		Thread.sleep(5000);
		homepage.clickOnPostLink();
		homepage.switchtoDriverInPost();
		homepage.enterTestInTestArea("hello how are this");
		homepage.clickOnShareButton();
	}
	@Test
	public void clickFileUploadLink() throws InterruptedException {
		Thread.sleep(5000);
		homepage.clickOnFileLink();
		homepage.clickONuploadFilefromcomputer();
		homepage.clickOnChooseFileButton();
		homepage.clickOnPublishButton();
	}
	@Test
	public void clickOnAddImageLink() throws InterruptedException {
		Thread.sleep(5000);
		homepage.clickOnAddPhotoLink();
		homepage.clickOnChooseFileLink();
		homepage.clickOnSaveInImage();
		Thread.sleep(5000);
		homepage.clickOnPublishImageButton();
	}
	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}
}