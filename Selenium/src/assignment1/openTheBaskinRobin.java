package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class openTheBaskinRobin{

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		String titleofweb = driver.getTitle();
		System.out.println(titleofweb);

	}

}
