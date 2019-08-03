package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homeworktwo {
	@Test
	public void transfermoney() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://techfios.com/test/billing/?ng=login/");
	
	//WebDriverWait wait = new WebDriverWait(driver,20);
	
	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(img[alt='Logo']));
	
	
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
	driver.findElement(By.id("password")).sendKeys("abc123");
		
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.xpath("//span[text()='Transactions']")).click();
	
	Thread.sleep(500);
	driver.findElement(By.linkText("Transfer")).click();
	
	driver.findElement(By.id("select2-faccount-container"));
	
	driver.findElement(By.xpath("//select[@name='faccount']/option[@value='Gulam']")).click();
	driver.findElement(By.xpath("//select[@name='taccount']/option[@value='Syed']")).click();
	
	
	//Thread.sleep(5000);
		
		
	driver.findElement(By.id("description")).sendKeys("Casino Fund");
	
    driver.findElement(By.id("amount")).sendKeys("777");
		
    driver.findElement(By.id("submit")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("View Transactions")).click();
		
		
		
		
	}
	







}
