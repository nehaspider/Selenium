package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterMobileNumberInDream11 {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.get("https://www.dream11.com/");
		    driver.findElement(By.id("regEmail")).sendKeys("9811876380"); 

	}

}
