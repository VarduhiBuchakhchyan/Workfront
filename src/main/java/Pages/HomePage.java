package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage (WebDriver driver) { 
	super(driver);
	
	}
	
	public final static String myTodoListTextxPath = "//h1[text()= 'My Todo list']";
	public final static String homeButtonxPath = "//a[text() = ' Home']";
	public final static String myAccountButtonnxPath = "//a[text() = ' My account']";
	public final static String createAToDoButtonxPath = "//a[text() = ' Create a todo']";
	public final static String openDropDownButtonXpath = "//a[text() = ' Hi Varduhi ! ']";
	public final static String signOutButtonxPath = "//a[text() = 'Sign out']";
	
	
	
	@FindBy (xpath = myTodoListTextxPath)
	WebElement myTodoListText;
	
	@FindBy (xpath = homeButtonxPath)
	WebElement homeButton;
	
	@FindBy (xpath = myAccountButtonnxPath)
	WebElement accountButtonn;
	
	@FindBy (xpath = createAToDoButtonxPath)
	WebElement createAToDoButton;
	
	@FindBy (xpath = signOutButtonxPath)
	WebElement signOutButton;
	
	@FindBy (xpath = openDropDownButtonXpath)
	WebElement openDropDownButton;
	
	public TaskCreationPage openNewTodoPage () {
		
		createAToDoButton.click();
		
		return new TaskCreationPage(driver);		
	
	}
	
	public WelcomePage signOut() {
		
		openDropDownButton.click();
		signOutButton.click();
		
		return new WelcomePage(driver);
		
	}

}
