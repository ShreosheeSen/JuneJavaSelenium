package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelector {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nocommerce.com/");
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mumbai");//tagname id = value;
		
		//tagname and Class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mumbai");//tagname id = value;
		
		//tag attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Pune");
		
		

	}

}
