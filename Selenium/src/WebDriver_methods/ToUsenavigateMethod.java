package WebDriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsenavigateMethod {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		//To String url
		//driver.navigate().to("https://www.flipkart.com/");
		
		//To URL url
		//driver.navigate().to(new URL("https://www.flipkart.com/"));
		
		//To Use back, forward, refresh
		driver.get("https://www.flipkart.com/");
		 Navigation nav = driver.navigate();
		 Thread.sleep(3000);
		 nav.back();
		 Thread.sleep(3000);
		 nav.forward();
		 Thread.sleep(3000);
		 nav.refresh();
		

	}

	
}
