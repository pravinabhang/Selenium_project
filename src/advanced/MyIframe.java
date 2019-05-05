package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyIframe {
	
	@Test(groups="advanced")
	public void myTestMethod() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	 
		driver.get("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(4000);
		
		driver.switchTo().frame("iframe1");//switching to the frame on the page
		
		driver.findElement(By.xpath("//div//input[@name='firstname']")).sendKeys("ABCD");
		
		driver.switchTo().defaultContent();
		
		//driver.quit();
	}

}
