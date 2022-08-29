package seleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\svv\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement element =null;
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("B00HVXS7WC");
		element = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		element.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		String data = driver.findElement(By.cssSelector("div[data-asin='B00HVXS7WC']")).getText();
		System.out.println(data);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
		
		
		

	}

}
