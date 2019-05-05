package datadriven;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class MyDataDrivenScript1 {
	
	WebDriver driver ;
	
	@DataProvider(name="MyDataProvider")
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		data[0][0]= "admin";
		data[0][1]= "pwd";
		data[1][0]= "admin1";
		data[1][1]= "pwd";
		return data;
	}
	
	
	@Test(dataProvider="MyDataProvider")
	public void loginToFacebook(String username, String password){
		
		System.out.println("Name "+username);
		System.out.println("pwd "+password);
		//System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
		
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
//		System.out.println("Name "+username);
//		System.out.println("pwd "+password);
		
//		driver.findElement(By.xpath("")).sendKeys("");
//		driver.findElement(By.xpath("")).sendKeys("");
//		driver.findElement(By.xpath("")).click();

	}
	

}
