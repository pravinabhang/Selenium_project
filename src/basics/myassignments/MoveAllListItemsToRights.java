package basics.myassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveAllListItemsToRights {
	@Test
	public void myTestMethod() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		String country[]={"India","Indonesia","France","England","Germany","Kenya","Mexico","New Zealand","South Africa","USA","Egypt","China","Chile","Canada","Brazil","Australia","Argentina"};
		int flag=1;
		boolean b=false;
		//System.out.println(country.length);
		Thread.sleep(3000);
		try{
			driver.findElement(By.xpath("//button[@title='All to Right']")).click();
			for(int i=0;i<country.length-1;i++){
				String c=driver.findElement(By.xpath("//div/ul[@class='rlbList']/li[contains(text(),'"+country[i]+"')]")).getText();
				if(country[i].equals(c)){
					flag++;
				}
			}
		}catch(Exception e){
			System.out.println("There is Exception "+e.getMessage());
		}
		if(flag==17){
			System.out.println("Passed! ");
			b=true;
		}else{
			System.out.println("Failed!");
			b=false;
		}
		Assert.assertEquals(true, b);
	}
}
