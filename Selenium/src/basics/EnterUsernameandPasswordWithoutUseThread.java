package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUsernameandPasswordWithoutUseThread {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("neha123@");
		driver.findElement(By.name("password")).sendKeys("123456");
		

	}

}
