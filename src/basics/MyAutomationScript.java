package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAutomationScript {
	@Test
	public void MyRegistration() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		String msg=" ";
		boolean res=true;
		
		try{
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("ABC");
		}catch(Exception  e){
			msg=msg+" First Name input field is missing.";
			res=false;
		}
		try{
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("XYZ");
		}catch(Exception  e){
			msg=msg+" Last Name input field is missing.";
			res=false;
		}
		try{
			driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Pune");	
		}catch(Exception  e){
			msg=msg+" Address field is missing.";
			res=false;
		}
		
		try{
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc_xyz@yahoo.com");	
		}catch(Exception  e){
			msg=msg+" Email input field is missing.";
			res=false;
		}
		try{
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8888888888");	
		}catch(Exception  e){
			msg=msg+" Mobile number input field is missing.";
			res=false;
		}
		try{
			driver.findElement(By.xpath("//div/label/input[@value='Male']")).click();	
		}catch(Exception  e){
			msg=msg+" gender selector is missing.";
			res=false;
		}
		try{
			driver.findElement(By.xpath("//div/input[@id='checkbox1']")).click();	
		}catch(Exception  e){
			msg=msg+" Hobbies selector is missing.";
			res=false;
		}
		try{
			driver.findElement(By.xpath("//div/select[@ng-model='Skill']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div/select[@ng-model='Skill']/option[@value='Android']")).click();	
			//another way
			//driver.findElement(By.xpath("//div/select[@ng-model='Skill']/option[contains(text(),'Android')]")).click();	
		}catch(Exception  e){
			msg=msg+" Skill Missing";
			res=false;
		}
		//another way to select drop down option from skills combobox
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("//div/select[@ng-model='Skill']"));
		
		Select sel = new Select(ele);
		sel.selectByVisibleText("C++");
		
		sel.getFirstSelectedOption();
		
		/*try{
			driver.findElement(By.xpath("//div/select[@ng-model='country']/option[@value='India']")).click();	
			//driver.findElement(By.xpath("))
		}catch(Exception  e){
			msg=msg+" Country field Missing";
			res=false;
		}*/
		
		Assert.assertTrue(res, msg);
	}

}
