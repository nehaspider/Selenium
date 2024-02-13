package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toUseGetcssValueForDemoWebPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement Value = driver.findElement(By.linkText("Register"));
		System.out.println(Value.getCssValue("color"));
		System.out.println(Value.getCssValue("text-decoration"));
		System.out.println(Value.getCssValue("float"));

	}
}

	
