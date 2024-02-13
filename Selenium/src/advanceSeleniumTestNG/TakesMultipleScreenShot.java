package advanceSeleniumTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesMultipleScreenShot {
	static WebDriver driver;

	 public static void main(String[]args) {
		 
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		takescreenshot();
		takescreenshot("Welcome");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		takescreenshot();
		takescreenshot("Registration");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		takescreenshot();
		takescreenshot("log in");
		
	 }
	 
	 public static void takescreenshot() {
		 LocalDateTime l= LocalDateTime.now();
		 String date=l.toString().replaceAll(":","-");
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 System.out.println(date);
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File("ErrorShots//"+date+"shot.png");
		 try {
			FileHandler.copy(source, destination);
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		 
	 }
    
	 public static void takescreenshot(String s) {
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File("ErrorShots//"+s+"shot.png");
		 try {
			FileHandler.copy(source, destination);
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		 
		 
	 }
	 
	
	 
	 
	 
		

	

}
