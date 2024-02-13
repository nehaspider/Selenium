package assignment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toRegisterThroghDataDrivenProperties {

	public static void main(String[] args) throws IOException {
		// step-1 create object of FileInputStream
				FileInputStream fis = new FileInputStream("./testData/testData.properties");
				//step 2 Create an object of properties file
				Properties prop= new Properties();
				//step 3 call methods
				prop.load(fis);
				String url = prop.getProperty("url2");
				String firstname = prop.getProperty("firstname");
				String lastname = prop.getProperty("lastname");
				String email = prop.getProperty("email");
				String password = prop.getProperty("pass");
				String confirmpassword = prop.getProperty("confirmpass");
				
				//Automation script starts
				WebDriver driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get(url);
				driver.findElement(By.id("gender-female")).click();
				driver.findElement(By.id("FirstName")).sendKeys(firstname);
				driver.findElement(By.id("LastName")).sendKeys(lastname);
				driver.findElement(By.id("Email")).sendKeys(email);
				driver.findElement(By.id("Password")).sendKeys(password);
				driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
				driver.findElement(By.id("register-button")).click();
				

	}

}
