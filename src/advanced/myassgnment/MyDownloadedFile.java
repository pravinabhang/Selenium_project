package advanced.myassgnment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyDownloadedFile {
	private String s;

	@Test
	public void myDownloadFile() throws InterruptedException, IOException{
				
		WebDriver driver = DownloadFileProfileSetting.chromeProfile(); 
		
		Thread.sleep(7000);
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
        
		driver.findElement(By.xpath("//a[contains(text(),'Download Text File')]")).click();//Download Text File
		Thread.sleep(5000);
		
		boolean result=false;
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader("D:\\TestABC\\Testing Text.txt"));
			//String s1;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
//			s1=s.trim();
			String fileText="http://software-testing-tutorials-automation.blogspot.in/";
			String compareText=s.toString();
			if(compareText.compareTo(fileText)>0){
				result=true;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			br.close();
		}
		Assert.assertEquals(result, true);
			
	}

}
