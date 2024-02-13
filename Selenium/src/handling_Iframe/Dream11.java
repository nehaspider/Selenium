package handling_Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.get("https://www.dream11.com/");
		    
		    //To switch by using int index
		   // driver.switchTo().frame(0);
		    
		    //To switch by using id or name
		   // driver.switchTo().frame("send-sms-iframe");
		    
		    //To switch by using WebElement
		  WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		  driver.switchTo().frame(iframe);
		    driver.findElement(By.id("regEmail")).sendKeys("9811876380"); 
		    //To switch back using parentFrame
		   // driver.switchTo().parentFrame();
		    
		    //To switch back using defaultContent
		    driver.switchTo().defaultContent();
		    driver.findElement(By.linkText("About Us")).click();


	}

}
