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
public class stepDefination5 extends abstractpagestepDefination{
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());

	WebDriver driver=getDriver();
	private page1 p;
	
	public stepDefination5() throws IOException {
		super();
		p=new page1(driver);
		
	}


	 @When("^User hovers over bedroom icon$")
	    public void user_hovers_over_bedroom_icon() throws Throwable {
			Thread.sleep(7000);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Actions act = new Actions(driver);
			WebElement move=p.getBedroom();//drop down without clicking
			act.moveToElement(move).build().perform(); 
			System.out.println("Acessing bedroom header");
			log.info("Acessing bedroom header");
		}

	    @Then("^bedroom dropdown is displayed$")
	    public void bedroom_dropdown_is_displayed() throws Throwable {
	        System.out.println("Bedroom header suboptions displayed");
	        log.info("Bedroom header suboptions diplayed");
	    }

	    @Then("^User clicks on mattress$")
	    public void user_clicks_on_mattress() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        p.getMattress().click();
	        System.out.println("Clicked on mattres header");
	        log.info("Matress suboptions displayed ");
	    }
	    

	    @And("^It is verified whether bedroom page is displayed$")
	    public void it_is_verified_whether_bedroom_page_is_displayed() throws Throwable {
			System.out.println(p.getBedroomResult().getText());
	    }

	}