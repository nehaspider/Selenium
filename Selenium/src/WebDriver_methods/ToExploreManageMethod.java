package WebDriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		//To Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//To Minimize
		driver.manage().window().minimize();
		
		//To fullscreen
		driver.manage().window().fullscreen();
		
		//To getsize
		//Dimension sizeofpage = driver.manage().window().getSize();
		//System.out.println(sizeofpage);
		//System.out.println(sizeofpage.getHeight());
		//System.out.println(sizeofpage.getWidth());
		
		//To setSize
		//driver.manage().window().setSize(new Dimension(500, 700));
		
		//To getSize
		//Point pos = driver.manage().window().getPosition();
		//System.out.println(pos);
		//System.out.println(pos.getX());
		//System.out.println(pos.getY());
		
		//To setPosition
		driver.manage().window().setPosition(new Point(500, 400));
		
		

	}

	
}
