package com.adactin.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage {

	public static WebDriver driver;

//	WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
//	location.click();
//	Select s = new Select(location);
//	s.selectByIndex(2);
//	Thread.sleep(1000);
//
//	WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
//	hotels.click();
//	Select s1 = new Select(hotels);
//	s1.selectByIndex(3);
//	Thread.sleep(1000);
//
//	WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
//	roomtype.click();
//	Select s2 = new Select(roomtype);
//	s2.selectByIndex(1);
//	Thread.sleep(1000);
//
//	WebElement numberofrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
//	numberofrooms.click();
//	Select s3 = new Select(numberofrooms);
//	s3.selectByIndex(2);
//	Thread.sleep(1000);
//
//	WebElement in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
//	in.sendKeys("08/01/2021");
//	Thread.sleep(1000);
//
//	WebElement out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
//	out.sendKeys("09/01/2021");
//	Thread.sleep(1000);
//
//	WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
//	adults.click();
//	Select s4 = new Select(adults);
//	s4.selectByIndex(1);
//	Thread.sleep(1000);
//
//	WebElement childs = driver.findElement(By.xpath("//select[@id='child_room']"));
//	childs.click();
//	Select s5 = new Select(childs);
//	s5.selectByIndex(0);
//	Thread.sleep(1000);
//
//	WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
//	search.click();

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room_type;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement room_nos;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement in;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement out;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adults;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childs;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;

	public SearchHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getIn() {
		return in;
	}

	public WebElement getOut() {
		return out;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChilds() {
		return childs;
	}

	public WebElement getSearch() {
		return search;
	}

}
