package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablemethods.RE_Methods;
import UIstore.page1UI;

public class page1 {
	page1UI ui1 = new page1UI();
	private WebDriver driver;

	public page1(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement searchbox() {
		return RE_Methods.getElement(driver, ui1.searchbox);

	}

	public WebElement search_button() {
		return RE_Methods.getElement(driver, ui1.searchbutton);
	}

	public WebElement sale() {
		return RE_Methods.getElement(driver, ui1.sale);
	}

	public WebElement sub_sale() {
		return RE_Methods.getElement(driver, ui1.sub_sale);

	}

	public WebElement living() {
		return RE_Methods.getElement(driver, ui1.living);

	}

	public WebElement sub_living() {
		return RE_Methods.getElement(driver, ui1.sub_subliving);

	}

	public WebElement bedroom() {
		return RE_Methods.getElement(driver, ui1.bedroom);

	}

	public WebElement sub_bedroom() {
		return RE_Methods.getElement(driver, ui1.sub_subbedroom);

	}

	public WebElement dining() {
		return RE_Methods.getElement(driver, ui1.dining);

	}

	public WebElement sub_dining() {
		return RE_Methods.getElement(driver, ui1.sub_dining);

	}

	public WebElement storage() {
		return RE_Methods.getElement(driver, ui1.storage);

	}

	public WebElement sub_storage() {
		return RE_Methods.getElement(driver, ui1.sub_storage);

	}

	public WebElement study() {
		return RE_Methods.getElement(driver, ui1.study);

	}

	public WebElement sub_study() {
		return RE_Methods.getElement(driver, ui1.sub_study);

	}

	public WebElement kidsroom() {
		return RE_Methods.getElement(driver, ui1.kids);

	}

	public WebElement sub_kidsroom() {
		return RE_Methods.getElement(driver, ui1.sub_kids);

	}

	public WebElement matress() {
		return RE_Methods.getElement(driver, ui1.mattress);

	}

	public WebElement sub_mattress() {
		return RE_Methods.getElement(driver, ui1.sub_mattress);

	}

	public WebElement decor() {
		return RE_Methods.getElement(driver, ui1.decor);

	}

	public WebElement sub_decor() {
		return RE_Methods.getElement(driver, ui1.sub_decor);

	}

	public WebElement collection() {
		return RE_Methods.getElement(driver, ui1.collection);

	}

	public WebElement sub_collection() {
		return RE_Methods.getElement(driver, ui1.sub_collection);

	}

//	public By loginb1=By.xpath("//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]");
//	public By signupoption=By.xpath("//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/ul/li[2]/a");
//	public By loginoption=By.xpath("//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a");
//	public By entermail=By.xpath("//*[@id=\'spree_user_email\']");
//	public By enterpassword=By.xpath("//*[@id=\'spree_user_password\']");
//	public By loginbutton=By.xpath("//*[@id=\'ul_site_login\']");
	
	
	public WebElement loginstep1() {
		return RE_Methods.getElement(driver, ui1.loginb1);

	}public WebElement signin() {
		return RE_Methods.getElement(driver, ui1.signupoption);

	}public WebElement login() {
		return RE_Methods.getElement(driver, ui1.loginoption);

	}public WebElement entermail() {
		return RE_Methods.getElement(driver, ui1.entermail);

	}public WebElement enterpassword() {
		return RE_Methods.getElement(driver, ui1.enterpassword);

	}public WebElement  loginbutton() {
		return RE_Methods.getElement(driver, ui1.loginbutton);

	}
	
	public WebElement stores() {
		return RE_Methods.getElement(driver, ui1.stores);
	}
	public WebElement bulkoder() {
		return RE_Methods.getElement(driver, ui1.bulkorders);
	}
	public WebElement giftcards() {
		return RE_Methods.getElement(driver, ui1.giftcard);
	}
	

}
