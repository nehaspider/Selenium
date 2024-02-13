package TakesScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureEntireWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		TakesScreenshot ts= (TakesScreenshot) driver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 File src = new File("./ErrorShots/youtube.jpeg");
		 FileHandler.copy(temp, src);
		 

	}

}
