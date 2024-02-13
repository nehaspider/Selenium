package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreWebElementMethods {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("Email")).sendKeys("nehasingh@gmail");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	String textmsg = driver.findElement(By.xpath("//span[contains(text(),'valid ')]")).getText();
	System.out.println(textmsg);

	}

}
