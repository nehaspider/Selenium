package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toOpenDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("Neha");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("Singh");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("nehaasingh60@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("neha@123");
		Thread.sleep(3000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("neha@123");
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();
	    Thread.sleep(3000);
	   driver.close();
		
		


	}

}
