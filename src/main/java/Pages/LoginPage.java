package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage (WebDriver driver) {
		super(driver);
	}
	
	public final String emailFieldXpath = "//input[@id = 'email']";
	public final String passwordFieldXpath = "//input[@id = 'password']";
	public final String signinButtonXpath = "//button[@type = 'submit']";
	
	@FindBy (xpath = emailFieldXpath)
	WebElement emailField;
	
	@FindBy (xpath = passwordFieldXpath)
	WebElement passwordField;
	
	@FindBy (xpath = signinButtonXpath)
	WebElement signinButton;
	
	public HomePage loginHomePage (String email, String password) {
			
			emailField.click();
			emailField.sendKeys(email);
			passwordField.click();
			passwordField.sendKeys(password);
			signinButton.click();
			
			return new HomePage(driver);
			
		
	
}
}
