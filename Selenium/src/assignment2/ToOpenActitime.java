package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenActitime {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("neha");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("singh");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("nehasingh60@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Company")).sendKeys("Q spider");

	}

}
