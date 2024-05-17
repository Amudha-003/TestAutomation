package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(id = "login2")
	private WebElement Loginbtn;
	@FindBy(id = "loginusername")
	private WebElement username;
	@FindBy(id = "loginpassword")
	private WebElement password;
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginbtn2;

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn2() {
		return loginbtn2;
	}

	public LoginPage(WebDriver dri) {
		driver =dri;
		PageFactory.initElements(driver, this);
	}

}
