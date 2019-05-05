package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MyFirstAutomationScriptIE {
	
	@Test
	public void myTestMethod() throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "D:\\Radical_Selenium\\IEDriverServer_Win32_3.12.0"
				+ "\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.seleniumhq.org");
		
		driver.findElement(By.xpath("//ul//li[@id='menu_projects']/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Selenium");
		
		Thread.sleep(4000);
		driver.close();
	}

}
