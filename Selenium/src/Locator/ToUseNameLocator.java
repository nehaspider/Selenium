package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("neha123@");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("12345");

	}

}
