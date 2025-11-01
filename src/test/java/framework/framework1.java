package framework;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class framework1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("//div[text()='Male']")).click();
		driver.findElement(By.xpath("//div[text()='Wife']")).click();
		//div[text()='Daughter']
		driver.findElement(By.xpath("//div[text()='Daughter']")).click();
		WebElement plusbutton = driver.findElement(By.xpath("//div[contains(text(),'+')]"));
		WebElement countElement = driver.findElement(By.xpath("//div[contains(@class,'ms-count')]"));
		
		int previouscount=Integer.parseInt(countElement.getText());
		for(int i=0;i<3;i++)
		{
			plusbutton.click();
			Thread.sleep(1000);
		}
		
		int currentcount=Integer.parseInt(countElement.getText());
		if(previouscount<currentcount)
		{
			System.out.println("Count Increased to:"+currentcount);
		}
		else
		{
			System.out.println("Count NOT Increased to:"+previouscount);
		}
		
		if(countElement.isDisplayed())
		{
		 System.out.println("Count is Displayed");
		}
		else
		{
			System.out.println("Count is not Displayed");
		}
			
		driver.findElement(By.xpath("//div[normalize-space(text())='Next']")).click();
		
		// Navigate to next page
		WebElement manage= driver.findElement(By.name("You"));
		WebElement wifeage= driver.findElement(By.id("Age-Spouse"));
		WebElement daughter1age= driver.findElement(By.id("Age-Daughter-0"));
		WebElement daughter2age= driver.findElement(By.id("Age-Daughter-1"));
		WebElement daughter3age= driver.findElement(By.id("Age-Daughter-2"));
		WebElement daughter4age= driver.findElement(By.id("Age-Daughter-3"));
		
		Select Selectmanage=new Select(manage);
		Selectmanage.selectByValue("57y");
		
		Select Selectwifeage=new Select(wifeage);
		Selectwifeage.selectByValue("55y");
		
		Select Selectdaughter1age=new Select(daughter1age);
		Selectdaughter1age.selectByValue("25y");
		
		Select Selectdaughter2age=new Select(daughter2age);
		Selectdaughter2age.selectByValue("23y");
		
		Select Selectdaughter3age=new Select(daughter3age);
		Selectdaughter3age.selectByValue("21y");
		
		Select Selectdaughter4age=new Select(daughter4age);
		Selectdaughter4age.selectByValue("19y");
		Thread.sleep(1000);
		
		driver.findElement(By.className("next-btn")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='6 Digit Pincode']")).sendKeys("412207");
		driver.findElement(By.xpath("//input[@placeholder='Your mobile number']")).sendKeys("8800997766");
		Thread.sleep(1000);
		driver.findElement(By.className("next-btn")).click();
		
		
	}

}
