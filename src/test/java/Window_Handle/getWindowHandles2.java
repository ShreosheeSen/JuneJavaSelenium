package Window_Handle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
	    driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
	    
	    Thread.sleep(9000);
	    
	    String WinID = driver.getWindowHandle();
	    
	    System.out.println(WinID);
	    
	    Set <String> WinIDs = driver.getWindowHandles();
	    
	    //SecondWay
	    
	    List<String> WinList= new ArrayList<String>(WinIDs);
	    
	    String ParentWindow = WinList.get(0);
	    String ChildWindow = WinList.get(1);
	    
	    driver.switchTo().window(ChildWindow);
	    
	    String Title = driver.getTitle();
	    
	    System.out.println(Title);
	    
	    driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("Test@gmail.com");
	    driver.findElement(By.id("Form_submitForm_action_request")).click();

	    driver.switchTo().window(ParentWindow);
	    
	    String Title1 = driver.getTitle();
	    
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
		
		//String ch = driver.getWindowHandle();
		
		//System.out.println(ch);
        //Thread.sleep(10000);

	}

}
