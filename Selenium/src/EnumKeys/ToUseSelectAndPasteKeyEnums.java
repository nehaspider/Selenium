package EnumKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSelectAndPasteKeyEnums {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement Username = driver.findElement(By.name("username"));
		 Username.sendKeys("neha123",Keys.CONTROL+"a");
		Username.sendKeys(Keys.CONTROL+"c");
		 Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys(Keys.CONTROL+"v");
		
	

	}

}
