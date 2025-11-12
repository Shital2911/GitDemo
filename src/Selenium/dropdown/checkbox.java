package Selenium.dropdown;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).isSelected());
	Thread.sleep(3000);
	
//	count of the checkbox
	
	System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"")).size());
//	List<WebElement> checkbox = driver.findElements(By.cssSelector("input[type=\"checkbox\""));
//	System.out.println(checkbox.size());
	
	}
	
	
	}
