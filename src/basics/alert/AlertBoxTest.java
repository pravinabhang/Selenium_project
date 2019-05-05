package basics.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertBoxTest {
	
	@Test
	public void myAlertBoxTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/button[@class='btn btn-danger']")).click();
		Alert myAlert=driver.switchTo().alert();
		String alertText=myAlert.getText();
		
		Assert.assertEquals(alertText, "I am an alert box!");
		Thread.sleep(2000);
		myAlert.accept();
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert myConfirmation=driver.switchTo().alert();
		String ConfirmationText=myConfirmation.getText();
		
		Assert.assertEquals(ConfirmationText, "Press a Button !");
		Thread.sleep(2000);
		myConfirmation.dismiss();
		
		driver.quit();
		
	}

}
