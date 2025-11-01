package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Launching Browser
		WebDriver driver = new ChromeDriver();
		//Open URL 
		driver.get("https://testerbud.com");
		//Maximizing window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		System.out.println(driver.getTitle());
		
		String actualTitle=driver.getTitle();
		
		
		if(actualTitle.equals("TesterBudddd - Best Demo Website for Automation Testing | Practice & Learn"))
		{
			System.out.println("Valid Output");
		}
		else
		{
			System.out.println("Invalid Output");
		}
		
		
		//driver.close();
		//driver.quit();
			
	}

}
