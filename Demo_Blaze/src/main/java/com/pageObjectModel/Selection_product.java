package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection_product {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	private WebElement mobile;

	@FindBy(linkText = "Add to cart")
	private WebElement addtocart;
	
	@FindBy(id = "cartur")
	private WebElement cartpage_btn;

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCartpage_btn() {
		return cartpage_btn;
	}
	
	public Selection_product(WebDriver dri) {
		driver =dri;
		PageFactory.initElements(driver, this);	}
}
