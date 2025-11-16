package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String check_text = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(check_text);

		driver.findElement(By.id("name")).sendKeys(check_text);
		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();
		if (text.contains(check_text)) 
		{
			System.out.println("The alert message getting");
			System.out.println("The alert message1 getting");
			System.out.println("The alert message2 getting");
			System.out.println("The alert message3 getting");
		}
		else
		{
			System.out.println("something wrong");
		}
		driver.switchTo().alert().accept();
		
	}

}
