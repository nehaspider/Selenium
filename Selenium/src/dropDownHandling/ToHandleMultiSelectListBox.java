package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://demoapp.skillrary.com/");
    
    //listbox
    WebElement multiListBox = driver.findElement(By.id("cars"));
    
   //handle it by using select
    Select multiSelect = new Select(multiListBox);
     // call methods
    System.out.println(multiSelect.isMultiple());
    multiSelect.selectByVisibleText("Free ( 90 ) ");
    multiSelect.selectByIndex(1);
    Thread.sleep(3000);
    
    //deselecting
   // multiSelect.deselectByIndex(0);
   // multiSelect.deselectByValue("99");
    multiSelect.deselectAll();
    

	}

}

