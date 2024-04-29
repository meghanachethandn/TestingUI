package project.TestingUI;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpaths {
	
	@Test
	public void xpathsproject() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		String blogStatusMessage = driver.findElement(By.xpath("//p[text()='This blog is created for ']")).getText();
		System.out.println(blogStatusMessage);
		if(blogStatusMessage.equals("This blog is created for http://www.Selenium143.blogspot.com")) {
			driver.findElement(By.xpath("//a[@id='selenium143']")).click();
			//String gettitle=driver.getTitle();
			if(driver.getTitle().contains("omayo")) {
				String parentWindow = driver.getWindowHandle();
				Set<String> windows = driver.getWindowHandles();
				for(String window :windows ) {
					driver.switchTo().window(window);
					Thread.sleep(3000);
					driver.findElement(By.xpath("//a[contains(@href,'https://t.me/qafoxoriginal')]//img")).click();
				}
				//System.out.println(parentWindow);
			}
			//System.out.println(gettitle);
		}
		else {
			System.out.println("blog Status Link not found");
		}
	}
}
