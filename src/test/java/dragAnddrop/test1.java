package dragAnddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		
		 WebDriver driver = new ChromeDriver(options);
		 driver.get("https://text-compare.com/");
		 Actions action = new Actions(driver);
		 driver.findElement(By.id("inputText1")).sendKeys("Automation");
		 
		 action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		 
		 action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		 
		 action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 
		 
		 action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		 
		 System.out.println("PASS");

	}

}
