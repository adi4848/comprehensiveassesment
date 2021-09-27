package Reusablemethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.PROPERTYFILEREADER;

public class RE_Methods {
	public static void getURL(WebDriver driver) {
		try {
			driver.get(PROPERTYFILEREADER.loadFile().getProperty("url"));
		} catch (Exception e) {
			System.out.println("URL not Found in Properties.properties");
		}
	}

	public static String getBrowser(WebDriver driver) {
		try {
			return PROPERTYFILEREADER.loadFile().getProperty("browser");
		} catch (Exception e) {
			System.out.println("Browser not Found in Properties.properties");
			return null;
		}
	}

	public static void impWait(WebDriver driver) throws NumberFormatException, IOException {

		int time = Integer.parseInt(PROPERTYFILEREADER.loadFile().getProperty("wait1"));
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public static WebElement getElement(WebDriver driver, By locator) {
		try {
			WebElement l = driver.findElement(locator);
			return l;
		} catch (Exception e) {
			// throw new TestException("Could not locate element at"+locator);
			System.out.println("Element not Found at" + locator);
			return null;
		}

	}

	public static String veriftext(WebDriver driver, By locator) {
		try {
			return driver.findElement(locator).getText();

		} catch (Exception e) {
			System.out.println("Element Not found ");
			return null;
		}

	}
}
