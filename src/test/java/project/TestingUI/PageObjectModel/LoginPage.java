package project.TestingUI.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	// Constructor
	public  LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

}
	@FindBy(xpath = "(//input[@placeholder='Username'])[1]")
	WebElement username;
	@FindBy(xpath = "(//input[@placeholder='Password'])[1]")
	WebElement password;
	@FindBy(xpath = "//button[@id='loginBtn']")
	WebElement loginbtn;
	@FindBy(xpath = "(//img[@alt='admin@bootstrapmaster.com'])[1]")
	WebElement homeIcon;
	@FindBy(xpath = "(//a[normalize-space()='Logout'])[1]")
	WebElement logoutButton;

//Action methods

	public void setUserName(String uname) {
		//System.out.println("Login page username:  "+ uname);
		username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickSubmit() {
		loginbtn.click();
	}

	public void clicklogout() {
		logoutButton.click();
	}


}
