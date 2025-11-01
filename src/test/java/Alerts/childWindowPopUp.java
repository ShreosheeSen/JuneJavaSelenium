package Alerts;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links");
		driver.manage().window().maximize();
		System.out.println("maximizing browser");
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> Allwindows =driver.getWindowHandles();
		System.out.println("Printing all windows  :"+ Allwindows);
		Iterator<String> it= Allwindows.iterator();
		String mainpage = it.next();
		String Childpage = it.next();
		driver.switchTo().window(Childpage);
		driver.manage().window().maximize();
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(mainpage);
		Thread.sleep(1000);
		//driver.findElement(By.className("home")).click();
				
	}

}
