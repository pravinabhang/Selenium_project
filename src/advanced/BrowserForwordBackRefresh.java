package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserForwordBackRefresh {
	
	@Test
	public void myTestMethod() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");
	 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div/ul/li/a[@title='Selenium Projects']"));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div/ul/li/a[@title='Get Selenium']"));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}

}
