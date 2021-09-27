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
public class stepDefination9 extends abstractpagestepDefination{
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());
	
	private page1 p;
	
	public stepDefination9() throws IOException {
		super();
		p=new page1(driver);
		
		
	}

	 @When("^User clicks on gift card$")
	    public void user_clicks_on_gift_card() throws Throwable {
			Thread.sleep(8000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			p.getGiftCard().click();
			System.out.println("Acessing the gift card option");
			Log.info("Acessing the gift card option ");
	    }

	    @Then("^gift card page is opened$")
	    public void gift_card_page_is_opened() throws Throwable {
             System.out.println("Giftcard clicked and loading....");
             log.info("Giftcard clicked and loading ...........");
	    }

	    @And("^gift card title is verified$")
	    public void gift_card_title_is_verified() throws Throwable {
			System.out.println(driver.getTitle());
	    }

	}