package Actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_calss 
{
	public static void main (String [] args) throws InterruptedException
	{
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Actions a = new Actions(driver);
	WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	a.moveToElement(move).build().perform();
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
	
	}
	
}