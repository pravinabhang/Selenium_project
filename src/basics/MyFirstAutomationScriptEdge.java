package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

public class MyFirstAutomationScriptEdge {
	@Test
	public void myTestMethod() throws InterruptedException{
		
		System.setProperty("webdriver.edge.driver","D:\\Radical_Selenium\\MicrosoftWebDriver.exe");	
		WebDriver driver= new EdgeDriver();// to launch the Edge browser
		driver.get("https://www.seleniumhq.org");// to open the website(directs it to the given URL)
		driver.findElement(By.xpath("//ul/li[@id='menu_projects']/a")).click();//click on project
		Thread.sleep(5000);//to hold the screen for defined duration so that you can observe execution
		driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys("Selenium");//entering data in the text field
	}
}
