package WebElement;

import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreBoolean {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Before entering data");
		System.out.println(Loginbutton.isDisplayed());
		System.out.println(Loginbutton.isEnabled());
		System.out.println("=======================================");
		System.out.println("After entering data");
		driver.findElement(By.name("username")).sendKeys("neha123@");
		driver.findElement(By.name("password")).sendKeys("123456");
		System.out.println(Loginbutton.isDisplayed());
		System.out.println(Loginbutton.isEnabled());
		
	

	}

}
