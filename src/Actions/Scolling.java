package Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scolling 
{
	public static void main(String[] args) throws InterruptedException 
	{
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(2000);
				
				js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
				
			driver.findElement(By.cssSelector(".totalAmount")).getText();
}

	
	}

