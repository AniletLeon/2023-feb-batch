package com.training.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class HomePage extends BasePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(id = "userNavLabel")
	WebElement userMenuDropDown;

	public void clickOnUserMenuDropDown() {

		waitForVisibleElement(10, userMenuDropDown);
		userMenuDropDown.click();
	}

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logOutInUserMenuDropDown;

	public void clicklogOutFromUserMenuDropDown() {

		logOutInUserMenuDropDown.click();
	}

	@FindBy(xpath = "//a[text()='My Profile']")
	WebElement myProfile;

	public void clickOnMyProfile() throws InterruptedException {
		waitForVisibleElement(10, myProfile);
		myProfile.click();

	}

	@FindBy(xpath = "(//img[@title='Edit Profile'])[1]")
	WebElement editProfile;

	public void clickOnEditProfile() throws InterruptedException {

		waitForVisibleElement(10, editProfile);
		editProfile.click();
	}
//Edit Profile Page

	@FindBy(xpath = "(//iframe)[3]")
	WebElement frameInEditProfilePage;

	public void switchToFrameInEditprofilepage() throws InterruptedException {
		//Thread.sleep(1000);
		waitForVisibleElement(30,frameInEditProfilePage);
		driver.switchTo().frame(frameInEditProfilePage);
	}

	@FindBy(xpath = "//a[contains(text(),'About')]")
	WebElement aboutTab;

	public void clickOnAboutTabInEditProfilePage() {
		aboutTab.click();
	}

	@FindBy(id = "lastName")
	WebElement enterLastName;

	public void clearLastNameInEditProfilePage() {

		enterLastName.clear();
	}

	public void EnterLastNameInEditProfilePage(String lastName) {

		enterLastName.sendKeys(lastName);
	}

	@FindBy(xpath = "//input[@value='Save All']")
	WebElement saveallButton;

	public void clickSaveAllButtonInAboutTab() {

		saveallButton.click();
	}

	// ---file upload
	// ---
	@FindBy(xpath = "(//span[@class='publisherattachtext '])[1]")
	WebElement post;

	public void clickOnPostLink() {
		post.click();
	}

	@FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement framePost;

	public void switchtoDriverInPost() {
		driver.switchTo().frame(framePost);
	}

	@FindBy(xpath = "//body[@contenteditable='true']")
	WebElement testArea;

	public void enterTestInTestArea(String test) {
		testArea.sendKeys(test);
		driver.switchTo().defaultContent();
	}

	@FindBy(xpath = "//input[@name='publishersharebutton']")
	WebElement share;

	public void clickOnShareButton() {
		share.click();
	}

	@FindBy(xpath = "//span[text()='File']")
	WebElement file;

	public void clickOnFileLink() {
		file.click();
	}

	@FindBy(id = "chatterUploadFileAction")
	WebElement uploadFilefromcomputer;

	public void clickONuploadFilefromcomputer() {
		uploadFilefromcomputer.click();
	}

	@FindBy(id = "chatterFile")
	WebElement choosefile;

	public void clickOnChooseFileButton() {
		choosefile.sendKeys("C:\\Users\\anile\\OneDrive\\Desktop\\ScreenShot\\What is Polymorphism.docx");
	}

	@FindBy(id = "publishersharebutton")
	WebElement publish;

	public void clickOnPublishButton() {
		publish.click();
	}
	// image Upload link

	@FindBy(id = "uploadLink")
	WebElement addPhoto;

	public void clickOnAddPhotoLink() {
		Actions action = new Actions(driver);
		action.moveToElement(addPhoto).click().build().perform();
	}

	@FindBy(id = "uploadPhotoContentId")
	WebElement frameLink;

	@FindBy(xpath = "(//form[@id='j_id0:uploadFileForm']/input)[2]")
	WebElement picture;

	public void clickOnChooseFileLink() {
		driver.switchTo().frame(frameLink);
		waitForVisibleElement(10, picture);
		picture.sendKeys("C:\\Users\\anile\\OneDrive\\Desktop\\naslovna.jpg");
	}

	@FindBy(xpath = "(//input[@value='Save'])[2]")
	WebElement save;

	public void clickOnSaveInImage() {
		waitForVisibleElement(10, save);
		save.click();
	}

	@FindBy(id = "j_id0:j_id7:save")
	WebElement publishImage;

	public void clickOnPublishImageButton() throws InterruptedException {
		// try {
		publishImage.click();
		// }catch (Exception e) {
		// e.printStackTrace();
	}
	
	@FindBy(xpath="//a[text()='My Settings']")
	WebElement mySetting;
	public void clickOnMySetting() {
		waitForVisibleElement(10,mySetting);
		mySetting.click();
	}
	@FindBy(xpath="//a[text()='Developer Console']")
	WebElement developerConsole;
	public void clickOnDeveloperConsole() {
		waitForVisibleElement(10,developerConsole);
		developerConsole.click();
		Set<String> wind=driver.getWindowHandles();
		Iterator<String> it=wind.iterator();
		String paraent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.close();
		driver.switchTo().window(paraent);
	}
}
