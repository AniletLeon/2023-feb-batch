package com.training.createaccounttestcases;

import java.io.IOException;
import java.util.Random;

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

public class CreateAccount_TC14_AccountReport extends BaseTest {

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
		Log.startTestCase("Test 14");
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
	public void clickOnLastActivy() throws InterruptedException {
		accountpage.clickOnaccountwithLastActivitylink();
		accountpage.clickOncalender();
		accountpage.clickOndate();
		accountpage.clickOndatepic();
		accountpage.clickOndatepicmonth();
		accountpage.clickOndatepicmonthpic();
		accountpage.clickOndatepicmonthpicselect();
		Random random = new Random();
		accountpage.entersaveReport("ans"+random.nextInt(1000));
		
		accountpage.enterdeveloperName("ans"+random.nextInt(1000) );
		Thread.sleep(5000);
		accountpage.clicksaveandRunreport();
	}

	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}

}
