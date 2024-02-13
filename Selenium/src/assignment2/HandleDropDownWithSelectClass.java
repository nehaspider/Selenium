package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownWithSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/books");
        //dropdown
        WebElement bookDropdown = driver.findElement(By.id("products-orderby"));
        //handling by select class
        Select bookSelect = new Select(bookDropdown);
        //call the select class method
        bookSelect.selectByVisibleText("Name: Z to A");
       
        
	

	}

}
