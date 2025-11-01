package locator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.errorprone.annotations.ThreadSafe;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com");
		
		boolean logo = driver.findElement(By.className("navbar-brand")).isDisplayed();
		System.out.println(logo);
		Thread.sleep(2000);
		driver.quit();
		//drive.close();
	}

}
