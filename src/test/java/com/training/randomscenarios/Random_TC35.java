package com.training.randomscenarios;

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
import com.training.pages.CreateOptyPage;
import com.training.pages.HomePage;
import com.training.pages.LeadsPages;
import com.training.pages.LoginPage;
import com.training.pages.RandomScenariosPage;

public class Random_TC35 extends BaseTest {

	WebDriver driver;
	LoginPage login;
	String url;
	HomePage homepage;
	CreateAccountPage accountpage;
	CreateOptyPage createopty;
	LeadsPages leadspage;
	RandomScenariosPage randomscenarios;

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
		createopty = new CreateOptyPage(driver);
		leadspage = new LeadsPages(driver);
		randomscenarios=new RandomScenariosPage(driver);
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Test 35");
		login.enterUserName("ani@anstar.com");
		login.enterpassword("le0nDhas");
		login.clickOnLoginButton();
	}

	@Test
	public void verifyTabCustomization() throws InterruptedException {
		Thread.sleep(5000);
		randomscenarios.clickOnplus();
		randomscenarios.clickOncustomizetab();
		randomscenarios.clickOnAvailableDropDown("App Launcher");
		randomscenarios.clickOnAddButton();
		randomscenarios.clickOnSelectedTabDropDown("App Launcher");
		randomscenarios.clickOnRemoveButton();
		randomscenarios.clickOnSaveButton();
		homepage.clickOnUserMenuDropDown();
		homepage.clicklogOutFromUserMenuDropDown();
		login.enterUserName("ani@anstar.com");
		login.enterpassword("le0nDhas");
		login.clickOnLoginButton();
	}

	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}
}
