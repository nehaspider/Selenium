package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UseActionMethodInWoodenStreet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		//To use action class to perform mouse over
		Actions action=new Actions(driver);
		WebElement profileicon = driver.findElement(By.linkText("Profile"));
		action.moveToElement(profileicon).perform();
		WebElement myprofile = driver.findElement(By.linkText("My Profile"));
		action.click(myprofile).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login_submit_btn")));
		WebElement signup = driver.findElement(By.id("login_submit_btn"));
		action.click(signup).perform();
		WebElement errormsg = driver.findElement(By.xpath("//p[@class='error-block small']"));
		System.out.println(errormsg.getText());
		System.out.println(errormsg.getCssValue("color"));
		
	

	}

}
