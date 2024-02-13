package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetCurrentURL {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String UrlofWebpage = driver.getCurrentUrl();
		System.out.println(UrlofWebpage);

	}

}
