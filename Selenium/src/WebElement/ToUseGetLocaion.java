package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetLocaion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		Point Location = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
		System.out.println(Location);
		System.out.println(Location.getX());
		System.out.println(Location.getY());

	}

}
