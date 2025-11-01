package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=common/home");
		List<WebElement> list= driver.findElements(By.className("list-inline"));
		System.out.println(list.size());
		
		List<WebElement> avlLinks= driver.findElements(By.tagName("a"));
		System.out.println("Available Links:"+avlLinks.size());
		
		List<WebElement> img= driver.findElements(By.tagName("img"));
		System.out.println("Available Links:"+img.size());
		
		driver.quit();


	}

}
