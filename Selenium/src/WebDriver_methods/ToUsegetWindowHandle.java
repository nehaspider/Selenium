package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);//70428A9F6B0140338B2F4AC004416518
		                             //BDD4BE9401AEF62290116A2FE65F1E59

	}

}
