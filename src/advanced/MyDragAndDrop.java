package advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyDragAndDrop {
	
	@Test
	public void myTestMethod() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	 
		//Thread.sleep(3000);
		
		WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();
		
	}
}
