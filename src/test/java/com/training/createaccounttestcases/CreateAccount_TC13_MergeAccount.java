package com.training.createaccounttestcases;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.CreateAccountPage;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;

public class CreateAccount_TC13_MergeAccount extends BaseTest {

	WebDriver driver;
	LoginPage login;
	String url;
	HomePage homepage;
	CreateAccountPage accountpage;

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
		accountpage = new CreateAccountPage(driver);
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Test 13");
		login.enterUserName("ani@anstar.com");
		login.enterpassword("le0nDhas");
		login.clickOnLoginButton();
		Thread.sleep(3000);
		accountpage.clickOnAccountTab();
		Thread.sleep(3000);
		accountpage.clickOncreateAccount();
		accountpage.clickOncreateAccountlink();
	}

	@Test
	public void clickMergeLink() throws InterruptedException {
		accountpage.clickOnMergeLink();
		accountpage.enterOnfindname("bu");
		accountpage.clickOnfindAccountButton();
		accountpage.clickOnCheckBob1();
		accountpage.clickOnCheckBob2();
		accountpage.clickOnNextButton();
		accountpage.clickOnMergeButton();
		accountpage.switchAlert();
	}

	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}

}

