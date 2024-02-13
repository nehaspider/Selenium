package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WoodenStreetApp {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		
	
		driver.findElement(By.linkText("Profile")).click();
		
		driver.findElement(By.linkText("My Profile")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login_submit_btn")));
		driver.findElement(By.id("login_submit_btn")).click();
	
		WebElement errormsg = driver.findElement(By.xpath("//p[@class='error-block small']"));
		System.out.println(errormsg.getText());
		System.out.println(errormsg.getCssValue("color"));
		
	

	}

}
