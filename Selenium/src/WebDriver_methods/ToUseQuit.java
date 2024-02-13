package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseQuit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Thread.sleep(3000);
		driver.quit();
	}
		


}
