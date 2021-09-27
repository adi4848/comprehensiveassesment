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
public class stepDefination10 extends abstractpagestepDefination{
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());
	
	WebDriver driver=getDriver();
	private page1 p;
	
	public stepDefination10() throws IOException {
		super();
		p=new page1(driver);
		
	}

	 @When("^User clicks on bulk orders$")
	    public void user_clicks_on_bulk_orders() throws Throwable {
			//Thread.sleep(8000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			p.getBulkOder().click();
			System.out.println("Clicked on bulorder option ");
			Log.info("Acessed the bulk order option ");
	    }

	    @Then("^bulk order page is opened$")
	    public void bulk_order_page_is_opened() throws Throwable {
             System.out.println("Clicked and loading bulkorder............");
             Log.info("Clicked and loading bulk order");
	    }

	    @And("^bulk order title is verified$")
	    public void bulk_order_title_is_verified() throws Throwable {
			System.out.println(driver.getTitle());
	    }

	}