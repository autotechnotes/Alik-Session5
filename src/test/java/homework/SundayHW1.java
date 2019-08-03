package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SundayHW1 {
	private static final String Password="abc123";
	
	@Test
	public void AddDeposit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver./chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.techfios.com/test/billing/?ng=admin/");

		// cssSelector
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("techfiosdemo@gmail.com");

		// xpath absolute
		driver.findElement(By.xpath("html/body/div/div/div/form/div[2]/input")).sendKeys(Password);

		// Relative Xpath Relative
		driver.findElement(By.xpath("//button[@name='login']")).click();

		// slowing down for page to load

		Thread.sleep(3000);

		// Xpath absolute

		driver.findElement(By.xpath("html/body/section/div/div/div[3]/div/div/div/div/div[2]/a")).click();
		
		//driver.findElement(By.linkText("Add Deposit")).click();
		
		
		
		//driver.findElement(By.id("select2-account-container")).click();
		driver.findElement(By.xpath("//select[@name='account']/option[@value='rezwan']")).click();

		

		driver.findElement(By.id("description")).sendKeys("AliHomeWork");
		driver.findElement(By.id("amount")).sendKeys("777");
		driver.findElement(By.id("submit")).click();

		// driver.close();
		//driver.quit();

	}

}
