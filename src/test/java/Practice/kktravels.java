package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class kktravels {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kktravels.com");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.manage().window().minimize();
		//driver.manage().window().maximize();
		System.out.println("Title of Webpage :" +driver.getTitle());
		String expt_URL = "KK TRAVELS1";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expt_URL))
		{
			System.out.println("Test case1 Pass");
		}
		
		else
		{
			System.out.println("Test case1 Fail");
		}
		
		System.out.println("Clicking on Customer Login Button");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//driver.findElement(By.xpath("//button[text()='LOGIN']")).click();// correct xpath
		    System.out.println("Test case2 Pass");
		    
		    String eurl="https://www.kktravels.com";
		    String aurl=driver.getCurrentUrl();
		    
		    if(eurl.equals(aurl))
			{
				System.out.println("Test case2 Pass");
			}
			
			else
			{
				System.out.println("Test case2 Fail");
			}
			
		    driver.findElement(By.xpath("//button[@id='fever']")).click();
		    System.out.println("Clicked on Registration");
		    
		    driver.findElement(By.xpath("//select[@name='saluation']")).sendKeys("Miss");
		    System.out.println("Clicked on saluation");
		    
		    driver.findElement(By.xpath("//input[@name='CFIRST_NAME']")).sendKeys("Shreya");
		    System.out.println("Clicked on First Name");
		    
		    driver.findElement(By.xpath("//input[@name='CMIDDLE_NAME']")).sendKeys("Dilip");
		    System.out.println("Clicked on Middle Name");
		    
		    driver.findElement(By.xpath("//input[@name='CLAST_NAME']")).sendKeys("Sen");
		    System.out.println("Clicked on Last Name");
		    
		    driver.findElement(By.xpath("//input[@name='CEMAIL']")).sendKeys("Shreya145@abc.com");
		    System.out.println("Clicked on Email");
		    
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shreya123");
		    System.out.println("Clicked on Password");
		    
		    driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Shreya123");
		    System.out.println("Clicked on Confirm Password");
		    
		    driver.findElement(By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 text-center']")).click();
		    System.out.println("Clicked on Submit");
		    
		    //button[contains(text()='submit)]  xpath not working
		    
		  //div[@class='col-lg-12 col-md-12 col-sm-12 text-center']
		}
	

	}


