package advanced.myassgnment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TakeScreenShotElementNotFound {
	
	@Test
	public void takeSreenshot() throws IOException{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("https:\\google.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		boolean res=false;
		
		try{
			driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
			res=true;
		}catch(Exception e){
			TakeScreenShot.capture(driver,this.getClass().getName());
			e.printStackTrace();
		}
		
		Assert.assertEquals(res, true);
	}

}
