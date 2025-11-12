package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class locators 
{
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("inputUsername")).sendKeys("shital");
		driver.findElement(By.name("inputPassword")).sendKeys("password");;
		driver.findElement(By.className("signInBtn")).click();
			
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("Shital");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("shitalmotghare@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
		
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("shitalmotghare29@gmail.com");

		driver.findElement(By.cssSelector("input[placeholder=\"Phone Number\"]")).sendKeys("8756786555");
			
		driver.findElement(By.cssSelector("button[class=\"reset-pwd-btn\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//		driver.close();
		
	}

}
