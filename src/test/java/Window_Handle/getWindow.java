package Window_Handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//import java.net.MalformedURLException;
//import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class getWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		String ch = driver.getWindowHandle();
		
		System.out.println(ch);
		
		//driver.close();
		
		//6F57CFA751018A6CB36AF621BC54C920
		
		//C4F8FDAE47428931BE0F3073A9B068C3
		
		

	}

}
