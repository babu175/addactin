package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotelPage;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;

public class PageObjectManager {

	public static WebDriver driver;

	private HomePage hp;
	private SearchHotelPage sc;
	private SelectHotelPage sl;
	private BookHotelPage bh;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public SearchHotelPage getSc() {
		sc= new SearchHotelPage(driver);
		return sc;
	}

	public SelectHotelPage getSl() {
		sl = new SelectHotelPage(driver);
				
		return sl;
	}

	public BookHotelPage getBh() {
		bh = new BookHotelPage(driver);
		return bh;
	}

}
