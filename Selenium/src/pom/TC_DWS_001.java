package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_001 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		welcomePage wp= new welcomePage(driver);
		wp.getLoginLink().click();
		LogInPage lp= new LogInPage(driver);
		lp.getEmailTextField().sendKeys("neha123@gmail.com");
		lp.getPasswordTextField().sendKeys("Neha123@");
		lp.getLogiButton().click();

	}

}
