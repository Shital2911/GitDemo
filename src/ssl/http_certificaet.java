package ssl;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class http_certificaet 
{
	public static void main(String args[])
	{
		ChromeOptions options = new ChromeOptions();
//		FirefoxOptions options1 = new FirefoxOptions();
//		EdgeOptions option3 = new EdgeOptions();
		
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
