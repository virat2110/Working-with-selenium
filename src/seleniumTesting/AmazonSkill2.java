package seleniumTesting;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSkill2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\svv\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("nav-search-bar-form")).submit();
        driver.findElement(By.id("a-autoid-0-announce")).click();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("E:/Screen.png"));
        System.out.println("the Screenshot is taken");
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		
		driver.quit();	

	}

}
