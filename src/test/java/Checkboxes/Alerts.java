package Checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

	public static void main(String[] args) {
	
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationcentral.com/demo/alerts.html");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		//1.Alert Type1
		
		driver.findElement(By.xpath("//button[contains(text(),'Show Alert')]")).click();
		driver.switchTo().alert().accept();
		String alertText= driver.findElement(By.id("alert-message")).getText();
		System.out.println(alertText);
		
		//2.Alert Type2
		
		driver.findElement(By.xpath("(//button[contains(text(),'Prompt')])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Prompt')])[2]")).click();
		Alert myalert = driver.switchTo().alert();
		myalert.sendKeys("Selenium hands on");
		myalert.accept();
		//myalert.dismiss();
		String text = driver.findElement(By.id("prompt-message")).getText();
		System.out.println(text);
			
		//3.Alert Type3
		
		driver.findElement(By.xpath("(//button[contains(text(),'Confirm')])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Show')])[3]")).click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		String text1 = driver.findElement(By.id("confirm-message")).getText();
		System.out.println(text1);
				
	}

}
