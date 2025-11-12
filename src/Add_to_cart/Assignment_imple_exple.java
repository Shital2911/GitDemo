package Add_to_cart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_imple_exple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[@class=\"customradio\"][2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

//		to select the dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		Select user = new Select(dropdown);
		user.selectByVisibleText("Student");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class=\"col-lg-3\"]")));

		List<WebElement> products = driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]"));

		for (int i = 0; i < products.size(); i++)

		{

			products.get(i).click();

		}
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Checkout")).click();}
	}


