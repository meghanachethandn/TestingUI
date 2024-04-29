package project.TestingUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	@Test
	public void test001() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.1.1.212/newatc_ui/#/login");
		driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("umesh");
		driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).sendKeys("Admin@123");
		//driver.findElement(By.xpath("(//img[@alt='admin@bootstrapmaster.com'])[1]")).click();
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("advSearchBtn1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ng-select[@name='siteid']//input[@type='text']")).click();
		//driver.findElement(By.xpath("//ng-select[@name='siteid']//input[@type='text']")).sendKeys("600151");
		for(int i=1; i<10;i++) {
		String dropdownElement = driver.findElement(By.xpath("//*[@class=\"scrollable-content\"]/div["+ i +"]")).getText();
		System.out.println("index value is :" + i + dropdownElement);
		}
		//WebElement options = driver.findElement(By.xpath("//*[@id=\"a391af0d9be8\"]"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		//js.executeScript("arguments[0].value=' 600002 | Allstone '", options);

	}
	

}
