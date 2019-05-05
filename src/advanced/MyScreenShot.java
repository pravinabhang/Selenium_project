package advanced;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyScreenShot {
	
	@Test
	public void myTestMethod() throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("https:\\google.com");
		
//		File srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile,new File("c:\\testb17\\googlescreenshot.png"));
//		driver.close();
		
		String pageTitle=driver.getTitle();
		String s=this.getClass().getName();
		
		String myTimeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss")
				.format(Calendar.getInstance().getTime());
		
		TakesScreenshot a=(TakesScreenshot)driver;
		File srcFile=a.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("c:\\testb17\\googleerr_"+s+" "+myTimeStamp+"_"+pageTitle+".png"));
				
	}
}
