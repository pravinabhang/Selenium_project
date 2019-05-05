package advanced.myassgnment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	
	public static void capture(WebDriver driver,String s) throws IOException{
		
		String pageTitle=driver.getTitle();
		
		String myTimeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss")
				.format(Calendar.getInstance().getTime());
		
		TakesScreenshot a=(TakesScreenshot)driver;
		File srcFile=a.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("d:\\testb17\\erron"+s+"_"+myTimeStamp+"_"+pageTitle+".png"));
	}

}
