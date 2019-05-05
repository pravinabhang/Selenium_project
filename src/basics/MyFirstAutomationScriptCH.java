package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstAutomationScriptCH {
	
	@Test
	public void myTestMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org");
		
		driver.findElement(By.xpath("//ul//li[@id='menu_projects']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Selenium");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		String msg=" ";
		boolean result=true;
		try{
			driver.findElement(By.xpath("//ul//li[@id='menu_about']"));
		}catch(Exception e){
			msg=msg+" About Tab is missing. ";
			result=false;
		}
		try{
			driver.findElement(By.xpath("//ul//li[@id='menu_support']"));
		}catch(Exception e){
			msg=msg+" Support Tab is missing. ";
			result=false;
		}
		try{
			driver.findElement(By.xpath("//ul//li[@id='menu_documentation']"));
		}catch(Exception e){
			msg=msg+" Documentation Tab is missing. ";
			result=false;
		}
		
		Assert.assertTrue(result, msg);//this static method of assert class decides 
		//			whether the testcase is going to pass or fail using flag values
		//driver.close();
		driver.quit();
	}

}
