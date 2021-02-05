package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassAutomation {

	public static WebDriver driver;

	// BrowserLaunch

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Askar\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Askar\\eclipse-workspace\\SeleniumConcepts\\Driver\\IEDriverServer32.exe");
				driver = new InternetExplorerDriver();

			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Askar\\eclipse-workspace\\SeleniumConcepts\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			}

			else {
				System.out.println("Invalid Browser");
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	// maximize
	public static void max() {
		driver.manage().window().maximize();
	}

	public static void simpleAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void confirmAlert(String value) {
		try {

			Alert alert = driver.switchTo().alert();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			if (value.equalsIgnoreCase("ok")) {
				alert.accept();
			} else if (value.equalsIgnoreCase("cancel")) {
				alert.dismiss();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void promptAlert(String value, String text) {

		try {
			Alert alert = driver.switchTo().alert();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			if (value.equalsIgnoreCase("ok")) {
				alert.sendKeys(text);
				Thread.sleep(5000);
				alert.accept();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Waiting

	public static void waiting(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// closing

	public static void closing() {
		driver.close();
	}

	// quit

	public static void quiting() {
		driver.quit();
	}

	// going back

	public static void naviback() {
		driver.navigate().back();
	}

	public static void navigating(String url) {
		try {
			driver.navigate().to(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// forward

	public static void navifwd() {
		driver.navigate().forward();
	}

	// refresh

	public static void refreshing() {
		driver.navigate().refresh();
	}

	// getMethod

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// click

	public static void clickOnWebelement(WebElement element) {
		waiting(element);
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// sendkeys

	public static void sendkeysOnElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// dropdown

	public static void selectByDropdown(WebElement element, String value, String option) {
		Select s = new Select(element);

		if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue("value");
		} else if (option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText("value");
		}
	}

	// actions

	public static void movToElement(WebElement element) {
		waiting(element);
		try {

			Actions act = new Actions(driver);
			act.moveToElement(element).perform();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void curUrl() {
		driver.getCurrentUrl();
	}

	public static void title() {
		driver.getTitle();
	}

	public static void Screenshots(String filename) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(System.getProperty("user.dir")+("\\Screenshots\\"+filename+ ".png"));
			FileUtils.copyFile(source, destination);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void frameswitch(String number) {
		driver.switchTo().frame(number);
	}

}
