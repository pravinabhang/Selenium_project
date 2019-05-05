package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyFirstAutomationScriptFF {

	@Test
	public void myTestMethod() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		
		driver.findElement(By.xpath("//ul//li[@id='menu_projects']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Selenium ");
		
		Thread.sleep(5000);
		driver.close();
	}
}
