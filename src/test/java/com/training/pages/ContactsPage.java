package com.training.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class ContactsPage extends BasePage {

	WebDriver driver;

	public ContactsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//input[@type='button'])[3]")
	WebElement newButton;
	
	@FindBy(id = "name_lastcon2")
	WebElement lastName;
	
	@FindBy(id = "con4")
	WebElement companyName;
	
	@FindBy(xpath = "(//input[@value=' Save '])[2]")
	WebElement saveButton;
	
	@FindBy(xpath = "//a[text()='Create New View']")
	WebElement createNewView;
	
	@FindBy(id = "fname")
	WebElement viewName;
	
	@FindBy(id = "devname")
	WebElement UniqueName;
	
	@FindBy(id = "hotlist_mode")
	WebElement recentlyCreated;
	
	@FindBy(id = "fcf")
	WebElement view;
	
	@FindBy(xpath = "(//a[text()='Nickel'])[1]")
	WebElement contactNaem;
	
	@FindBy(xpath = "(//input[@value='Cancel'])[2]")
	WebElement cancel;
	
	@FindBy(xpath = "(//input[@title='Save & New'])[1]")
	WebElement saveandnew;

	public void clickOnNewButton() {
		waitForVisibleElement(10,newButton);
		newButton.click();
	}
	public void enterLastName(String LastName) {
		waitForVisibleElement(20,lastName);
		lastName.sendKeys(LastName);
	}
	public void enterCompanyName(String LastName) {
		companyName.sendKeys(LastName);
	}
	public void clickOnSaveButton() {
		saveButton.click();
	}
	public void clickOnCreateNewViewLink() {
		createNewView.click();
	}
	public void enterViewName(String ViewName) {
		waitForVisibleElement(10,viewName);
		Random random=new Random();
		String name=ViewName+random.nextInt(1000);
		viewName.sendKeys(name);
	}
	public void enterUniqueName(String ViewName) {
		waitForVisibleElement(10,UniqueName);
		UniqueName.sendKeys(ViewName);
	}
	public void recentlyEnterDropDown(String recentContact) {
		Select select=new Select(recentlyCreated);
		select.selectByVisibleText(recentContact);
	}
	public void viewDropDown(String selectviewdropdown) {
		Select select=new Select(view);
		select.selectByVisibleText(selectviewdropdown);
	}
	public void clickOnContactName() {
		contactNaem.click();
	}
	public void clickOnCancelButton() {
		cancel.click();
	}
	
	public void clickOnSaveAndNewButton() {
		saveandnew.click();
	}

}
