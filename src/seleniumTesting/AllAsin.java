package seleniumTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAsin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\svv\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> elements =null;
		WebElement element = null;
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("charger");
		element = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		element.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		elements = driver.findElements(By.cssSelector("div[data-index]"));
		List<String> l = new ArrayList<String>();
		for(WebElement e: elements) {
			String d = e.getAttribute("data-asin");
			if(d==null || d.equals("")) {
				
			}
			else {
				l.add(d);
			}
		}
		
		for(String a: l) {
			System.out.println(a);
		}
		
		driver.close();

	}

}
