package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LoginPage extends BasePage {

	public static final String TITLE = "";

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "username")
	WebElement name;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "Login")
	WebElement login;

	@FindBy(id = "rememberUn")
	WebElement rememberMe;

	public void enterUserName(String userName) {
		waitForVisibleElement(10,name);
		name.sendKeys(userName);
	}

	public void clearPasswordField() {
		password.clear();
	}

	public void enterpassword(String passWord) {
		password.sendKeys(passWord);
	}

	public void clickOnLoginButton() {
		login.click();
	}

	public void clickRememberMeCheckBox() {
		rememberMe.click();
	}

	@FindBy(id = "forgot_password_link")
	WebElement forgotPassWord;

	public void clickOnforgotPassWordLink() {
		forgotPassWord.click();
	}

	@FindBy(id = "un")
	WebElement forgotPassWordPage;

	public void clickOnforgotPassWordpageEnterusername(String userName) {
		forgotPassWordPage.sendKeys(userName);
	}

	@FindBy(id = "continue")
	WebElement continueButton;

	public void clickOnContinueButton() {
		continueButton.click();
	}

	@FindBy(id = "error")
	WebElement error;

	// String Expected = "Please enter your password.";

//	public void loginPageValidation(String expected) {
//		validateString(error, expected);
//	}

	public interface Messages {
		String TITLE = "Home Page ~ Salesforce - Developer Edition";
	}
}