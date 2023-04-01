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

public class CreateAccount_TC10_CreateAccount extends BaseTest {

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
		Log.startTestCase("Test 10");
		login.enterUserName("ani@anstar.com");
		login.enterpassword("le0nDhas");
		login.clickOnLoginButton();
		Thread.sleep(5000);
		accountpage.clickOnAccountTab();
	}

	@Test
	public void selectAccountTab() throws InterruptedException {
		// accountpage.clickOnAccountTab();
		accountpage.clickOncreateAccount();
		accountpage.clickOncreateAccountlink();
		accountpage.clickOncreateNewButton();
		accountpage.clickOnNewLink();
		accountpage.clickOnAccountName("Bueaty shop");
		accountpage.clickOnTypeDropDown("Technology Partner");
		accountpage.clickOnOkButton();

	}

	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}
}