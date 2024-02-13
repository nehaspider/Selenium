package advanceSeleniumTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass {
	@Test(dataProvider="credential")
	public void testCase(String Un, String pass) {
		driver.findElement(By.id("Email")).sendKeys(Un);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@DataProvider(name="credential")
	public Object[][] data(){
	 Object[] [] d=new Object[2] [2];
	 d[0][0]="suriya456@gmail.com";
	 d[0][1]= "123456";
	 d[1][0]="Selenium10to12@gmail.com";
	 d[1][1]="Selenium@123";
	return d;
	 

}
}