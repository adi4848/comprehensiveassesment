package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import pageobjects.page1;
import reusablecomponents.ReusableComponents;
import reusablecomponents.ReusableMethods;
import runner.runner;
import utilities.dataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.Logger;
@RunWith(Cucumber.class)
public class stepDefination7 extends abstractpagestepDefination{
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());

	WebDriver driver=getDriver();
	private page1 p;
	
	public stepDefination7() throws IOException {
		super();
		p=new page1(driver);
		
		
	}


	 @When("^User hovers over study icon$")
	    public void user_hovers_over_study_icon() throws Throwable {
			Thread.sleep(7000);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Actions act = new Actions(driver);
			WebElement move=p.getStudy();//drop down without clicking
			act.moveToElement(move).build().perform(); 
			System.out.println("Hovered over study header");
			log.info("Hovered over study header");
		}

	    @Then("^study dropdown is displayed$")
	    public void study_dropdown_is_displayed() throws Throwable {
	        System.out.println("dropdown for study header displayed");
	        log.info("Dropdown for study header displayed");
	    }

	    @Then("^User clicks on studylamps$")
	    public void user_clicks_on_studylamps() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			p.getStudyLamp().click();
			System.out.println("Sub option for study clicked");
			log.info("Suboption selected for study");
	    }
	    
	    @And("^It is verified whether study page is displayed$")
	    public void it_is_verified_whether_study_page_is_displayed() throws Throwable {
			System.out.println(p.getStorageResult());
	    }

	}