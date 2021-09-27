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

import com.sun.tools.sjavac.Log;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.Logger;
@RunWith(Cucumber.class)
public class stepDefination3 extends abstractpagestepDefination{
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());
	
	WebDriver driver=getDriver();
	private page1 p;
	
	public stepDefination3() throws IOException {
		super();
		p= new page1(driver);
		
		
		
	}


	@When("^User hovers over sale icon$")
    public void user_hovers_over_sale_icon() throws Throwable {
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions act= new Actions(driver);
		WebElement hover=p.getSale();
		act.moveToElement(hover).build().perform();
		System.out.println("Hovered over sales header");
		Log.info("Sales header hovered");
 }

    @Then("^Sale dropdown is displayed$")
    public void sale_dropdown_is_displayed() throws Throwable {
        System.out.println("dropdown acessed");
        Log.info("Sales options displayed");
    }

    @Then("^User clicks on getsale$")
    public void user_clicks_on_getsale() throws Throwable {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        p.getSale().click();    
        System.out.println("Sales suboption clicked");
        Log.info("Sales suboption clicked");
        }

    @And("^It is verified whether sale page is displayed$")
    public void it_is_verified_whether_sale_page_is_displayed() throws Throwable {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(p.getSaleResult().getText());
		
    }


}
