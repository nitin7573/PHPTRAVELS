package test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin01\\Desktop\\programmes\\selenium-java-4.1.4\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.phptravels.net/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
 
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
