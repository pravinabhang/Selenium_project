package advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	
	@Test
	public void myImplicitWait(){
	
		System.setProperty("webdriver.gecko.driver","D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//put page load before get
		//change value of time out 1 & 10
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 
		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("ABCD");
		
		System.out.println("Script is Running!");
	}

}
