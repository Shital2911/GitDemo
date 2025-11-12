package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_multiple 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href=\"/nested_frames\"]")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());
	}
}
