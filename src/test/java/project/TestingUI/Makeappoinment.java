package project.TestingUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makeappoinment {
	
	@Test
	public void appointment() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
		driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();
		driver.findElement(By.xpath("//select[@id='combo_facility']")).click();
		//Facility field:
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='combo_facility']/option"));
		String search = "Seoul CURA Healthcare Center";
		System.out.println(options);
		for(WebElement option : options) {
			String text = option.getText();
			if(text.equals(search)) {
				option.click();
			}
			else {
				System.out.println("Not found");
			}
		}
		// Apply for hospital readmission fiels
		String checkbox = "Apply for hospital readmission";
		String label = driver.findElement(By.xpath("//label[@for='chk_hospotal_readmission']")).getText();
		if(label.equals(checkbox)) {
			driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']")).click();
		}
		else {
			System.out.println("Check box content is not matchoing");
		}
		// Health care program radio button
		String option = "Medicaid";
		List <WebElement> listofRadioButton = driver.findElements(By.xpath("//label[@class='radio-inline']"));
		for (WebElement list : listofRadioButton) {
			if(list.getText().equals(option)) {
				list.click();
			}
			else {
				System.out.println("data Not found");
			}
			}
		// Handaling Calender 
		// I need date of 25 April 2025 to click
		String fdate = "25";
		driver.findElement(By.id("txt_visit_date")).click();
		String currentMonthYear = driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();
		while(!(currentMonthYear.equals("April 2025"))) {
			driver.findElement(By.xpath("//th[@class='next']")).click();
			currentMonthYear = driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();
		}
		List<WebElement> dates = driver.findElements(By.xpath("//td[@class='day']"));
		for(WebElement date : dates) {
			if(date.getText().equals(fdate)) {
				date.click();
			};
		}
		Thread.sleep(5);
		for(int retry =0 ; retry < 5;retry++) {
			try {
				driver.findElement(By.xpath("//textarea[@placeholder='Comment']")).click();
			}
			catch(StaleElementReferenceException ex){
				System.out.println(ex.toString());
			}
			
		}
		// Comment field
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt_comment")));
		
		//driver.findElement(By.xpath("//textarea[@placeholder='Comment']")).click();
		//driver.findElement(By.xpath("//textarea[@id=\"txt_comment\"]")).sendKeys("Appointment booking");
		// Book Appointment button
		//driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
	}
}


