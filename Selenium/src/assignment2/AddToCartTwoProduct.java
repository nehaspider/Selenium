package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartTwoProduct {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginclose1")));
		driver.findElement(By.id("loginclose1")).click();
        driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.linkText("Sofa Sets")).click();
		driver.findElement(By.linkText("Wooden Sofa")).click();
		driver.findElement(By.linkText("Winster 3 Seater Printed Fabric Wooden Sofa (Honey Cream Checkered)")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
	//	driver.findElement(By.linkText("Quartz 3 Seater Printed Fabric Wooden Sofa (Walnut Cream Stripe) ")).click();
	//	driver.findElement(By.id("button-cart-buy-now")).click();

	}

}
