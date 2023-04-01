package com.training.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class LeadsPages extends BasePage {

	WebDriver driver;

	public LeadsPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(id = "fcf")
	WebElement leadTab;

	public void clickLeadsTab() {
		leadTab.click();
	}
	
	@FindBy(id = "lea3")
	WebElement companyName;
	
	public void enterCompanyName(String name) {
		companyName.sendKeys(name);
	}
	@FindBy(xpath = "//input[@value=' New ']")
	WebElement newButon;
	
	public void clickNewButtonInLeadTab() {
		newButon.click();
	}
	@FindBy(id = "name_lastlea2")
	WebElement lastName;
	
	public void enterLastName(String lastname) throws InterruptedException {
		Thread.sleep(5000);
		lastName.sendKeys(lastname);
	}
	
	@FindBy(xpath = "//input[@value=' Go! ']")
	WebElement gobutton;
	
	public void clickGoButton() {
		waitForVisibleElement(20,gobutton);
		gobutton.click();
	}

	List<String> expected = Arrays.asList("All Open Leads", "My Unread Leads", "Recently Viewed Leads", "Today's Leads",
			"View - Custom 1", "View - Custom 2");

	public void dropdownVAlidation() {
		validationList(leadTab, expected);
	}
	@FindBy(id="fcf")
	WebElement dropDown;
	public void clickTodayLeadDropDown(String stringdata) {
		Select select=new Select(dropDown);
		select.selectByVisibleText(stringdata);
	}
	@FindBy(xpath = "(//input[@title='Save'])[2]")
	WebElement saveButton;
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	@FindBy(xpath = "//h2[@class='topName']")
	WebElement actualheading;
	String expectedHeading="ABCD";
	
	
}
