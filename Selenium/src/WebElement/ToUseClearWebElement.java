package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearWebElement {

	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		Thread.sleep(3000);
        WebElement ref = driver.findElement(By.id("username"));
        ref.clear();
        Thread.sleep(3000);
        ref.sendKeys("neha123@");
        Thread.sleep(3000);
        
	}

}
