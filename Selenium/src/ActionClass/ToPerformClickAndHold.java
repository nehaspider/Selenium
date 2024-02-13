package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/login/");
		driver.findElement(By.id("password")).sendKeys("1234567");
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		//to use action class
		Actions action=new Actions(driver);
		//call the method
		action.clickAndHold(eyeIcon).perform();
		Thread.sleep(3000);
		action.release(eyeIcon).perform();
		driver.quit();


	}

}
