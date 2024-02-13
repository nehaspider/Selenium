package advanceSeleniumTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass{
	@Test(dataProvider="register")
	public void testCase(String gender, String FN,String LN,String email,String pass,String conpass ) {
		
		if(gender.contains("female")) {
			driver.findElement(By.id("gender-female")).click();
			
		}
		else {
			driver.findElement(By.id("gender-male")).click();;
		}
	
		//driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys(FN);
		driver.findElement(By.id("LastName")).sendKeys(LN);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conpass);
		driver.findElement(By.id("register-button")).click();
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@DataProvider(name="register")
	public Object[][] data(){
	 Object[] [] d=new Object[2] [6];
	 d[0][0]="female";
	 d[0][1]= "neha";
	 d[0][2]="adi";
	 d[0][3]="nehaadi456@gmail.com";
	 d[0][4]="123456";
	 d[0][5]="123456";
	 d[1][0]="male";
	 d[1][1]="aditya";
	 d[1][2]="singh";
	 d[1][3]="aditya121@gmail.com";
	 d[1][4]="111111";
	 d[1][5]="111111";
	 
	return d;
	 
	}
	

}
