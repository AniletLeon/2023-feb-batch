package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class CreateOptyPage extends BasePage {


	public CreateOptyPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "fcf")
	WebElement dropdown;

	@FindBy(xpath = "//input[@title='New']")
	WebElement newOpry;

	@FindBy(id = "opp3")
	WebElement optyName;

	@FindBy(id = "opp4")
	WebElement accountNeme;
	
	@FindBy(id = "opp11")
	WebElement stagedropdown;

	@FindBy(id = "opp12")
	WebElement probability;
	
	@FindBy(id = "opp6")
	WebElement leadsourceDropDown;


	public void clickdropdown() {
		Select select = new Select(dropdown);
		select.selectByVisibleText("All Opportunities");
		List<WebElement> optyDropDown = select.getOptions();
		// <WebElement> it=optyDropDown.iterator();
		for (WebElement e : optyDropDown) {
			System.out.println(e.getText());
		}
	}

	
	public void clicknewOpry() {
		newOpry.click();
	}

	public void clickoptyName() {
		optyName.sendKeys("Edge Emergency Generator");
	}


	public void clickaccountNeme() {
		accountNeme.sendKeys("Edge Communications");
	}

	@FindBy(xpath = "//span[@class='dateFormat']/a")
	WebElement dateformat;

	public void clickdateformat() {
		dateformat.click();
	}



	public void clickstagedropdown() {
		Select stageDropDown1 = new Select(stagedropdown);
		stageDropDown1.selectByVisibleText("Qualification");
	}


	public void clickprobability() {
		probability.clear();

	}

	public void enterprobability() {
		probability.sendKeys("30");

	}

	

	public void clickleadsourceDropDown() {
		Select stageDropDown1 = new Select(leadsourceDropDown);
		stageDropDown1.selectByVisibleText("Phone Inquiry");
	}

	@FindBy(xpath = "(//input[@title='Save'])[2]")
	WebElement saveButton;

	public void clicksaveButton() {
		saveButton.click();
	}

	@FindBy(xpath = "//a[text()='Opportunity Pipeline']")
	WebElement opryPipeline;

	public void clickopryPipeline() {
		opryPipeline.click();
	}

	@FindBy(xpath = "//a[text()='Stuck Opportunities']")
	WebElement stuck;

	public void clickonStuckLink() {
		waitForVisibleElement(10,stuck);
		stuck.click();
	}
	@FindBy(id = "quarter_q")
	WebElement optyDropDown;
	
	public void clickonOptyDropdownk() {
		Select optyDropDown1=new Select(optyDropDown);
		optyDropDown1.selectByVisibleText("Current and Next FQ");
	}
	@FindBy(id = "open")
	WebElement includeDropDown;
	
	public void clickonIncludeDropDown() {
		Select includeDropDown1=new Select(includeDropDown);
		includeDropDown1.selectByVisibleText("Open Opportunities");
	}
	@FindBy(xpath = "//input[@value='Run Report']")
	WebElement clocksave;
	
	public void clickSave() {
		clocksave.click();
	}
	
}
