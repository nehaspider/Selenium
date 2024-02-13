package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toPerformeScrolling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//	driver.get("https:/www.google.co.in/");
	//	driver.findElement(By.name("q")).sendKeys("flowers",Keys.ENTER);
	//	driver.findElement(By.linkText("Images")).click();
	JavascriptExecutor js =(JavascriptExecutor) driver;
		// for(;;) {
		//	 try {
			
		//driver.findElement(By.xpath("//div[text()='Blue Flowers For Your Garden']")).click();
				// break;
		// }
			 
			// catch(Exception e){
			//	 js.executeScript("window.scrollBy(0,500)");
				 
			//}
		// }}
		 driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	WebElement indianFlag = driver.findElement(By.xpath("//td[text()='India']"));
	js.executeScript("arguments[0].scrollIntoView(true)",indianFlag);
		 
	  

	}
}


