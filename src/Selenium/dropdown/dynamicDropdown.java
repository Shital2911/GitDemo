package Selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown 
{
	public static void main(String[] args) 
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
	
//	driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
	
	driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"BLR\"]")).click();
	
	
	}
}
