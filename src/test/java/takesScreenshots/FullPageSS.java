package takesScreenshots;

import java.awt.Toolkit;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.utility.RandomString;

public class FullPageSS {
	
	static WebDriver driver;
//below code did not work
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromeDriver().setup();
		
		driver = new ChromeDriver();
		driver.get("www.facebook.com");
		driver.manage().window().maximize();
	}
	
	public static void Screenshot()
	{
		
		String Random = RandomString.make(10);
		
		//Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		//Rectangle 
		
	}
	}


