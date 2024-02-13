package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromFile {

	public static void main(String[] args) throws IOException {
		// step-1 create object of FileInputStream
		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		//step 2 Create an object of properties file
		Properties prop= new Properties();
		//step 3 call methods
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//Automation script starts
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password); 
		
		

	}

}
