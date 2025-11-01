package dragAnddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(options);
		 driver.get("https://www.carwale.com/tata-cars/nexon/");
		 
		 driver.findElement(By.xpath("//button[contains(text(),'EMI calculator')]")).click();
		 
		 Actions action = new Actions(driver);
		

	}

}
