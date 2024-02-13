package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;

public class AssertNotEqual {
	@Test
	public void test() {
		String ExpectedResult = "Register";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	     driver.findElement(By.linkText("Register")).click();
	    driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.id("FirstName")).sendKeys("kavya");
		driver.findElement(By.id("LastName")).sendKeys("singh");
		driver.findElement(By.id("Email")).sendKeys("kavyaasingh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("111111");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("111111");
		driver.findElement(By.id("register-button")).click();
		String ActualResult = driver.findElement(By.xpath("//a[@class='account']")).getText();
	org.testng.Assert.assertNotEquals(ExpectedResult, ActualResult, "TestCase");
		
		
		
	}

}
