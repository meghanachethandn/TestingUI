package project.TestingUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class comment {
	
	@Test
	public void commentfield() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
		driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Comment']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Comment']")).sendKeys("HI Hello");
		driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
	}

}
