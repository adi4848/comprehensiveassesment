package Reusablemethods;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class RE_Components {
	public static WebDriver driver;
	public Properties prop;
	public static WebDriver initializeDriver() throws IOException {

		String browser = RE_Methods.getBrowser(driver);

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println(driver);

		} else if (browser.equals("edge")) {

			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}
	public static void getScreenshot(String result) throws IOException {
		System.out.println("Screenshot Method");
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

//		FileHandler.copy(source, new File("C:\\test\\"+result+"ss.png"));
		FileHandler.copy(source, new File("C:\\Users\\Aditya\\eclipse-workspace\\Comprehensive_assesment\\Screenshots\\"+result+"ss.png"));
		
	}

	

}
