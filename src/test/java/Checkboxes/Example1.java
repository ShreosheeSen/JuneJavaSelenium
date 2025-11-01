package Checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationcentral.com/demo/checkboxes.html");
		//Selecting check boxes
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement chkbx = driver.findElement(By.xpath("(//span[contains(text(),'Option 1')])[1]"));
		//chkbx.click();
		//Thread.sleep(1000);
		//chkbx.click();
		//Thread.sleep(1000);
		//driver.close();
		
		//Selecting all checkboxes
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//label[@class='simple-checkbox-container']"));
		
		//for(int i=0;i<checkboxes.size();i++)
		//{
		//	checkboxes.get(i).click();
		//}
		
		//Below is for each loop
		//for (WebElement c:checkboxes)
		//{
		//	c.click();
		//}
		
		
		//Below is click on 2nd and 3rd checkboxes
		
		for(int i=1;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}

        //driver.quit();		
	}
	
}
		
		
	


