package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("You choose worng driver\n\nPlease choose \n1. chorme  \n2. edge");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void alert(String msg) {
		Alert ale = driver.switchTo().alert();
		if (msg.equalsIgnoreCase("accept")) {
			ale.accept();
		} else if (msg.equalsIgnoreCase("dismiss")) {
			ale.dismiss();
		}
	}

	public static void mouse(WebElement element, String action) {
		Actions a = new Actions(driver);
		if (action.equalsIgnoreCase("move")) {
			a.moveToElement(element).perform();
		} else if (action.equalsIgnoreCase("click")) {
			a.click(element).perform();
		} else if (action.equalsIgnoreCase("right click")) {
			a.contextClick(element).perform();
		} else if (action.equalsIgnoreCase("double click")) {
			a.doubleClick(element).perform();
		}
	}

	public static void frame() {
		// TODO Auto-generated method stub

	}

	public static void robot(String button) throws AWTException {
		Robot r = new Robot();
		if (button.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} else if (button.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (button.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (button.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		} else if (button.equalsIgnoreCase("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		}
	}

	private void windowHandle() {
		// TODO Auto-generated method stub

	}

	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int val = Integer.parseInt(value);
			s.selectByIndex(val);
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(value);
		}
	}

	public static void isEnable(WebElement element) {
		boolean val = element.isEnabled();
		if (val == true) {
			System.out.println("The given Element is Enable");
		} else {
			System.out.println("The given Element is Diable");
		}
	}

	public static void isDisplayed(WebElement element) {
		boolean val = element.isDisplayed();
		if (val == true) {
			System.out.println("The given Element is Displayed");
		} else {
			System.out.println("The given Element is Not Displayed");
		}
	}

	public static void isSelected(WebElement element) {
		boolean val = element.isSelected();
		if (val == true) {
			System.out.println("The given Element is Selected");
		} else {
			System.out.println("The given Element is Not Selected");
		}
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean val = s.isMultiple();
		if (val == true) {
			System.out.println("This Drop Down is Multiple");
		} else {
			System.out.println("This Drop Down is Not Multiple");
		}
	}

	public static void inputClear(WebElement element) {
		element.clear();
	}

	public static void inputPass(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}

	public static void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec * 1000);
	}

	public static void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void takeScreenShot(String path) throws Throwable {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dec = new File(path);
		FileUtils.copyFile(src, dec);
	}

	public static void scroll(String type) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollBy(0, -500);");
		} else if (type.equalsIgnoreCase("down")) {
			js.executeScript("window.scrollBy(0, 1000);");
		}
	}

	public static String value;

	public static String particular_Data_Read(String path, String sheet_name, int Row_index, int Cell_index)
			throws Throwable {
		File f = new File(path);
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheet_name);
		Row r = s.getRow(Row_index);
		Cell c = r.getCell(Cell_index);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			value = c.getStringCellValue();

		} else if (type.equals(CellType.NUMERIC)) {
			double cellValue = c.getNumericCellValue();
			value = Double.toString(cellValue);
		}
		return value;
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}
}
