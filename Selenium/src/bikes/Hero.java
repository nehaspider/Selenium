package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hero {

	

	@Test(priority=1)
	public void hero() {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.heromotocorp.com/");
		Reporter.log("Hero got successfully launched",true);     
		driver.quit();
	}
}
