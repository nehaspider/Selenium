package assignment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toRegisterThroghDataDrivenExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step 1: Create an obj of FIS
				FileInputStream fis= new FileInputStream("./testData/testData2.xlsx");
				
				//step 2: Create obj of workbook
				Workbook wb= WorkbookFactory.create(fis);
				
				//step 3: call methods
				String url = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
			String firstname = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
			String lastname = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();
			String email = wb.getSheet("Sheet1").getRow(3).getCell(0).toString();
			String password = wb.getSheet("Sheet1").getRow(4).getCell(0).toString();
			String confirmpassword = wb.getSheet("Sheet1").getRow(5).getCell(0).toString();
			
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
