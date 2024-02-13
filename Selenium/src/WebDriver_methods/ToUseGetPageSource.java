package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetPageSource {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		 String sourcecode = driver.getPageSource();
		 System.out.println(sourcecode);

	}

}
