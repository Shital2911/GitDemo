package Selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UI_assignment 
{
	public static void main(String[] args) 
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	
	driver.findElement(By.name("name")).sendKeys("Shital");
	driver.findElement(By.name("email")).sendKeys("Shitalm29@gmail.com");
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("Shital@123");
	driver.findElement(By.id("exampleCheck1")).click();
	WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	
//	To select Female option by xpath
//	driver.findElement(By.xpath("//select[@id=\"exampleFormControlSelect1\"] //option[2]")).click();
	
	Select gen = new Select(dropdown);
	gen.selectByVisibleText("Female");
			
	driver.findElement(By.id("inlineRadio1")).click();
	driver.findElement(By.name("bday")).sendKeys("11-02-2000");
	driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText());
		
	}

}
