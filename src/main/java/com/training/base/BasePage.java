package com.training.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void waitForVisibleElement(int time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void validateCurrentPageTitle(WebElement string, String expected) {
		Assert.assertEquals(getWebElementText(string), expected);
	}

	private String getWebElementText(WebElement element) {
		return element.getText();
	}

	public void validateString(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}



	public void validationList(WebElement actualList, List<String> expectedList) {
		List<String> actualStrings = new ArrayList<String>();
		Select select = new Select(actualList);
		List<WebElement> list = select.getOptions();
		for (WebElement e : list) {
			actualStrings.add(e.getText());

		}
	}

}
