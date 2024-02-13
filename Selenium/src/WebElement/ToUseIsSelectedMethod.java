package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		 WebElement select = driver.findElement(By.xpath("//option[text()='INR 100 - INR 199 ( 16 ) ']"));
		System.out.println("before select");
		System.out.println(select.isSelected());
		select.click();
		System.out.println("after select");
		System.out.println(select.isSelected());
		

	}

}
