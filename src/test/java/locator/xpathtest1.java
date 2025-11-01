package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtest1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		
		driver.findElement(By.xpath("//div/button[@name='websubmit']")).click();


	}

}
