package dragAnddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class javaScript {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("--incognito");
		//options.addArguments("--disable-notifications");
		
		 WebDriver driver = new ChromeDriver(options);
		 driver.get("https://testautomationpractice.blogspot.com");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,2500)","");
		 
		 System.out.println(js.executeScript("return window.pageYOffset;"));
		 

	}

}
