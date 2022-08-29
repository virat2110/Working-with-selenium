package seleniumTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonPriceSorting {

 
    public static void main(String[] args) { 
        System.setProperty("webdriver.chrome.driver", "E:\\\\Downloads\\\\svv\\\\chromedriver_win32 (1)\\\\chromedriver.exe"); 
        WebDriver driver= new ChromeDriver(); 
        //WebDriverWait wait = new WebDriverWait(driver,30); 
        driver.get("https://www.amazon.com/"); 
 
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("yellow puma shoe"); 
        driver.findElement(By.xpath("//input[@value='Go']")).click(); 
 
        //Implicit wait till page loads 
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
 
        //Click on result sort option where we will select price low to high 
        Select sortBy=new Select(driver.findElement(By.xpath("//select[@name='s']"))); 
    
        sortBy.selectByValue("price-asc-rank"); 
 
 
        //Scroll down to find pagination 
        JavascriptExecutor jse = (JavascriptExecutor) driver; 
        jse.executeScript("window.scrollBy(0,5000)", ""); 
        //Number of Pages 
        List<WebElement> pagesFound=driver.findElements(By.xpath("//ul[@class='a-pagination']//li//a[contains(@href, '/s?k=yellow+puma+shoes')]")); 
        System.out.println("Pages found " + pagesFound.size()); 
 
        //Will click on Next link until we reach the last page and keep on saving price in list 
        while(pagesFound.size()!=0){ 
            driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click(); 
            List<WebElement> priceAsc=driver.findElements(By.xpath("//span[@class='a-offscreen']")); 
            System.out.println(priceAsc.size()); 
        }
    }
}