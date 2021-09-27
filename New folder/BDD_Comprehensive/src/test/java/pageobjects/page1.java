package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusablecomponents.ReusableMethods;
import uistore.page1ui;

public class page1 {
	page1ui p1 = new page1ui();
	private WebDriver driver;

	public page1(WebDriver driver) {
		this.driver = driver;
	}

	// -----------------------------------------------------------------
	public WebElement getBedroomResult() {
		return ReusableMethods.getElement(driver, p1.bedroomresult);
	}

	// -----------------------------------------------------------------
	public WebElement getDiningStorage() {
		return ReusableMethods.getElement(driver, p1.diningstorage);
	}

	// -----------------------------------------------------------------
	public WebElement getDiningResult() {
		return ReusableMethods.getElement(driver, p1.diningresult);
	}

	// -----------------------------------------------------------------
	public WebElement getShopByRange() {
		return ReusableMethods.getElement(driver, p1.shopbyrange);
	}

	// -----------------------------------------------------------------
	public WebElement getLivingResult() {
		return ReusableMethods.getElement(driver, p1.livingresult);
	}

	// -----------------------------------------------------------------
	public WebElement getMattress() {
		return ReusableMethods.getElement(driver, p1.mattress);
	}
	//-----------------------------------------------------------------
		public WebElement getSaleResult() {
			return ReusableMethods.getElement(driver, p1.saleresult);
		}
		
		//-----------------------------------------------------------------
		public WebElement getSofaSet() {
			return ReusableMethods.getElement(driver, p1.sofaset);
		}

		//-----------------------------------------------------------------
//		public WebElement getStorageResult() {
//			return ReusableMethods.getElement(driver, p1.storageresult);
//		}
		
		//-----------------------------------------------------------------
		public WebElement getStudyLamp() {
			return ReusableMethods.getElement(driver, p1.studylamps);
		}
		//-----------------------------------------------------------------
		public WebElement getStorageResult() {
			return ReusableMethods.getElement(driver, p1.storageresult);
		}
		
		//-----------------------------------------------------------------
		public WebElement getKidsDecor() {
			return ReusableMethods.getElement(driver, p1.kidsdecor);
		}
		//-----------------------------------------------------------------
		public WebElement getSearchBox() {
			return ReusableMethods.getElement(driver, p1.searchbox);
		}
		
		//-----------------------------------------------------------------
		public WebElement getSearchBoxClick() {
			return ReusableMethods.getElement(driver, p1.searchboxclick);
		}
		
		//-----------------------------------------------------------------
		public WebElement getSale() {
			return ReusableMethods.getElement(driver, p1.sale1);
		}
		
		//-----------------------------------------------------------------
		public WebElement getLiving() {
			return ReusableMethods.getElement(driver, p1.living);
		}
		
		//-----------------------------------------------------------------
		public WebElement getBedroom() {
			return ReusableMethods.getElement(driver, p1.bedroom);
		}
		
		//-----------------------------------------------------------------
		public WebElement getdining() {
			return ReusableMethods.getElement(driver, p1.dining);
		}
		
		//-----------------------------------------------------------------
		public WebElement getStorage() {
			return ReusableMethods.getElement(driver, p1.storage);
		}
		
		//-----------------------------------------------------------------
		public WebElement getStudy() {
			return ReusableMethods.getElement(driver, p1.study);
		}
		
		//-----------------------------------------------------------------
		public WebElement getKidsRoom() {
			return ReusableMethods.getElement(driver, p1.kidsroom);
		}
		
		//-----------------------------------------------------------------
		public WebElement getBulkOder() {
			return ReusableMethods.getElement(driver, p1.bulkorder);
		}
		
		//-----------------------------------------------------------------
		public WebElement getGiftCard() {
			return ReusableMethods.getElement(driver, p1.giftcard);
		}
		
		
		//-----------------------------------------------------------------
		
		
		
		public WebElement loginstep1() {
			return ReusableMethods.getElement(driver, p1.loginb1);

		}public WebElement signin() {
			return ReusableMethods.getElement(driver, p1.signupoption);

		}public WebElement login() {
			return ReusableMethods.getElement(driver, p1.loginoption);

		}public WebElement entermail() {
			return ReusableMethods.getElement(driver, p1.entermail);

		}public WebElement enterpassword() {
			return ReusableMethods.getElement(driver, p1.enterpassword);

		}public WebElement  loginbutton() {
			return ReusableMethods.getElement(driver, p1.loginbutton);

		}
		//-----------------------------------------------------------------
		public WebElement getSearchResult() {
			return ReusableMethods.getElement(driver, p1.searchresult);
		}
		
		//-----------------------------------------------------------------
//		public WebElement getSale() {
//			return ReusableMethods.getElement(driver, p1.sale1);
//		}

}
