package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYoutubePlayMusic {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("satranga");
		Thread.sleep(3000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("ANIMAL: SATRANGA(Song) Ranbir Kapoor,Rashmika|Sandeep V|Arijit,Shreyas P,Siddharth-Garima |Bhushan K")).click();
		

	}

}
