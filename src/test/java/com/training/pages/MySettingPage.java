package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class MySettingPage extends BasePage {

	WebDriver driver;

	public MySettingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "(//a[@class='header setupFolder'])[1]")
	WebElement personal;

	public void clickOnPersonaLink() {
		personal.click();
	}

	@FindBy(id = "LoginHistory_font")
	WebElement history;

	public void clickOnHistoryLink() {
		history.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Download login history for last six months')]")
	WebElement dowmLoadHostory;

	public void clickOnDownloadHistoryLink() {
		dowmLoadHostory.click();
	}

	@FindBy(id = "DisplayAndLayout_font")
	WebElement displayandlayout;

	public void clickOnDisplayAndLayout() {
		displayandlayout.click();
	}

	@FindBy(id = "CustomizeTabs_font")
	WebElement customize;

	public void clickOnCustomizeTab() {
		customize.click();
	}

	@FindBy(id = "p4")
	WebElement customizelink;

	public void customizeAppDropDown(String dropDown) {
		Select select = new Select(customizelink);
		select.selectByVisibleText(dropDown);
	}

	@FindBy(id = "duel_select_0")
	WebElement availableDropDown;

	public void clickOnAvailableDropDown(String availablelist) {
		Select select1 = new Select(availableDropDown);
		List<WebElement> listOption = select1.getOptions();
		for (WebElement element : listOption) {
			element.getText();
			if (element.getText().equalsIgnoreCase(availablelist)) {
				element.click();
				break;

			}
		}
	}

	@FindBy(xpath = "//img[@title='Add']")
	WebElement add;

	public void clickOnAdd() {
		add.click();
	}

	@FindBy(xpath = "//input[@class='btn primary']")
	WebElement save;

	public void clickOnsave() {
		save.click();
	}

	@FindBy(xpath = "(//a[@class='header setupFolder'])[3]")
	WebElement email;

	public void clickOnEmailLink() {
		email.click();
	}

	@FindBy(id = "EmailSettings_font")
	WebElement myEmailSetting;

	public void clickOnMyEmailSettings() {
		myEmailSetting.click();
	}

	@FindBy(id = "sender_name")
	WebElement emailName;

	public void clearMyEmailName() {
		emailName.clear();
	}

	public void enterMyEmailName(String name) {
		emailName.sendKeys(name);
	}

	@FindBy(id = "sender_email")
	WebElement emailAddress;

	public void clearemailAddress() {
		emailAddress.clear();
	}

	public void enterEmailAddress(String emailName) {
		emailAddress.sendKeys(emailName);
	}

	@FindBy(id = "auto_bcc1")
	WebElement atomaticBCC;

	public void clickOnAutomatiBCC() {
		atomaticBCC.click();
	}

	@FindBy(xpath = "//input[@type='submit']")
	WebElement saveInEmailPage;

	public void clickOnSaveInEmailLinkPage() {
		saveInEmailPage.click();
	}
	@FindBy(id = "CalendarAndReminders_font")
	WebElement caldenderandRemainder;
	
	public void clickOnCalenderAndRemainderLink() {
		caldenderandRemainder.click();
	}
	@FindBy(id = "Reminders_font")
	WebElement activityRemainder;
	
	public void clickOnActivityRemainderLink() {
		activityRemainder.click();
	}
	@FindBy(id = "testbtn")
	WebElement openTestRemainder;
	
	public void clickOnOpenTestRemainderButton() {
		openTestRemainder.click();
	}
	
}
