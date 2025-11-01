package dragAnddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UploadFile {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("--incognito");
		//options.addArguments("--disable-notifications");
		
		 WebDriver driver = new ChromeDriver(options);
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 WebElement min = driver.findElement(By.xpath("span[@tabindex='0']"));//Starting point at x =974
		 
		 System.out.println(min.getLocation());
		 
		 Actions action = new Actions(driver);
		 
		 action.dragAndDropBy(min, -50, 2024).perform();
		 
		 System.out.println(min.getLocation());
		 
	}

}
