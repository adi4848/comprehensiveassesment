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
public class stepDefination1 extends abstractpagestepDefination {
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(runner.class.getName());
	
	private page1 p;
	WebDriver driver=getDriver();
	
	public stepDefination1() throws IOException {
		super();
		p=new page1(driver);
		
		
	}

    @Given("^User is on \"([^\"]*)\"$")
    public void user_is_on_something(String strArg1) throws Throwable {
		driver.manage().window().maximize();
		driver.get(strArg1);
		System.out.println("---------------------------User login test---------------");
		log.info("trail of log part1");
    }

    @When("^User hover on login and click on login$")
    public void user_hover_on_login_and_click_on_login() throws Throwable {
		Actions a = new Actions(driver);
		WebElement move=p.loginstep1();
		a.moveToElement(move).build().perform(); 
		p.login().click();
		System.out.println("hovered over login pop up");
    }

    @Then("^Login page popup is populated$")
    public void login_page_popup_is_populated() throws Throwable {
        Thread.sleep(10000);
        System.out.println("waiting for response");
		log.info("Logging in using id and password");

    }

    @And("^User enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_username_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
		p.entermail().sendKeys(strArg1);
		p.enterpassword().sendKeys(strArg2);
		System.out.println("Entering id and password");
		log.info("User logging in using id and password");
    }

    @And("^User clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
		p.loginbutton().click();
		System.out.println("logged in");
		log.info("User loged in sucessfully");
    }


}
