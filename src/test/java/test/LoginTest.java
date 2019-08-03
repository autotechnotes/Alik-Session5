package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		// Set Chrome as default driver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//Open Chrome Browser
		WebDriver driver =  new ChromeDriver();
		
		
		//Maximize the window
		driver.manage().window().maximize();
		
		// Got to techfios website
		driver.get("http://techfios.com/test/billing/?ng=login/");
		
	
		
		// Type User Name
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		Thread.sleep(1000);
		
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//1000 millisecond is one second
		
		Thread.sleep(1000);
		
		//Click signin
		driver.findElement(By.name("login")).click();
		
		//dashboard page should display
		
	}
}
