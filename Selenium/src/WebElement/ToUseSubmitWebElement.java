package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmitWebElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("nehaasingh60@");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("9811876387");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

}
