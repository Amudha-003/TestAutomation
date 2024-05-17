package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {

	WebDriver driver;

	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement place_order;

	@FindBy(id = "name")
	private WebElement name;

	@FindBy(id = "country")
	private WebElement country;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "card")
	private WebElement card;

	@FindBy(id = "month")
	private WebElement month;

	@FindBy(id = "year")
	private WebElement year;

	@FindBy(xpath = "//button[text()='Purchase']")
	private WebElement Purchase_btn;

	@FindBy(xpath = "//p[@class='lead text-muted ']")
	private WebElement Purchase_details;

	public WebElement getPl_order() {
		return place_order;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getPurchase_btn() {
		return Purchase_btn;
	}

	public WebElement getPurchase_details() {
		return Purchase_details;
	}

	public Cart_page(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);
	}

}
