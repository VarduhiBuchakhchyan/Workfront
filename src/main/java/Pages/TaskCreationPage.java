package Pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskCreationPage extends BasePage{

	public TaskCreationPage (WebDriver driver) {
		super(driver);	
		
	}
	
	public final String titleFieldXpath = "//input[@id = 'title']";
	public final String dueDateFieldXpath = "//input[@id = 'dueDate']";
	public final String priorityTextXpath = "//label[text() = 'Priority:']";
	public final String selectMediumXpath = "//option[@value = 'MEDIUM']";	
	public final String createButtonxPath = "//button[text() = ' Create']";
	
	@FindBy (xpath = titleFieldXpath)
	WebElement titleField;
	
	@FindBy (xpath = dueDateFieldXpath)
	WebElement dueDateField;
	
	
	@FindBy (xpath = priorityTextXpath)
	WebElement priorityText;
	
	@FindBy (xpath = selectMediumXpath)
	WebElement selectMedium;
	
	@FindBy (xpath = createButtonxPath)
	WebElement createButton;
	
	public HomePage createTask () {
		
		
		titleField.click(); 
		
		titleField.sendKeys("taskName");
		
		//Generate random date
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		Random rand = new Random();
		int  addingDays = rand.nextInt(50) + 1;
		now.add(Calendar.DATE, addingDays);
		String output = dateFormat.format(now.getTime());

		dueDateField.click();
		dueDateField.clear();
		dueDateField.sendKeys(output);
		priorityText.click();
		selectMedium.click();
		createButton.click();
		
			return new HomePage(driver);
	}
	

}
