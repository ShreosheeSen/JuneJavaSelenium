package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class simpleDropDown {

	public static void main(String[] args) {
		
		
   WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/r.php");
driver.manage().window().maximize();

WebElement day = driver.findElement(By.id("day"));

Select select = new Select(day);
select.selectByValue("24");

day.isSelected();

WebElement month = driver.findElement(By.id("month"));		
Select select1 = new Select(month);
select1.selectByIndex(2);

WebElement year = driver.findElement(By.id("year"));		
Select select2 = new Select(year);
select2.selectByVisibleText("1997");

//select2.deselectByVisibleText("Year");

	}

}
