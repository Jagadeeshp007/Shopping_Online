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

		features = ".\\src\\test\\java\\org\\feature_file\\Shop_1.feature", 
		glue = "org.step_def1", 
		monochrome = true, 
		dryRun = false, 
		strict = true, 
//		tags = ("@RegrationTest, @smokeTest"), 
		plugin = {
				"html:Report/Cucumber_Rep1", 
				"pretty", 
				"json:Report/Json_Rep1.json",
//				"com.cucumber.listener.ExtendCucumberFormatter:Report/Extend_Rep1.html" 
				}
		)

public class Test_Runner1 {

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() throws Throwable {
		String browser = File_Read.getFile().getInstance1().getBrowser();
		driver = Base_Class.getBrowser(browser);
	}

	@AfterClass
	public static void browserClose() {
		Base_Class.close();
	}
}
