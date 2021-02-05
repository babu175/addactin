package com.adactin.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BABU\\eclipse-workspace\\com.automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("babuvvvvv");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("babu12345");
		Thread.sleep(1000);

		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		Thread.sleep(1000);
		
//***************************************************************
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		location.click();
		Select s = new Select(location);
		s.selectByIndex(2);
		Thread.sleep(1000);

		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		hotels.click();
		Select s1 = new Select(hotels);
		s1.selectByIndex(3);
		Thread.sleep(1000);

		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		roomtype.click();
		Select s2 = new Select(roomtype);
		s2.selectByIndex(1);
		Thread.sleep(1000);

		WebElement numberofrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		numberofrooms.click();
		Select s3 = new Select(numberofrooms);
		s3.selectByIndex(2);
		Thread.sleep(1000);

		WebElement in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		in.sendKeys("08/01/2021");
		Thread.sleep(1000);

		WebElement out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		out.sendKeys("09/01/2021");
		Thread.sleep(1000);

		WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		adults.click();
		Select s4 = new Select(adults);
		s4.selectByIndex(1);
		Thread.sleep(1000);

		WebElement childs = driver.findElement(By.xpath("//select[@id='child_room']"));
		childs.click();
		Select s5 = new Select(childs);
		s5.selectByIndex(0);
		Thread.sleep(1000);

		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
		

//		******************************************************************
		

		
		Thread.sleep(6000);
		WebElement radio_Btn = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		radio_Btn.click();
		Thread.sleep(1000);

		WebElement continue_Btn = driver.findElement(By.xpath("//input[@id='continue']"));
		continue_Btn.click();
		Thread.sleep(1000);
		
//*****************************************************************************
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstname.sendKeys("babu");
		Thread.sleep(1000);

		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys("v");
		Thread.sleep(1000);

		WebElement billingadress = driver.findElement(By.xpath("//textarea[@id='address']"));
		billingadress.sendKeys("chennai");
		Thread.sleep(1000);

		WebElement ccnumber = driver.findElement(By.xpath("//input[@id='cc_num']"));
		ccnumber.sendKeys("4521485796587454");
		Thread.sleep(1000);

		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		cardtype.click();
		Select s6 = new Select(cardtype);
		s6.selectByIndex(1);
		Thread.sleep(1000);

		WebElement expMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		expMonth.click();
		Select s7 = new Select(expMonth);
		s7.selectByIndex(9);
		Thread.sleep(1000);

		WebElement expYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		expYear.click();
		Select s8 = new Select(expYear);
		s8.selectByIndex(11);
		Thread.sleep(1000);

		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("585");
		Thread.sleep(1000);

		WebElement bookNow_Btn = driver.findElement(By.xpath("//input[@id='book_now']"));
		bookNow_Btn.click();
		Thread.sleep(1000);

		Thread.sleep(8000);
		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		logout.click();
		Thread.sleep(1000);

	}

}
