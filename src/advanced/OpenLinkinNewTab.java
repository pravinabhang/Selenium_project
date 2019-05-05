package advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpenLinkinNewTab {
	
	@Test(groups="advanced")                                                 
	public void myTestMethod() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 driver.get("https://www.seleniumhq.org/");
		 
		 WebElement element= driver.findElement(By.xpath("//a[@title='Selenium Projects']"));
		 
		 Actions action = new Actions(driver);
		 
		 action.moveToElement(element).keyDown(Keys.CONTROL).click().build().perform();  
	     
	   }

}
