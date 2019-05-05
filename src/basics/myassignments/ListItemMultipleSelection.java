package basics.myassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListItemMultipleSelection {
	
	@Test
	public void myTestMethod() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement element=driver.findElement(By.xpath("//select[@name='cars']"));
		Select sel= new Select(element);
		sel.selectByIndex(1);
		sel.selectByIndex(3);
		
		Thread.sleep(3000);
		List<WebElement> opt=sel.getAllSelectedOptions();
		
		for(WebElement wb:opt){
			System.out.println(wb.getText());
		}
		
		driver.switchTo().defaultContent();
		
		//driver.quit();
	}
}
