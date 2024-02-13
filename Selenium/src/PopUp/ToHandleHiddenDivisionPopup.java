package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.get("https://www.makemytrip.com/");
	    driver.switchTo().frame("notification-frame-~10cb447c7");
	    driver.findElement(By.xpath("//a[@class='close']")).click();
	    driver.switchTo().parentFrame();
	    driver.findElement(By.xpath("//label[@for='departure']")).click();
	    for(;;) {
	    	try {
	    		driver.findElement(By.xpath(" //div[text()='June']/../..//p[text()='13']")).click();
	    		break;
	    	}catch(Exception e) {
	    		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	    	}
	    }

	}

}
