package current_date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_current 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
	Thread.sleep(2000);
	
	
//	driver.findElement(By.xpath("(//div[@class=\"dropdownDiv\"] //a[@value=\"BLR\"])[2]"));
	
	driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"BLR\"]")).click();
	
	driver.findElement(By.xpath("//a[@class=\"ui-state-default ui-state-active\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).click();

	
	}
}
