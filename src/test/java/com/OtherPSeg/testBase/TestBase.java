package com.OtherPSeg.testBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import com.OtherPSeg.utilities.ReadConfig;

public class TestBase {

	// Create object
	// readconfig.get is used to fetch the data from config file.
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getusername();
	public String password = readconfig.getpassword();
	public static WebDriver driver;

	public String firstname = readconfig.getfirstname();
	public String lastname = readconfig.getlastname();
	public String Mobile = readconfig.getMobile();

	public static Properties OR = new Properties();

	// public static Logger log = Logger.getLogger("devpinoyLogger");
	public static Logger logger;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://sbibank.crmnext.com/gold7/app/login/login");
		//driver.get("https://sbibank.crmnext.com/sngold5new/app/login/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		logger = Logger.getLogger("OtherPSegment");
		PropertyConfigurator.configure("Log4j.properties");
	}

	//@AfterClass
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	// highlight the element
    public  static JavascriptExecutor js;
        public static  void highlightelement(WebElement element) {
            js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='5px dashed orange'", element);
        }

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}

}
