package project.TestingUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickongoogledriver {
	
	@Test
	public void googledrive() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/"); //https://katalon-demo-cura.herokuapp.com/#appointment
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		driver.switchTo().frame("app");// by iframe by name 
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='app']"));
		//driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//*[text()='Drive']")).click();
		//Switching back to the main window
		driver.switchTo().defaultContent();
	}

}
