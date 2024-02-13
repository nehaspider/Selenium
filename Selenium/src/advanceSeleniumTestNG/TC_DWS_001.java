package advanceSeleniumTestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {
	String expectedData="Books";
	
	@Test
	public void toCheckBookPage() {
		driver.findElement(By.partialLinkText("Books")).click();
		 String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
//		 if(actualData.equals(expectedData)) {
//			 Reporter.log("Navigate to book page succesfully", true);
//		 }
//		 else {
//			 Reporter.log("Failed to navigate to bok page", true);
//		 }
		 Assert.assertEquals(actualData,expectedData , "Failed to navigate to bok page");
		 Reporter.log("TestCase 001 executed successfully", true);
		 
		
	}

}
