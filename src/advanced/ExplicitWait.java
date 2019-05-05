package advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	@Test
	public void myExplicitWait(){
	
		System.setProperty("webdriver.gecko.driver","D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	 
		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.name("q")).sendKeys("ABCD");
		
		WebDriverWait obj=new WebDriverWait(driver,40);
		
		WebElement myElement=obj.until(ExpectedConditions
				.presenceOfElementLocated(By.name("qr")));
		myElement.sendKeys("ABCD");
		
		myElement.submit();
				
		System.out.println("Script is Running!");
	}

}
