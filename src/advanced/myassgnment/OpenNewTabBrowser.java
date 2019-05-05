package advanced.myassgnment;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpenNewTabBrowser {
	
	@Test
	public void myTestMethod() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 driver.get("http://google.com");
//		   String windowHandle = driver.getWindowHandle();
		 WebElement element=driver.findElement(By.name("q"));	
//		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		 driver.switchTo().window(tabs.get(0));
//		 driver.get("https://www.seleniumhq.org");
		 
		 Actions action = new Actions(driver);
		 
		 action.moveToElement(element).keyDown(Keys.CONTROL).click().build().perform();  
	}

}
