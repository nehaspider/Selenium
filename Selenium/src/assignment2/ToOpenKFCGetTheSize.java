package assignment2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenKFCGetTheSize {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://online.kfc.co.in/");
		driver.manage().window().maximize();
		Dimension sizeOfweb = driver.manage().window().getSize();
		System.out.println(sizeOfweb);

	}

}
