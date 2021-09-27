package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import jdk.internal.org.jline.utils.Log;
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
public class stepDefination8 extends abstractpagestepDefination{
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());
	
	WebDriver driver=getDriver();
	private page1 p;
	
	public stepDefination8() throws IOException {
		super();
		p=new page1(driver);
		
		
	}


    @When("^User hovers over kidsroom icon$")
    public void user_hovers_over_kidsroom_icon() throws Throwable {
		Thread.sleep(7000);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Actions act = new Actions(driver);
			WebElement move=p.getKidsRoom();//drop down without clicking
			act.moveToElement(move).build().perform();
			System.out.println("Hovered over kidsroom header");
			Log.info("Hovered over kids room header");
		}

    @Then("^kidsroom dropdown is displayed$")
    public void kidsroom_dropdown_is_displayed() throws Throwable {
	        System.out.println("Kids room suboptions displayed");
	        Log.info("Kids room sub options displayed");
	    }

    @Then("^User clicks on kidsdecor$")
    public void user_clicks_on_kidsdecor() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			p.getKidsDecor().click();
			System.out.println("Clicked on kidsroom suboption");
			Log.info("Clicked on kids room suboption");
	    }
	    
    @And("^The page title is verified$")
    public void the_page_title_is_verified() throws Throwable {
		System.out.println(driver.getTitle());
	    }

	}