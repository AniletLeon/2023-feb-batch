package com.training.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	String url;
	CommonUtilities property = new CommonUtilities();

	public WebDriver getDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public String getUrl(String applicationURL) throws IOException {
		url = property.getProperty(applicationURL);
		return url;
	}

	public void takeScreenShot() {
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File src = screenshot.getScreenshotAs(OutputType.FILE);

		Date currentDate = new Date();
		String timestamp = new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(currentDate);

		String path = "C:\\Users\\anile\\OneDrive\\Documents\\Anilet\\TestNgFramework\\screenshot\\salesforce"
				+ timestamp + ".jpeg";
		File detination = new File(path);
		try {
			FileUtils.copyFile(src, detination);
		} catch (IOException e) {
			e.printStackTrace();
		}
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

}
