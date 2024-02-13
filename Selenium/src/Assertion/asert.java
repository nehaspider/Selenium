package Assertion;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class asert {
	@Test
	public void testCase() {
	String ExpectedResult = "https://demowebshop.tricentis.com";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		String ActualResult = driver.getCurrentUrl();
	   org.testng.Assert.assertEquals(ActualResult, ExpectedResult, "test case failed");
		
		
	}

}
