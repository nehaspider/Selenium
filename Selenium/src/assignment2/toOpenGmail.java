package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toOpenGmail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("snaarajput@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("9953797376");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		

	}

}
