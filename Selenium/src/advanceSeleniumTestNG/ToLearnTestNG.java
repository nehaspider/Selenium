package advanceSeleniumTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {
@Test
public void cricBuzz() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.cricbuzz.com/");
			
	Reporter.log("Cricbuzz got executed successfully",true);
	
}
 @Test
 public void baskinrobin() {
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://baskinrobbinsindia.com/");
	 
	 Reporter.log("Baskinrobin got executed successfully",true);
	 
 }
 @Test
 public void amazon() {
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 Reporter.log("Amazon got executed successfully",true);
 }
 
}
