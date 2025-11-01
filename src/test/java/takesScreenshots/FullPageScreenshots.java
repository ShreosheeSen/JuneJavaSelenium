package takesScreenshots;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.utility.RandomString;

//the below code did not work

public class FullPageScreenshots {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		driver.get("https://www.ixigo.com/");
		
		String test = "Ixigo";
		
		FullPageScreenshots.TakeScreenshot(test);
		
	}
		public static void TakeScreenshot(String test)
		{
			String Random = RandomString.make(10);
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File dst = new File(System.getProperty("C:\\Users\\Administrator\\Documents\\Snapshots\\"+ test +"__"+ Random +"jpg"));
			
			src.renameTo(dst);
			
		}
		
		
		
		

	}


