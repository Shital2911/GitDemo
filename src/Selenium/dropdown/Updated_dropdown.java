package Selenium.dropdown;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updated_dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
	driver.findElement(By.id("hrefIncAdt")).click();
	
//for(int i=1; i<5;i++)
//	{
//		driver.findElement(By.id("hrefIncAdt")).click();
//	}
	int i=1;
	while(i<5)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}

	driver.findElement(By.id("btnclosepaxoption")).click();
	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
	
	

}
