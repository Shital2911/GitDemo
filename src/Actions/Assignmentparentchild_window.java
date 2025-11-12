package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentparentchild_window {
	public static void main(String[] args) {

// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();

		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String parentWindow = it.next();
		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//div//h3")).getText());
		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.cssSelector("div[class=\"example\"] h3")).getText());
	}
	
	
	
	
	
	
	
}
