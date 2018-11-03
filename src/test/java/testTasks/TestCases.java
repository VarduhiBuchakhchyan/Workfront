package testTasks;


import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.TaskCreationPage;
import Pages.WelcomePage;
import util.TestBase;



public class TestCases extends TestBase {
	
	String email = "varduhi@live.com";
	String password = "varduhi";
	
	
	/*
	 * test case:
	 * title: Validation of login functionality
	 * Precondition: There is a registered user
	 * step1. open https://ancient-taiga-22967.herokuapp.com/
	 * step2. click on "Sign in"
	 * step3. input valid credentials -> click on "Sign In"
	 * 
	 * result: User's home page opens
	 * 
	 * Verify (Assert.asswerTrue(isElementPresent)
	 * after step4. verify "My To Do List" text, "Home", "My Account" and "Create ToDo" buttons is present
	 * 
	 * Post condition: Sign Out from the system
	 */

	
	@Test
	
	public void validateloginPage() {

		WelcomePage welcomePage = new WelcomePage(driver);
		LoginPage loginPage = welcomePage.clickLogin();
		
		HomePage homePage = loginPage.loginHomePage(email, password);
		
		Assert.assertTrue(homePage.isElementPresent(HomePage.myTodoListTextxPath));
		Assert.assertTrue(homePage.isElementPresent(HomePage.homeButtonxPath));
		Assert.assertTrue(homePage.isElementPresent(HomePage.myAccountButtonnxPath));
		Assert.assertTrue(homePage.isElementPresent(HomePage.createAToDoButtonxPath));	
		
	//	welcomePage = homePage.signOut();
	
		
	}
	
	/*
	 * test case:
	 * title: Validation of login functionality
	 * Precondition: There is a registered user
	 * step1. open https://ancient-taiga-22967.herokuapp.com/
	 * step2. click on "Sign in"
	 * step3. input valid credentials -> click on "Sign In"
	 * step4. click on "Create ToDo" button
	 * step5. input title, select date, select priority
	 * step6. click on Create button 
	 * 
	 * result: New Todo is created
	 *
	 */
	
	@Test   (dependsOnMethods = {"validateloginPage"})
	
	public void createTask() {

//		WelcomePage welcomePage = new WelcomePage(driver);
//		LoginPage loginPage = welcomePage.clickLogin();
//		
//		HomePage homePage = loginPage.loginHomePage(email, password);
		
		HomePage homePage = new HomePage(driver);
		
		TaskCreationPage taskCreationPage = homePage.openNewTodoPage();
		
		homePage = taskCreationPage.createTask();
		
	}
	
	
}
