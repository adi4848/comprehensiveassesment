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
public class stepDefination6 extends abstractpagestepDefination{
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());
	
	WebDriver driver=getDriver();
	private page1 p;
	
	public stepDefination6() throws IOException {
		super();
		p=new page1(driver);
	
		
	}


	 @When("^User hovers over storage icon$")
	    public void user_hovers_over_storage_icon() throws Throwable {
			Thread.sleep(7000);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Actions act = new Actions(driver);
			WebElement move=p.getStorage();
			act.moveToElement(move).build().perform(); 
			System.out.println("Hovered over storage header");
			Log.info("Hovered over the storage header");
		}

	    @Then("^storage dropdown is displayed$")
	    public void storage_dropdown_is_displayed() throws Throwable {
	        System.out.println("dropdown options displayed");
	        Log.info("Sub options for storage displayed");
	    }

	    @Then("^User clicks on shopbyrange$")
	    public void user_clicks_on_shopbyrange() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			p.getShopByRange().click();
			System.out.println("Clicked on suboption ");
			Log.info("Clicked on storage sub option");
	    }
	    
	    @And("^It is verified whether storage page is displayed$")
	    public void it_is_verified_whether_storage_page_is_displayed() throws Throwable {
			System.out.println(p.getStorageResult().getText());
	    }

	}