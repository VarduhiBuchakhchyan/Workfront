package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WelcomePage extends BasePage{
	
	public WelcomePage (WebDriver driver) {
		super(driver);
	}

	public static final String loginButtonXpath = "//a[text() = ' Sign in ']";
	
	@FindBy(xpath = loginButtonXpath)
	WebElement loginClick;
	
	public LoginPage clickLogin () {
		
		loginClick.click();
		
		return new LoginPage(driver);
		
	}
	
}
