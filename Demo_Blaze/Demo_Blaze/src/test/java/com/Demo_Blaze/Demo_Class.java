package com.Demo_Blaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Class {
public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.demoblaze.com/index.html");

// driver.findElement(By.id("signin2")).click();

// Thread.sleep(5000);

// driver.findElement(By.id("sign-username")).sendKeys("Amudha12");
//
//
// driver.findElement(By.id("sign-password")).sendKeys("Amudha12");
//
// driver.findElement(By.xpath("//button[text()='Sign up']")).click();
//
// driver.switchTo().alert().accept();

driver.findElement(By.id("login2")).click();

Thread.sleep(5000);

driver.findElement(By.id("loginusername")).sendKeys("Amudha12");

driver.findElement(By.id("loginpassword")).sendKeys("Amudha12");

driver.findElement(By.xpath("//button[text()='Log in']")).click();

Thread.sleep(5000);

driver.findElement(By.linkText("Samsung galaxy s6")).click();

Thread.sleep(3000);

driver.findElement(By.linkText("Add to cart")).click();

Thread.sleep(3000);
driver.switchTo().alert().accept();

Thread.sleep(3000);
driver.findElement(By.id("cartur")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//button[text()='Place Order']")).click();

Thread.sleep(3000);

driver.findElement(By.id("name")).sendKeys("Amudha");

driver.findElement(By.id("country")).sendKeys("india");

driver.findElement(By.id("city")).sendKeys("chennai");

driver.findElement(By.id("card")).sendKeys("4000000000001000");

driver.findElement(By.id("month")).sendKeys("11");
driver.findElement(By.id("year")).sendKeys("2026");
driver.findElement(By.xpath("//button[text()='Purchase']")).click();

Thread.sleep(3000);

WebElement purchaseID = driver.findElement(By.xpath("//p[@class='lead text-muted ']"));
String ID = purchaseID.getText();
System.out.println(ID);

}

}
