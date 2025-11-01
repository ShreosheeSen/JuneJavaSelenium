package Synchronize;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class explicitWait {

	public static void main(String[] args) throws InterruptedException {
		//Setting up explicit wait
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		// wait until element is visible
		
		//WebElement button = wait.until(ExpectedCondition.visibleofelementlocated(By.id("sfdsgfg")));
		
		//Operation;
		
		//button.click();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.redbus.in/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement KnowMore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Know')]")));
		
		KnowMore.click();
		
		Thread.sleep(3000);

	}

}
