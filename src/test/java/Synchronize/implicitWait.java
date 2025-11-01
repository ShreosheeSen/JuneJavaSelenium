package Synchronize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//import java.net.MalformedURLException;
//import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//implicit wait = Global wait

public class implicitWait {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		//URL ulr = new URL("https://www.redbus.in/");
		
		//driver.get("https://www.redbus.in");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		
		
	}

}
