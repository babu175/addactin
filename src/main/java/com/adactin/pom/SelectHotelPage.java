package com.adactin.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	public static WebDriver driver;

//	WebElement radio_Btn = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
//	radio_Btn.click();
//	Thread.sleep(1000);
//
//	WebElement continue_Btn = driver.findElement(By.xpath("//input[@id='continue']"));
//	continue_Btn.click();
//	Thread.sleep(1000);

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radio_Btn;
///
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_Btn;

	public SelectHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_Btn() {
		return radio_Btn;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

}
