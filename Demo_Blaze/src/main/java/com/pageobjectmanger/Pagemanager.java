package com.pageobjectmanger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageObjectModel.Cart_page;
import com.pageObjectModel.LoginPage;
import com.pageObjectModel.Selection_product;



public class Pagemanager {
	
	
	WebDriver driver;
	
	private  Cart_page cp;
	
	private LoginPage lp;
	
	private Selection_product sp;

	public Cart_page getCart_page() {
		
		cp = new Cart_page(driver);
		return cp;
	}

	public LoginPage getLoginpage() {
		lp = new LoginPage(driver);
		return lp;
	}

	public Selection_product getSelection_product() {
		sp = new Selection_product(driver);
		return sp;
	}
	
	public Pagemanager(WebDriver dri) {
		
		driver = dri;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
