package Selenium.dropdown;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_practice 
{
	public static void main(String[] args) throws InterruptedException 
	{ 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
	    WebElement checkbox = driver.findElement(By.cssSelector("input[id=\"checkBoxOption1\"]"));
	   if(!checkbox.isSelected())
	    {
	    	checkbox.click();
	    	System.out.println("The checkbox is checked");
	    	
	    }
	    
	    if(checkbox.isSelected())
	    {
	    	checkbox.click();
	    	System.out.println("The checkbox is unchecked");
	    }
	    
	    System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"")).size());
	    
	}
}
