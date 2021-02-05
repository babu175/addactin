package com.adactin.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPage {

	public static WebDriver driver;

//	WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
//	firstname.sendKeys("Mohamed");
//	Thread.sleep(1000);
//
//	WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
//	lastname.sendKeys("Thabresh");
//	Thread.sleep(1000);
//
//	WebElement billingadress = driver.findElement(By.xpath("//textarea[@id='address']"));
//	billingadress.sendKeys("chennai");
//	Thread.sleep(1000);
//
//	WebElement ccnumber = driver.findElement(By.xpath("//input[@id='cc_num']"));
//	ccnumber.sendKeys("4521485796587454");
//	Thread.sleep(1000);
//
//	WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
//	cardtype.click();
//	Select s6 = new Select(cardtype);
//	s6.selectByIndex(1);
//	Thread.sleep(1000);
//
//	WebElement expMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
//	expMonth.click();
//	Select s7 = new Select(expMonth);
//	s7.selectByIndex(9);
//	Thread.sleep(1000);
//
//	WebElement expYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
//	expYear.click();
//	Select s8 = new Select(expYear);
//	s8.selectByIndex(11);
//	Thread.sleep(1000);
//
//	WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
//	cvv.sendKeys("585");
//	Thread.sleep(1000);
//
//	WebElement bookNow_Btn = driver.findElement(By.xpath("//input[@id='book_now']"));
//	bookNow_Btn.click();
//	Thread.sleep(1000);
//
//	WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
//	logout.click();
	
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billingaddress;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardnumber;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expmonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expyear;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement booknow;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;


	public BookHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getLogout() {
		return logout;
	}

}
