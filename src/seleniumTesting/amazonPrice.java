package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonPrice  {

	public static void main(String[] args)  throws Exception{
	
	        System.setProperty("webdriver.chrome.driver", "E:\\\\Downloads\\\\svv\\\\chromedriver_win32 (1)\\\\chromedriver.exe"); 
	        WebDriver driver= new ChromeDriver(); 
	        driver.get("https://www.amazon.com/"); 
	        
	        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("yellow puma shoe"); 
	        driver.findElement(By.xpath("//input[@value='Go']")).click(); 
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[4]/ul/li[3]/span/a/span")).click();
	        Thread.sleep(10000);
	        driver.close();
	        
	 

	}

}
