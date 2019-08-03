package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	
	@Test
	public void TestObjectSpySpace() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://objectspy.space/");
		driver.findElement(By.name("firstname")).sendKeys("Ali");
		driver.findElement(By.name("lastname")).sendKeys("khan");
		driver.findElement(By.name("Password")).sendKeys("yessssss");
		driver.findElement(By.id("openwindow")).click();
		
		
		
	}
	


	
	
	
	
	

}
