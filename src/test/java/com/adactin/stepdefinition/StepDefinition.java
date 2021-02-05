package com.adactin.stepdefinition;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClassAutomation;
import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookHotelPage;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;
import com.adactin.runner.AdactinRunnerClass;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class StepDefinition extends BaseClassAutomation {

	public static WebDriver driver = AdactinRunnerClass.driver;
	PageObjectManager pom=new PageObjectManager(driver);
			

	public void beforeHooks(Scenario scenario) {
	
	}

	public void aftereHooks() {
System.out.println("s");
	}

	@Given("^user launches the application$")
	public void user_launches_the_application() throws Throwable {
//		driver = getBrowser("chrome");
//		geturl("https://adactinhotelapp.com/");

//		ConfigurationReader cr= new ConfigurationReader();
//		String url = cr.getUrl();
//		geturl(url);

		String url = FileReaderManager.getInstance().getcrInstance().getUrl();
		geturl(url);
	}

//	@When("^user enters the valid username in the username field$")
//	public void user_enters_the_valid_username_in_the_username_field() throws Throwable {
//		HomePage hp = new HomePage(driver);
//		sendkeysOnElement(hp.getUsername(), "Mohamed78");
//	}
//
//	@When("^user enters the valid password in the password field$")
//	public void user_enters_the_valid_password_in_the_password_field() throws Throwable {
//		HomePage hp = new HomePage(driver);
//		sendkeysOnElement(hp.getPassword(), "123456789");
//	}

	@When("^user enters the valid username in the \"([^\"]*)\" field$")
	public void user_enters_the_valid_username_in_the_field(String username)  {
//		HomePage hp = new HomePage(driver);
		sendkeysOnElement(pom.getHp().getUsername(), username);
	}

	@When("^user enters the valid password in the \"([^\"]*)\" field$")
	public void user_enters_the_valid_password_in_the_field(String password)  {
//		HomePage hp = new HomePage(driver);
		sendkeysOnElement(pom.getHp().getPassword(), password);
	}

	@When("^user clicks the login button$")
	public void user_clicks_the_login_button()  {
//		HomePage hp = new HomePage(driver);
		clickOnWebelement(pom.getHp().getLogin());
	}

	@Then("^user verifies whether the Homepage navigates to the Search Hotel Page$")
	public void user_verifies_whether_the_Homepage_navigates_to_the_Search_Hotel_Page() throws Throwable {

	}

	@When("^user selects the location in the location field$")
	public void user_selects_the_location_in_the_location_field()  {
//		SearchHotelPage sh = new SearchHotelPage(driver);
		selectByDropdown(pom.getSc().getLocation(), "1", "index");
	}

	@When("^user selects the hotel in the hotel field$")
	public void user_selects_the_hotel_in_the_hotel_field()  {
//		SearchHotelPage sh = new SearchHotelPage(driver);
		selectByDropdown(pom.getSc().getHotels(), "1", "index");

	}

	@When("^user selects the room type in the room type field$")
	public void user_selects_the_room_type_in_the_room_type_field() {
//		SearchHotelPage sh = new SearchHotelPage(driver);
		selectByDropdown(pom.getSc().getRoom_type(), "1", "index");
	}

	@When("^user selects the number of rooms$")
	public void user_selects_the_number_of_rooms()  {
//		SearchHotelPage sh = new SearchHotelPage(driver);
		selectByDropdown(pom.getSc().getRoom_nos(), "1", "index");
	}

	@When("^user selects the check in date$")
	public void user_selects_the_check_in_date()  {
//		SearchHotelPage sh = new SearchHotelPage(driver);
		sendkeysOnElement(pom.getSc().getIn(), "11/01/2021");
	}

	@When("^user selects the check out date$")
	public void user_selects_the_check_out_date()  {
//		SearchHotelPage sh = new SearchHotelPage(driver);
		sendkeysOnElement(pom.getSc().getOut(), "12/01/2021");
	}

	@When("^user selects adult per room$")
	public void user_selects_adult_per_room()  {
//		SearchHotelPage sh = new SearchHotelPage(driver);
		selectByDropdown(pom.getSc().getAdults(), "1", "index");
	}

	@When("^user selects children per room$")
	public void user_selects_children_per_room()  {
//		SearchHotelPage sh = new SearchHotelPage(driver);
		selectByDropdown(pom.getSc().getChilds(), "1", "index");

	}

	@When("^user clicks on the search button to search the given details$")
	public void user_clicks_on_the_search_button_to_search_the_given_details()  {
//		SearchHotelPage sh = new SearchHotelPage(driver);
		clickOnWebelement(pom.getSc().getSearch());
	}

	@Then("^user verifies whether the Search Hotel page navigates to Select a Hotel page$")
	public void user_verifies_whether_the_Search_Hotel_page_navigates_to_Select_a_Hotel_page()  {
	}

	@When("^user clicks on the Selected radio button$")
	public void user_clicks_on_the_Selected_radio_button()  {
//		SelectHotelPage sh = new SelectHotelPage(driver);
		clickOnWebelement(pom.getSl().getRadio_Btn());
	}

	@When("^user clicks on the continue button$")
	public void user_clicks_on_the_continue_button()  {
//		SelectHotelPage sh = new SelectHotelPage(driver);
		clickOnWebelement(pom.getSl().getContinue_Btn());
	}

	@Then("^user verifies whether the select a hotel page navigates to book a hotel page$")
	public void user_verifies_whether_the_select_a_hotel_page_navigates_to_book_a_hotel_page()  {
	}

	@When("^user enters the firstname in the FirstName field$")
	public void user_enters_the_firstname_in_the_FirstName_field()  {
//		BookHotelPage bhp = new BookHotelPage(driver);
		sendkeysOnElement(pom.getBh().getFirstname(), "Mohamed");
	}

	@When("^user enters the lastname in the LastName field$")
	public void user_enters_the_lastname_in_the_LastName_field()  {
//		BookHotelPage bhp = new BookHotelPage(driver);
		sendkeysOnElement(pom.getBh().getLastname(), "Thabresh");
	}

	@When("^user enters the billing address in the Billing Address field$")
	public void user_enters_the_billing_address_in_the_Billing_Address_field()  {
//		BookHotelPage bhp = new BookHotelPage(driver);
		sendkeysOnElement(pom.getBh().getBillingaddress(), "salem");
	}

	@When("^user enters the credit card type in the Credit card type field$")
	public void user_enters_the_credit_card_type_in_the_Credit_card_type_field()  {
//		BookHotelPage bhp = new BookHotelPage(driver);
		sendkeysOnElement(pom.getBh().getCardnumber(), "4765449494949489");

	}

	@When("^user selects the credit card type$")
	public void user_selects_the_credit_card_type() throws Throwable {
//		BookHotelPage bhp = new BookHotelPage(driver);
		selectByDropdown(pom.getBh().getCardtype(), "1", "index");
	}

	@When("^user selects the expiry date of the credit card$")
	public void user_selects_the_expiry_date_of_the_credit_card() throws Throwable {
//		BookHotelPage bhp = new BookHotelPage(driver);
		selectByDropdown(pom.getBh().getExpmonth(), "9", "index");
	}

	@When("^user selects the expiry year of the credit card$")
	public void user_selects_the_expiry_year_of_the_credit_card() throws Throwable {
//		BookHotelPage bhp = new BookHotelPage(driver);
		selectByDropdown(pom.getBh().getExpyear(), "11", "index");
	}

	@When("^user enters the cvv in the Cvv field$")
	public void user_enters_the_cvv_in_the_Cvv_field() throws Throwable {
//		BookHotelPage bhp = new BookHotelPage(driver);
		sendkeysOnElement(pom.getBh().getCvv(), "478");
	}

	@When("^user clicks the book button to book the room$")
	public void user_clicks_the_book_button_to_book_the_room() throws Throwable {
//		BookHotelPage bhp = new BookHotelPage(driver);
		clickOnWebelement(pom.getBh().getBooknow());
	}

	@Then("^user verifies whether the Book a hotel page navigates to Booking Confirmation page$")
	public void user_verifies_whether_the_Book_a_hotel_page_navigates_to_Booking_Confirmation_page() throws Throwable {
	}

	@When("^user verify and clicks the LogoutButton$")
	public void user_verify_and_clicks_the_LogoutButton() throws Throwable {
//		BookHotelPage bhp = new BookHotelPage(driver);
		clickOnWebelement(pom.getBh().getLogout());
	}

	@Then("^user succesfuly logout the webpage$")
	public void user_succesfuly_logout_the_webpage() throws Throwable {
	}

}
