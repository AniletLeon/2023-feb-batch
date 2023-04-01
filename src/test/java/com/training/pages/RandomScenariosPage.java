package com.training.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.base.BasePage;

public class RandomScenariosPage extends BasePage {

	public static final String TITLE = "";

	WebDriver driver;

	public RandomScenariosPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//h1[@class='currentStatusUserName']/a")
	WebElement firstandlastName;
	
	
	@FindBy(id = "userNavButton")
	WebElement profile;
	
	@FindBy(id = "tailBreadcrumbNode")
	WebElement firstlastName;
	
	@FindBy(xpath = "//img[@class='allTabsArrow']")
	WebElement plus;
	
	@FindBy(xpath = "//input[@value='Customize My Tabs']")
	WebElement custamizetab;
	
	@FindBy(id = "duel_select_0")
	WebElement dropDownAvailableTab;
	
	@FindBy(xpath = "//img[@title='Add']")
	WebElement add;
	
	@FindBy(id = "duel_select_1")
	WebElement selectedtab;
	
	@FindBy(xpath = "//img[@title='Remove']")
	WebElement remove;
	
	@FindBy(xpath = "//input[@title='Save']")
	WebElement save;
	
	@FindBy(xpath = "//span[@class='pageDescription']/a")
	WebElement currentdate;
	
	@FindBy(xpath = "//a[contains(text(),'8:00 PM')]")
	WebElement eight;
	
	@FindBy(xpath = "//img[@class='comboboxIcon']")
	WebElement combolink;
	
	@FindBy(xpath = "//li[@class='listItem4']/a")
	WebElement other;
	
	@FindBy(id = "EndDateTime_time")
	WebElement endtime;
	
	@FindBy(id = "timePickerItem_42")
	WebElement nine;
	
	@FindBy(xpath = "(//input[@title='Save'])[2]")
	WebElement save1;
	
	@FindBy(xpath = "//a[contains(text(),'4:00 PM')]")
	WebElement four;
	
	@FindBy(id = "timePickerItem_38")
	WebElement seven;
	
	@FindBy(id = "IsRecurrence")
	WebElement recurrence;
	
	@FindBy(id = "rectypeftw")
	WebElement weekly;
	
	@FindBy(id = "RecurrenceEndDateOnly")
	WebElement recurrencendDate;
	
	@FindBy(xpath = "//td[text()='29']")
	WebElement todayDate;
	
	@FindBy(xpath = "//img[@class='monthViewIcon']")
	WebElement monthviewIcon;
	
	
	public void clickOnFirstandLastNameLink() {
		firstandlastName.click();
	}
	public void validation() {
		Assert.assertEquals(getProfileNamelink(), getlinkfistandlastnamelink());
	}
	
	public String getlinkfistandlastnamelink() {
		String linkname=firstlastName.getText().trim();
		return linkname;
	}
	public String getProfileNamelink() {
		waitForVisibleElement(20,profile);
		String profileName=profile.getText().trim();
		return profileName;
	}
	public void clickOnplus() {
		plus.click();
	}
	public void clickOncustomizetab() {
		waitForVisibleElement(10,custamizetab);
		custamizetab.click();
	}
	public void clickOnAvailableDropDown(String avialabletab) {
		waitForVisibleElement(10,dropDownAvailableTab);
		Select select=new Select(dropDownAvailableTab);
		select.selectByVisibleText(avialabletab);
	}
	public void clickOnAddButton() {
		add.click();
	}
	public void clickOnSelectedTabDropDown(String selected) {
		Select select=new Select(selectedtab);
		select.selectByVisibleText(selected);
	}
	public void clickOnRemoveButton() {
		remove.click();
	}
	public void clickOnSaveButton() {
		save.click();
	}
	public void clickOnCurrentDate() {
		currentdate.click();
	}
	public void clickOnEightPMLink() {
		waitForVisibleElement(10,eight);
		eight.click();
	}
	public void clickOnSubjectComboLink() {
		combolink.click();
	}
	public void clickOtherInComboWindow() {
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String paraentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		waitForVisibleElement(10,other);
		other.click();
		driver.switchTo().window(paraentWindow);
	}
	public void clickOnEndTime() {
		endtime.click();
	}
	public void clickNinePM() {
		nine.click();
	}
	public void clickOnSaveButton1() {
		save1.click();
	}
	public void clickOnfourLink() {
		four.click();
	}
	public void clickOnSevenLink() {
		seven.click();
	}
	public void clickRecurrence() {
		recurrence.click();
	}
	public void weeklyRadioButton() {
		weekly.click();
	}
	public void recurrencendDate() {
		recurrencendDate.click();
	}
	public void clicktodayDate() {
		todayDate.click();
	}
	public void clickmonthviewIcon() {
		monthviewIcon.click();
	}
}
