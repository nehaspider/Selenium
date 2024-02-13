package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KTM {
	
	@Test(priority=3)
	public void ktm() {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ktmindia.com/");
		Reporter.log("KTM got successfully launched",true);     
		driver.quit();
	}

}
