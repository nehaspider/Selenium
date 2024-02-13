package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseDependentAndIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://shoppersstack.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Levis Mens Regular Fit Tee']/../..//button[text()='add to cart']")).click();
	
	}

}
