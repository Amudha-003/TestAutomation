package com.StepDefinitionFile;

import java.io.IOException;

import com.TestRunnerFile.TestRunner;
import com.pageobjectmanger.Pagemanager;
import com.propertyFile.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends TestRunner {

	Pagemanager pom = new Pagemanager(driver);
	ConfigurationReader cr;

	@Given("User Launched The Url Of The Blaze")
	public void user_launched_the_url_of_the_blaze() throws IOException {
		cr = new ConfigurationReader();
		getUrl("https://www.demoblaze.com/index.html");
		maximize();
	}

	@When("User Click On The Login Option")
	public void user_click_on_the_login_option() {

		clickOnElement(pom.getLoginpage().getLoginbtn());

	}

	@When("User Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() throws InterruptedException {
		Thread.sleep(5000);
		InputElement(pom.getLoginpage().getUsername(), cr.get_username());
	}

	@When("User Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
		InputElement(pom.getLoginpage().getPassword(), cr.get_password());
	}

	@Then("User Click The Login Button")
	public void user_click_the_login_button() {
		clickOnElement(pom.getLoginpage().getLoginbtn2());

	}

	@When("User Click On The Product")

	public void user_click_on_the_product() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElement(pom.getSelection_product().getMobile());
		Thread.sleep(5000);
	}

	@When("User Click On The Add to cart")
	public void user_click_on_the_add_to_cart() throws InterruptedException {

		clickOnElement(pom.getSelection_product().getAddtocart());
		Thread.sleep(3000);
	}

	@When("Click the ok on the alert")
	public void click_the_ok_on_the_alert() throws InterruptedException {

		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

	@When("User Click on the Cart option")
	public void user_click_on_the_cart_option() throws InterruptedException {

		Thread.sleep(3000);
		clickOnElement(pom.getSelection_product().getCartpage_btn());

	}

	@When("Click On The Place Order Button")
	public void click_on_the_place_order_button() throws InterruptedException {
		Thread.sleep(3000);

		clickOnElement(pom.getCart_page().getPl_order());

	}

	@When("Enter The Name In The Name Field")
	public void enter_the_name_in_the_name_field() throws InterruptedException, IOException {
		cr = new ConfigurationReader();
		Thread.sleep(5000);
		InputElement(pom.getCart_page().getName(), cr.get_name());

	}

	@When("Enter The Country In The Country Field")
	public void enter_the_country_in_the_country_field() {
		InputElement(pom.getCart_page().getCountry(), cr.get_country());
	}

	@When("Enter The City In The City Field")
	public void enter_the_city_in_the_city_field() {
		InputElement(pom.getCart_page().getCity(), cr.get_city());
	}

	@When("Enter The CreditCardNumber In The CreditCard Field")
	public void enter_the_credit_card_number_in_the_credit_card_field() {
		InputElement(pom.getCart_page().getCard(), cr.get_card());
	}

	@When("Enter The CardExpiryMonth In The Month Field")
	public void enter_the_card_expiry_month_in_the_month_field() {
		InputElement(pom.getCart_page().getMonth(), cr.get_month());
	}

	@When("Enter The CardExpiryYear In The Year Field")
	public void enter_the_card_expiry_year_in_the_year_field() {
		InputElement(pom.getCart_page().getYear(), cr.get_year());
	}

	@When("Click On The Purchase")
	public void click_on_the_purchase() {
		clickOnElement(pom.getCart_page().getPurchase_btn());
	}

	@Then("User Can Get The Purchase Summary")
	public void user_can_get_the_purchase_summary() {
		String gettextvalue = gettextvalue(pom.getCart_page().getPurchase_details());
		System.out.println(gettextvalue);
	}

}
