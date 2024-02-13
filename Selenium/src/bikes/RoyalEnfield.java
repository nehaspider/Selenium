package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfield {
	@Test(priority=2)
	public void enfield() {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalenfield.com/");
		Reporter.log("Enfield got successfully launched",true);     
		driver.quit();

		
	}

	
	

}
