package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Launching Browser");
		WebDriver driver = new ChromeDriver();
		System.out.println("Navigate to website");
		
		driver.get("https://www.redbus.in");
		
		System.out.println("===========================================================");

		System.out.println("Getting Title of application");
		System.out.println(driver.getTitle());
		
		System.out.println("===========================================================");

		String expt_URL = "https://www.redbus.in/";
		
		String act_URL = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println("===========================================================");
		System.out.println("Expected URL:: "   + expt_URL);
		System.out.println("Actual URL::   "   + act_URL);
	
		if (expt_URL.equals(act_URL))
		{
			System.out.println("Test Case1 is Pass");

		}
		else
		{
			System.out.println("Test Case2 is Fail");
		}
		
		System.out.println("Clicking on train button");
		//driver.findElement(By.className("lobName___9c1eb8")).click();// by NAME  not working
		
		//driver.findElement(By.xpath("//span[@class='lobName___9c1eb8'])[2]")).click();// by index not working
		
		driver.findElement(By.xpath("//span[text()='Train tickets']")).click();//xpath by TEXT correct
		
		System.out.println("Navigate Back");
		driver.navigate().back();
		
		System.out.println("validating Heading");

		String expected_heading= "India's No. 1 online bus ticket booking site";
		String actual_heading= driver.findElement(By.xpath("//h1[contains(text(),'booking')]")).getText();
		
		if(expected_heading.equals(actual_heading))
		{
			System.out.println("Test case3 is Pass");
		}
		
		else
		{
			System.out.println("Test case4 is Fail");
		}
		
		String frm ="From";
		String frm1= driver.findElement(By.xpath("//div[contains(text(),'Fr')]")).getText();

		if(frm.equals(frm1))
		{
			System.out.println("Test case5 is Pass");
		}
		
		else
		{
			System.out.println("Test case6 is Fail");
		}
		//System.out.println("Browser Close");
				//driver.close();
		System.out.println("clicking Know More");
		driver.findElement(By.xpath("//div[contains(text(),'Know')]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Help')]")).getText();
		System.out.println("Not now");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[contains(text(),'Not')]")).click();
		
	}

}
