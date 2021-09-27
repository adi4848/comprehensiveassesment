package stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableComponents;

public class abstractpagestepDefination extends ReusableComponents{
	protected static WebDriver driver;
	protected WebDriver getDriver() throws IOException {
		if(driver==null) {
			driver = ReusableComponents.initializeDriver();
		}
		return driver;
	}

}
