package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMoveByOffSet {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/login/");
		driver.findElement(By.id("password")).sendKeys("1234567");
		Actions action=new Actions(driver);
		action.moveByOffset(1211, 304).clickAndHold().perform();
		

	}

}
