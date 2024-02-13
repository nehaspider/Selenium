package advanceSeleniumTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

//import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;

public class BaseClass {
	public static ChromeDriver driver;
	@BeforeClass
	public void toLaunch() {
	    driver = new ChromeDriver();
		Reporter.log("Browser launched successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser successfully maximised", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
	}

		
		
	

	@BeforeMethod
	public void toLogin() {
		//driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@AfterMethod
	public void ToLogOut() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("succesfully log out", true);
	}
	
	@AfterClass
	public void toCloseBrowser() {
		Reporter.log("Browser got closed successfully", true);
		driver.quit();
	}

}
