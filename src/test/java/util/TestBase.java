package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
	public WebDriver driver;
	final String URL = "https://ancient-taiga-22967.herokuapp.com/";
	String chromeDriverProp = "webdriver.chrome.driver";
	String driverPath = "/Users/apple/Downloads/chromedriver";
	
	@BeforeClass
	public void setup() {
		System.setProperty(chromeDriverProp , driverPath );
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}