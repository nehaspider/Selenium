package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yamaha {
	
		@Test(priority=-1)
		public void yamaha() {
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.yamaha-motor-india.com/");
			Reporter.log("yamaha got successfully launched",true);     
			driver.quit();
		}

}
