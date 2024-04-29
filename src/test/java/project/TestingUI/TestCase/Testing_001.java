package project.TestingUI.TestCase;

import org.testng.annotations.Test;

import project.TestingUI.PageObjectModel.LoginPage;

public class Testing_001 extends BaseClass {
	LoginPage lp = new LoginPage(driver);
	
	@Test
	public void Test_1() throws InterruptedException {
		driver.get(baseURL);
		System.out.println("i am in login page");
		Thread.sleep(5000);
		System.out.println("I am waited 5 seconds");
		lp.setUserName(username);
		System.out.println("Username enterd");
		lp.setPassword(password);
		lp.clickSubmit();
	}
	

}
