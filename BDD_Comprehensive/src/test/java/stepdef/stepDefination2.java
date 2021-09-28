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

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.Logger;
@RunWith(Cucumber.class)
public class stepDefination2 extends abstractpagestepDefination{
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());
	
	WebDriver driver=getDriver();
	private page1 p;
	
	public stepDefination2() throws IOException {
		super();
		p=new page1(driver);
		
		
	}



    @When("^User clicks on searchbox area$")
    public void user_clicks_on_searchbox_area() throws Throwable {
    	p.getSearchBox().click();
    	System.out.println("User clicks on search box");
    	log.info("User clicked on search box");
        
    }

    @Then("^User enters (.+)$")
    public void user_enters(String item) throws Throwable {
    
    	p.getSearchBox().sendKeys(item);
    	p.getSearchBoxClick().click();
    	ReusableMethods.getURL(driver);
    	System.out.println(item+" Entered in search box and searched");
    	log.info("User entered "+item+" in search box ");
    	
        
    }

    @And("^User clicks on searchbox icon$")
    public void user_clicks_on_searchbox_icon() throws Throwable {
    	System.out.println("Search sucessful");
    	log.info("Srearch sucessful");
    	
      
    }

    @And("^dining table page is displayed$")
    public void dining_table_page_is_displayed() throws Throwable {
    	System.out.println("item displayed");
    	log.info("Item displayed");
    	
        
    }

//    @When("^User clicks on searchbox area$")
//    public void user_clicks_on_searchbox_area() throws Throwable {
//    	h.getSearchBox().click();
//    }
//
//    @Then("^User enters \"([^\"]*)\"$")
//    public void user_enters_something(String strArg1) throws Throwable {
//		h.getSearchBox().sendKeys(strArg1);
//    }
//
//    @And("^User clicks on searchbox icon$")
//    public void user_clicks_on_searchbox_icon() throws Throwable {
//		h.getSearchBoxClick().click();
//    }
//
//    @And("^dining table page is displayed$")
//    public void dining_table_page_is_displayed() throws Throwable {
//		System.out.println(s.getSearchResult().getText());
//    }



}
