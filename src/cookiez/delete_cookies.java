package cookiez;


import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class delete_cookies 
{
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("abgf");
		driver.get("www.google.com");
		
	}
}
