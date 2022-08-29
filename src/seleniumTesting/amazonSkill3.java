package seleniumTesting;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonSkill3 {

	public static void main(String[] args)  throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\svv\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		System.out.println("1.Title verification");
        String actual = driver.getTitle();
        String expected= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        if(actual.equals(expected)) {
        	System.out.println("Title verified successfully");
        }
        else {
        	System.out.println("Title mismatch");
        }
        
        	
     		System.out.println("2.Categorize product-samsung charger");
     		System.out.println();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("charger");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[3]/ul/li[5]/span/a/span")).click();
		
		
		System.out.println("3.Product by product id");
		System.out.println();
		String data = driver.findElement(By.cssSelector("div[data-asin='B08VF8V79P']")).getText();
		System.out.println(data);
		System.out.println();
		System.out.println();
		
		
		System.out.println("4.Scrollbar Verification");
    	String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
		JavascriptExecutor scrollBarPresent = (JavascriptExecutor) driver;
		Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
		if (test) {
			System.out.print("Scrollbar is present.");		} 
		else {
			System.out.print("Scrollbar is not present.");
		}
		driver.close();  	

	}

}
