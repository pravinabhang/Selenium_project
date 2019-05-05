package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	@Test
	public void myTestMethod() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-updated#");
		Thread.sleep(2000);
		String parentWin=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='fbbtnl']")).click();
		Thread.sleep(2000);
		Set<String> allWins=driver.getWindowHandles();
		String childWin=null;
		
		for(String win:allWins){
			if(!win.equals(parentWin)){
				childWin=win;
			}
		}
		
		driver.switchTo().window(childWin);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABCD");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
