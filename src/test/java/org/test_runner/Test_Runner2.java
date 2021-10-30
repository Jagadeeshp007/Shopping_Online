package org.test_runner;

import org.base.Base_Class;
import org.helper.File_Read;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".\\src\\test\\java\\org\\feature_file\\Shop_2.feature", 
		glue = "org.step_def2", 
		monochrome = true, 
		dryRun = false, 
		strict = true,
//		tags = ("@RegrationTest, @smokeTest"), 
		plugin = {"html:Report/cucumber_Rep2",
				"pretty",
				"json:Report/Json_Rep2.json",
//				"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Rep2.html"
		}
)

public class Test_Runner2 extends Base_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() throws Throwable {
		String browser = File_Read.getFile().getInstance2().getBrowser();
		driver = getBrowser(browser);
	}

	@AfterClass
	public static void browserClose() {
		driver.close();
	}
}