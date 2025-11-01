package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class linkText_partiallinkText {

	public static void main(String[] args) throws InterruptedException {
		// Already have account click
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.findElement(By.partialLinkText("Already")).click();
		Thread.sleep(2000);
		
	}

}
