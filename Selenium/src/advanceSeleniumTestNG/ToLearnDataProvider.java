package advanceSeleniumTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@DataProvider(name="cred")
	public String[][] toSendData(){
		String[][] sarr= {
				{"neha@123@gmail.com","neha123@"},
				{"rasmi123@gmail.com","rashmi123@"},
				{"kalai123@gmail.com","kalai123@"}
				
		};
		return sarr;
	}
	
	@Test(dataProvider="cred")
	public void toLogin(String email,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		
				
		
		
		
	}

}
