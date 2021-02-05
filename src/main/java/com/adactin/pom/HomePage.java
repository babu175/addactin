package com.adactin.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;

//	WebElement username = driver.findElement(By.id("username"));
//	username.sendKeys("Mohamed78");
//
//	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//	password.sendKeys("123456789");
//	Thread.sleep(1000);
//
//	WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
//	login.click();
//	Thread.sleep(1000);
//	(//input[@class='login_input'])[1]
	//input[@type='text']

	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
