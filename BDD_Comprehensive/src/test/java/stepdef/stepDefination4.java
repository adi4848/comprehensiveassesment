package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.runner.Runner;
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
public class stepDefination4 extends abstractpagestepDefination{
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());
	
	WebDriver driver=getDriver();
	private page1 p;
	
	public stepDefination4() throws IOException {
		super();
		p=new page1(driver);
		
		
	}


	 @When("^User hovers over living icon$")
	    public void user_hovers_over_living_icon() throws Throwable {
			Thread.sleep(7000);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Actions act = new Actions(driver);
			WebElement move=p.getLiving();
			act.moveToElement(move).build().perform(); 
			System.out.println("Hovering over living header");
			log.info("Living header hovered");
		}

	    @Then("^Living dropdown is displayed$")
	    public void living_dropdown_is_displayed() throws Throwable {
	        System.out.println("Living options displayed");
	        log.info("Living options displayed");
	    }

	    @Then("^User clicks on sofaset$")
	    public void user_clicks_on_sofaset() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        p.getSofaSet().click();
	        System.out.println("Clicked on living sub option ");
	        log.info("Living suboption clicked");
	    }

	    @And("^It is verified whether living page is displayed$")
	    public void it_is_verified_whether_living_page_is_displayed() throws Throwable {
			System.out.println(p.getLivingResult().getText());
	    }

	}