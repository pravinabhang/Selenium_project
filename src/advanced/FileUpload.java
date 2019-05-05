package advanced;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload {
	@Test
	public void myFileUpload() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",
				"D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	 
		driver.get("http://www.freefileconvert.com/");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		boolean isuploaded=false;
		
		try{
				//driver.findElement(By.xpath("//input[@id='first_file']")).
				//sendKeys("D:\\Radical_Selenium\\Links_b10.txt");
			
				driver.findElement(By.xpath("//input[@id='first_file']")).click();
				Thread.sleep(3000);
				
				StringSelection ss=new StringSelection("D:\\Radical_Selenium\\Links_b10.txt");
				
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				
				Robot robot=new Robot();
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
								
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
								
				//driver.findElement(By.xpath("//ul/li/a[@href='#file']")).click();
				//driver.switchTo().activeElement().click();
				WebElement ele=driver.findElement(By.xpath("(//div/select[@name='output_format'])[1]"));
				Select sel=new Select(ele);
				sel.selectByVisibleText("docx");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//div/input[@type='submit'])[1]")).click();
				
				isuploaded=true;
				
		}catch(Exception e){
			System.out.println(e);
		}
		
		Assert.assertEquals(isuploaded, true);
		Thread.sleep(3000);
		//driver.quit();
	}
}
