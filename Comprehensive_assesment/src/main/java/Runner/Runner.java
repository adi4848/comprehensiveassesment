package Runner;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Pageobject.page1;
import Pageobject.page2;
import Reusablemethods.RE_Components;
import Reusablemethods.RE_Methods;
import UIstore.page1UI;
import UIstore.page2UI;
import Utilities.DATADRIVER;
import Utilities.PROPERTYFILEREADER;
import Utilities.a_EXTENTREPORT;
import Utilities.a_OPENREPORT;

public class Runner extends RE_Components {
	WebDriver driver;
	Actions action;
	private DATADRIVER DATA;
	page1 p1;
	page2 p2;
	page1UI p1ui;
	page2UI p2ui;
	public static Logger log = (Logger) LogManager.getLogger(Runner.class.getName());
	ExtentReports reporter;
	static ExtentTest test;

	public Runner() throws IOException {
		super();
		driver = RE_Components.initializeDriver();
		action = new Actions(driver);
		p1 = new page1(driver);
		p2 = new page2();
		p1ui = new page1UI();
		p2ui = new page2UI();
		DATA = new DATADRIVER();
//		file:///C:/Users/Aditya/eclipse-workspace/Comprehensive_assesment/ExtentReports/Comprehensive_assesment-2021-09-25%2005-36-48.html

	}

	@BeforeSuite
	public void set() {
		reporter = a_EXTENTREPORT.generateReport();

	}

