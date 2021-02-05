package com.adactin.runner;

import java.io.IOException;
import java.sql.Driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClassAutomation;
import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.Feature", 
				glue = "com\\adactin\\stepdefinition",
//				tags = {"@SmokeTest"},
				plugin = {"pretty", "html:Reports/Cucumber.html", "json:Reports/Cucumber.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Reports/CucumberExtentReport.html"},
				monochrome = true,
				dryRun = false,
				strict = true)
public class AdactinRunnerClass {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {

//		ConfigurationReader cr = new ConfigurationReader();
//		String browsingName = cr.getBrowserName();
//		driver = BaseClassAutomation.getBrowser(browsingName);
	
		String browserName = FileReaderManager.getInstance().getcrInstance().getBrowserName();
		driver = BaseClassAutomation.getBrowser(browserName);
		
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	
}
