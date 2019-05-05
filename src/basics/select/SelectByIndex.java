package basics.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectByIndex {

	@Test
	public void myTestMethod()
	{
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//div/input[@ng-model='FirstName']")).sendKeys("Rajesh");
		driver.findElement(By.xpath("//div/input[@ng-model='LastName']")).sendKeys("Ramtere");
		driver.findElement(By.xpath("//div/textarea[@ng-model='Adress']")).sendKeys("Pune");

		driver.findElement(By.xpath("//div/input[@ng-model='EmailAdress']")).sendKeys("rajesh.ramtere@gmail.com");
		driver.findElement(By.xpath("//div/input[@ng-model='Phone']")).sendKeys("9021849391");
		
		driver.findElement(By.xpath("//div/label/input[@value='Male']")).click();
		
		driver.findElement(By.xpath("//div/div/input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//div/div/input[@id='checkbox2']")).click();
		
		
		WebElement webElement = driver.findElement(By.xpath("//div/select[@id='Skills']"));
		
		Select selObj = new Select(webElement);
		selObj.selectByIndex(10);
	}
}
