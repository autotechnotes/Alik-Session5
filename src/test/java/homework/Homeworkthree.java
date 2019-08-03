package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homeworkthree {
	@Test
	
	public void AddContact() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	
	
	    //1.Open Browser and go to site http://techfios.com/test/billing/?ng=admin/
		
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		
		
		//2. Enter username: techfiosdemo@gmail.com
		
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		//3. Enter password: abc123
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		
		
		//4. Click login button
		
		
		driver.findElement(By.name("login")).click();
		
		
		//5. Click on CRM in the Side Navigation
		
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//span[text()='CRM']")).click();
		
		
		
		
		  //6. Click on Add Contact Thread.sleep(500);
		  
		  
		  WebDriverWait wait= new WebDriverWait (driver,60);
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated((By.
		  linkText("Add Contact"))));
		  
		  driver.findElement(By.partialLinkText("List Contacts")).click();
		  
		  
		  
		  
		  driver.findElement(By.linkText("Add Contact")).click();
		  
		  
		  
		  //7. Fill in the Add Contact Form,""
		  
		  
		  //Thread.sleep(5000);
		  
		  driver.findElement(By.id("account")).sendKeys("Ali Khan");
		  
		  driver.findElement(By.id("company")).sendKeys("BMW of USA");
		  
		  driver.findElement(By.id("email")).sendKeys("alikhan@ggg.com");
		  
		  driver.findElement(By.id("phone")).sendKeys("777-786-777");
		  
		  
		  
		  //8. Click submit,
		  
		  
		  
		  driver.findElement(By.id("submit")).click();
		  
		  
		  //9. Go to CRM -> List Contact Page
		  Thread.sleep(5000);
		  
		 
		  
		 
		
		
		 
		  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		linkText("List Contacts")));
		  
		  
		  
		  
		 driver.findElement(By.linkText("List Contacts")).click();
		 
		 
		
		
		//10. Search for the new contact in the search field,
		  
		  
		  
		
		
		 
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		  linkText("Ali Khan")));
		  
		  driver.findElement(By.linkText("Ali Khan")).click();
		  
		  
		 
		 
		
		//driver.quit();
		//driver.close();
		
		
		
		
		
		
		//12. Validate contact created.​





	}

	
	
























}
