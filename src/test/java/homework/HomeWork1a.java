package homework;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1a {
	@Test
	public void testMercurysiteOpnes() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {System.out.println("Test Passed");}
		
		else {System.out.println("Test Failed");}
				
	driver.close();
	driver.quit();
		
		
		
		
	}













}
