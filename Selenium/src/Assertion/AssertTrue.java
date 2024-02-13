package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
	@Test
	public void test() {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	//Login Link
	boolean B=driver.findElement(By.linkText("Log in")).isEnabled();
	Assert.assertTrue(B);
	driver.findElement(By.linkText("Log in")).click();
    //email
	boolean E = driver.findElement(By.id("Email")).isDisplayed();
	Assert.assertTrue(E);
	driver.findElement(By.id("Email")).sendKeys("neha123@gmail.com");
	//password
	
	boolean P = driver.findElement(By.id("Password")).isDisplayed();
	Assert.assertTrue(P);
	 driver.findElement(By.id("Password")).sendKeys("Neha@123");
	 
	 //Login Button
	 
	boolean L = driver.findElement(By.xpath("//input[@value='Log in']")).isEnabled();
	Assert.assertTrue(L);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
}
	}