	@BeforeTest
	public void startbrowser() {

		driver.manage().window().maximize();
		RE_Methods.getURL(driver);
	}
	@Test(priority=13)
	public void giftcards() {
		test=reporter.createTest("Verifying the giftcard option");
		p1.giftcards().click();
		if(driver.getTitle().contains("Gift Card - Buy Gift Cards & Vouchers Online for Wedding, Birthday | Urban Ladder")) {
			Assert.assertTrue(true);
			log.info("Giftstore option verified ");
			System.out.println("Giftstore option verified");
			test.pass("Verified the giftcard option");
			
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Giftstore option not verified");
			log.info("Giftcard option not verified ");
			test.fail("Giftcard verification failed");
			
			
		}
		

		
	}
	@Test(priority=12)
	public void bulkorder() {
		test=reporter.createTest("Verifying the bulkorder option");
		p1.bulkoder().click();
		if(driver.getTitle().contains("Buy In Bulk | Urban Ladder")) {
			Assert.assertTrue(true);
			log.info("Bulkstore option verified ");
			System.out.println("Bulkorder option verified");
			test.pass("Verified the bulkorder option");
			
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Bulkstore option not verified");
			log.info("Bulkstore option not verified ");
			test.fail("Bulkorder verification failed");
			
		}
		
	}
//
//	@Test(priority=0, dataProvider="LoginData")
//	public void login(String mail, String pass) throws InterruptedException {
//		test=reporter.createTest("Logging in using email and password");
//		try {
//		action.moveToElement(p1.loginstep1()).perform();
//		System.out.println("hovered --------------------------------------------");
//		p1.login().click();
//		System.out.println("clicked-------------------------------");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		p1.entermail().sendKeys(mail);
//		p1.enterpassword().sendKeys(pass);
//		p1.loginbutton().click();
//		test.pass("Sucessfully logged in to urban ladder ");
//		log.info("Sucessfully logged in to urban ladder");
//		}catch(Exception e ) {
//			test.fail("Unable to login ");
//			log.info("Login unsucessful");
//			
//		}
//
//	}
//
//	@Test(priority=1)
//	public void check_sale() {
//		test=reporter.createTest("Check header sales & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened sales header and acessed the sub option");
//			log.info("Sucessfully opened sales header and acessed sub option ");
//			
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for sales header failed");
//			log.error("---?? Unable to open sales header ??----");
//		}
//		
//		
//	}
//	@Test(priority=2)
//	public void check_living() {
//		test=reporter.createTest("Check header living & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened living header and acessed the sub option");
//			log.info("Sucessfully opened living header and acessed sub option ");
//
//			
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for living header failed");
//			log.error("---?? Unable to open living header ??----");
//
//		}
//	}
//		
//		
//	
//		@Test(priority=3)
//	public void check_bedroom() {
//		test=reporter.createTest("Check header bedrom & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened bedroom header and acessed the sub option");
//			log.info("Sucessfully opened bedroom header and acessed sub option ");
//
//			
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for bedroom header failed");
//			log.error("---?? Unable to open bedroom header ??----");
//
//		}
//		
//		
//	}@Test(priority=4)
//	public void check_dining() {
//		test=reporter.createTest("Check header dining & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened dining header and acessed the sub option");
//			log.info("Sucessfully opened dining header and acessed sub option ");
//
//			
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for dining header failed");
//			log.error("---?? Unable to open dining header ??----");
//
//		}
//		
//		
//	}@Test(priority=5)
//	public void check_storage() {
//		test=reporter.createTest("Check header storage & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened storage header and acessed the sub option");
//			log.info("Sucessfully opened storage header and acessed sub option ");
//
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for storage header failed");
//			log.error("---?? Unable to open storage header ??----");
//
//		}
//		
//		
//	}@Test(priority=6)
//	public void check_study() {
//		test=reporter.createTest("Check header study & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened study header and acessed the sub option");
//			log.info("Sucessfully opened study header and acessed sub option ");
//
//			
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for study header failed");
//			log.error("---?? Unable to open study header ??----");
//
//		}
//		
//		
//	}@Test(priority=7)
//	public void check_kidsroom() {
//		test=reporter.createTest("Check header kidsroom & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened kidsroom header and acessed the sub option");
//			log.info("Sucessfully opened kids_room header and acessed sub option ");
//
//			
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for kidsroom header failed");
//			log.error("---?? Unable to open kids_room header ??----");
//
//		}
//		
//		
//	}@Test(priority=8)
//	public void mattress() {
//		test=reporter.createTest("Check header mattress & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened mattress header and acessed the sub option");
//			log.info("Sucessfully opened mattress header and acessed sub option ");
//
//			
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for mattress header failed");
//			log.error("---?? Unable to open mattress header ??----");
//
//		}
//		
//		
//		
//	}@Test(priority=9)
//	public void decor() {
//		test=reporter.createTest("Check header decor & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened decor header and acessed the sub option");
//			log.info("Sucessfully opened decor header and acessed sub option ");
//
//			
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for decor header failed");
//			log.error("---?? Unable to open decor header ??----");
//
//		}
//		
//		
//	}@Test(priority=10)
//	public void collection() {
//		test=reporter.createTest("Check header sales & suboption");
//		try {
//			action.moveToElement(p1.sale()).perform();
//			p1.sub_sale().click();
//			Assert.assertTrue(true);
//			test.pass("Opened colection header and acessed the sub option");
//			log.info("Sucessfully opened collection header and acessed sub option ");
//
//			
//			
//			
//		}catch(Exception e) {
//			Assert.assertTrue(false);
//			test.fail("Test for collection header failed");
//			log.error("---?? Unable to open collection header ??----");
//
//		}
//	}
//		
//
//
//	@Test(priority = 11, dataProvider = "getSearchData")
//	public void searchitem(String item) {
//		test=reporter.createTest("Searching items");
//		p1.searchbox().clear();
//		try {
//			RE_Methods.getURL(driver);
//			p1.searchbox().click();
//			p1.searchbox().sendKeys(item);
//			p1.searchbox().sendKeys(Keys.ENTER);
//
//			System.out.println("Element searched and clicked");
//			test.pass("The item "+item+" has been searched and results are diplayed");
//			List<WebElement> el = driver.findElements(By.className("product-img"));
//			System.out.println("There are " + el.size() + " " + item + " displayed");
//			for (WebElement elements : el) {
//				System.out.println(elements.getText());
//			}
//			log.info("Search for " + item + " sucessfull");
//			p1.searchbox().clear();
//
//		} catch (Exception e) {
//			log.error("Search for " + item + " Unsucessfull");
//			test.fail("The item "+item+ " was not found ");
//
//		}
//
//	}
//
//	@DataProvider
//	public Object[][] getSearchData() throws IOException {
//		ArrayList<String> h = DATA.getData("TestData", "Searchitem");
//		int size = h.size();
//		Object[][] data = new Object[size - 1][1];
//
//		for (int i = 1; i < size; i++) {
//
//			data[i - 1][0] = h.get(i);
//		}
//		return data;
//
//	}
//
//	@DataProvider
//	public Object[][] LoginData() throws IOException {
//		Object[][] data = new Object[1][2];
//		data[0][0] = PROPERTYFILEREADER.loadFile().getProperty("id");
//		data[0][1] = PROPERTYFILEREADER.loadFile().getProperty("pass");
//
//		return data;
//	}

	@AfterTest
	public void close() { 
		driver.close();
	}
	@AfterSuite
	public void endSuite() throws InterruptedException, IOException {
		reporter.flush();
//		String report = a_OPENREPORT.openReport().getCanonicalPath();
//		System.out.println(report);
////		RE_Components.initializeDriver();
//		driver.get(report);
	}

}
