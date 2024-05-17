package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;

	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void InputElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static void sleep() throws InterruptedException {

		Thread.sleep(5000);
	}

	public static String gettextvalue(WebElement ele) {
		return ele.getText();
	}

}
