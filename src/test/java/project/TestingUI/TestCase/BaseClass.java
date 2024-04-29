package project.TestingUI.TestCase;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import project.TestingUI.utils.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	String baseURL = readconfig.getApplicationurl();
	String username = readconfig.getUsername();
	String password = readconfig.getPassword();
	//String firefox = readconfig.getfirefoxpath();
	public static WebDriver driver;
	public static Logger logger;
	//LoginPage lp = new LoginPage(driver);
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//drivers//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "//drivers//geckodriver.exe");
		//FirefoxOptions options = new FirefoxOptions();
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		logger = Logger.getLogger("Project");
		PropertyConfigurator.configure("log4j.properties");
		//logger.info("Browser is setting up");
		driver.manage().window().maximize();
		logger.info("Browser is maximize ");
		//driver.get(baseURL);
		//logger.info("URL is opended");
		//lp.setUserName(username);
	//	lp.setPassword(password);
	//	lp.clickSubmit();
	}
	

}
