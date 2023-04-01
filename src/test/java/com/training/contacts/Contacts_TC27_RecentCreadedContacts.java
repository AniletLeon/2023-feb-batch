package com.training.contacts;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.ContactsPage;
import com.training.pages.CreateAccountPage;
import com.training.pages.CreateOptyPage;
import com.training.pages.HomePage;
import com.training.pages.LeadsPages;
import com.training.pages.LoginPage;

public class Contacts_TC27_RecentCreadedContacts extends BaseTest {

	WebDriver driver;
	LoginPage login;
	String url;
	HomePage homepage;
	CreateAccountPage accountpage;
	CreateOptyPage createopty;
	LeadsPages leadspage;
	ContactsPage contact;

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
		contact= new ContactsPage(driver);
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Test 27");
		login.enterUserName("ani@anstar.com");
		login.enterpassword("le0nDhas");
		login.clickOnLoginButton();
		Thread.sleep(3000);
		accountpage.contactTab();
		accountpage.clickOncreateAccount();
		accountpage.clickOncreateAccountlink();
	}

	@Test
	public void createnewContact() {
		contact.recentlyEnterDropDown("Recently Created");
	}

	@AfterMethod
	public void tearDown() {
		takeScreenShot();
		driver.close();
	}
}
