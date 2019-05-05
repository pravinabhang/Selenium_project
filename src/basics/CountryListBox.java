package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountryListBox {
	
	@Test
	public void moveMycountryToRight() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		
		Thread.sleep(4000);
		
	/*	driver.findElement(By.xpath("//div//ul[@class='rlbList']/li[contains(text(),'Brazil')]")).click();	
		driver.findElement(By.xpath("//span[@class='rlbButtonIcon rlbIconTransferRight']")).click();
				
		driver.findElement(By.xpath("//div//ul[@class='rlbList']/li[contains(text(),'Canada')]")).click();
		driver.findElement(By.xpath("//span[@class='rlbButtonIcon rlbIconTransferRight']")).click();
		
		driver.findElement(By.xpath("//div//ul[@class='rlbList']/li[contains(text(),'India')]")).click();
		driver.findElement(By.xpath("//span[@class='rlbButtonIcon rlbIconTransferRight']")).click();
		*/// 4 xpath used here
		
		String myCountry[]={"India","China","USA","South Africa"};
		selectCountry(myCountry,driver);
	}

	private void selectCountry(String[] myCountry, WebDriver driver) throws InterruptedException {
		for(int i=0;i<myCountry.length;i++){
			driver.findElement(By.xpath("//ul[@class='rlbList']/li[contains(text(),'"+myCountry[i]+"')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@title='To Right']/span[1]")).click();
			Thread.sleep(1000);
		}
	}
}
