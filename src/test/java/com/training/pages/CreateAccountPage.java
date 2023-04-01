package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class CreateAccountPage extends BasePage {

	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[text()='Accounts']")
	WebElement Accounts;
	@FindBy(xpath = "//a[text()='Home']")
	WebElement home;

	public void clickOnHomeTab() {
		home.click();
	}

	public void clickOnAccountTab() {
		Accounts.click();
	}

	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")
	WebElement opty;

	public void clickOnOptyTab() {
		opty.click();
	}

	@FindBy(xpath = "//a[text()='Contacts']")
	WebElement contactsTab;

	public void contactTab() {
		contactsTab.click();
	}

	@FindBy(id = "lexNoThanks")
	WebElement newaccount;

	public void clickOncreateAccount() {
		waitForVisibleElement(10, AccountClick);
		newaccount.click();
	}

	@FindBy(id = "tryLexDialogX")
	WebElement AccountClick;

	public void clickOncreateAccountlink() {

		AccountClick.click();
	}

	@FindBy(id = "createNewButton")
	WebElement createNewButton;

	public void clickOncreateNewButton() {
		createNewButton.click();
	}

	@FindBy(xpath = "//a[@class='accountMru menuButtonMenuLink']")
	WebElement newLink;

	public void clickOnNewLink() {
		newLink.click();
	}

	@FindBy(id = "acc2")
	WebElement accountName;

	public void clickOnAccountName(String accountname) {
		waitForVisibleElement(20, accountName);
		accountName.sendKeys(accountname);
	}

	@FindBy(xpath = "//a[text()='Leads']")
	WebElement leadTab;

	public void clickOnLeadsTab() {
		leadTab.click();
	}

	@FindBy(id = "acc6")
	WebElement typeDropDown;

	public void clickOnTypeDropDown(String selectType) {
		Select select = new Select(typeDropDown);
		select.selectByVisibleText(selectType);
	}

	@FindBy(id = "00NDm000005yNLW")
	WebElement priorityDropDown;

	public void clickOnPriorityDropDown(String selectPriority) {
		Select select = new Select(priorityDropDown);
		select.selectByVisibleText(selectPriority);
	}

	@FindBy(xpath = "(//input[@class='btn'])[4]")
	WebElement Okbutton;

	public void clickOnOkButton() {
		Okbutton.click();
	}

	@FindBy(xpath = "//a[text()='Create New View']")
	WebElement createNewView;

	public void clickOnCreateNewViewLink() {
		createNewView.click();
	}

	@FindBy(id = "fname")
	WebElement viewName;

	public void clearViewName() {
		waitForVisibleElement(20, viewName);
		viewName.clear();
	}

	public void enterViewName(String viewname) {
		viewName.sendKeys(viewname);
	}

	@FindBy(id = "devname")
	WebElement viewuniqName;

	public void clickViewuniqName() {
		viewuniqName.click();
	}
//
//	public void enterViewuniqName(String uniquename) {
//		viewuniqName.sendKeys(uniquename);
//	}

	@FindBy(xpath = "(//input[@class='btn primary'])[1]")
	WebElement ok;

	public void clickonsavebutton() {
		ok.click();
	}

	@FindBy(id = "fcf")
	WebElement viewDropDownlist;

	public void clickonViewDropDown() {
		Select viewDropdown = new Select(viewDropDownlist);
		viewDropdown.selectByVisibleText("LeonLeon");
	}

	@FindBy(xpath = "//a[text()='Edit']")
	WebElement edit;

	public void clickoneditbutton() {
		edit.click();
	}

	@FindBy(id = "fcol1")
	WebElement fieldDropDownlist;

	public void clickonfieldDropDown() {
		Select viewDropdown1 = new Select(fieldDropDownlist);
		viewDropdown1.selectByVisibleText("Account Name");
	}

	@FindBy(id = "fop1")
	WebElement operatorDropDownlist;

	public void operatorldDropDown() {
		Select operatorldDropDown = new Select(operatorDropDownlist);
		operatorldDropDown.selectByVisibleText("contains");
	}

	@FindBy(id = "fval1")
	WebElement valueDropDown;

	public void clearonvaluedropDown() {
		valueDropDown.clear();
	}

	public void clickonvaluedropDown() {
		valueDropDown.sendKeys("a");
	}

	@FindBy(xpath = "(//input[@class='btn primary'])[2]")
	WebElement clicksaveinaccountedit;

	public void clicksaveinaccountedit() {
		clicksaveinaccountedit.click();
	}

	@FindBy(xpath = "//a[text()='Merge Accounts']")
	WebElement mergeLink;

	public void clickOnMergeLink() {
		mergeLink.click();
	}

	@FindBy(id = "srch")
	WebElement findName;

	public void enterOnfindname(String accountname) {
		waitForVisibleElement(10, findName);
		findName.sendKeys(accountname);
	}

	@FindBy(xpath = "//input[@value='Find Accounts']")
	WebElement findAccount;

	public void clickOnfindAccountButton() {
		findAccount.click();
	}

	@FindBy(id = "cid0")
	WebElement checkBox1;

	public void clickOnCheckBob1() {
		checkBox1.click();
	}

	@FindBy(id = "cid1")
	WebElement checkBox2;

	public void clickOnCheckBob2() {
		checkBox2.click();
	}

	@FindBy(xpath = "(//input[@class='btn'])[3]")
	WebElement next;

	public void clickOnNextButton() {
		next.click();
	}

	@FindBy(xpath = "(//input[@title='Merge'])[2]")
	WebElement merge;

	public void clickOnMergeButton() {
		merge.click();
	}

	public void switchAlert() {
		driver.switchTo().alert().accept();
	}

	@FindBy(xpath = "//a[contains(text(),'Accounts with last')]")
	WebElement accountwithLastActivity;

	public void clickOnaccountwithLastActivitylink() {
		accountwithLastActivity.click();
	}

	@FindBy(id = "ext-gen152")
	WebElement calender;

	public void clickOncalender() {
		waitForVisibleElement(10, calender);
		calender.click();
	}

	@FindBy(id = "ext-gen152")
	WebElement date;

	public void clickOndate() {
		date.click();
	}

	@FindBy(xpath = "(//button[text()='Today'])[1]")
	WebElement datepic;

	public void clickOndatepic() {
		datepic.click();
	}

	@FindBy(id = "ext-gen154")
	WebElement datepicmonth;

	public void clickOndatepicmonth() {
		datepicmonth.click();
	}

	@FindBy(xpath = "(//button[text()='Today'])[2]")
	WebElement datepicmonthpic;

	public void clickOndatepicmonthpic() {
		datepicmonthpic.click();
	}

	@FindBy(id = "ext-gen49")
	WebElement datepicmonthpicselect;

	public void clickOndatepicmonthpicselect() {
		datepicmonthpicselect.click();
	}

	@FindBy(id = "saveReportDlg_reportNameField")
	WebElement saveReport;

	public void entersaveReport(String name) {

		saveReport.sendKeys(name);
	}

	@FindBy(id = "saveReportDlg_DeveloperName")
	WebElement developerName;

	public void enterdeveloperName(String dev) {

		developerName.sendKeys(dev);
	}

	@FindBy(xpath = "//button[@id='ext-gen312']")
	WebElement saveandRunreport;

	public void clicksaveandRunreport() {
		waitForVisibleElement(10, saveandRunreport);
		saveandRunreport.click();
	}

}
