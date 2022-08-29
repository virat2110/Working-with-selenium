package seleniumTesting;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\svv\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.quit();		
		
		
	}

}
