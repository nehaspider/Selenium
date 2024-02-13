package assignment2;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenOliveGarden {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.olivegarden.com/home");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		driver.manage().window().setPosition(new Point(50,50));

	}

}
