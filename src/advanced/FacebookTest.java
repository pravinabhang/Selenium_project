package advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FacebookTest {
	
	@Test
	public void myTestMethod() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailTextBox=driver.findElement(By.xpath("//input[@id='email']"));
		Actions myActions=new Actions(driver);
		
//		myActions.moveToElement(emailTextBox).click()    another way to do this is below
//			.keyDown(Keys.SHIFT)
//			//.sendKeys("selenium")
//			.keyUp(Keys.SHIFT)//optional
//			.perform();
//			//.build().perform();
		
		Actions obj=myActions.moveToElement(emailTextBox)
				.click()
				.keyDown(Keys.SHIFT)
				.sendKeys("selenium");
				
		obj.build().perform();
		
//		obj.sendKeys("technologies");
//		obj.build().perform();
//		
	}

}
