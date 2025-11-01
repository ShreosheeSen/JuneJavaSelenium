package locator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class idLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver = new ChromeDriver();


		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Shreya@12345");
		Thread.sleep(2000);

		driver.findElement(By.name("websubmit")).click();
		
		//driver.quit();

	}

}
