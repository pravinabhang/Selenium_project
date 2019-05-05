package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyCheckBox {
	@Test
	public void myTestMethod() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.findElement(By.xpath("//ul//li[@id='menu_projects']")).click();
		Thread.sleep(1000);
		
		boolean userInput=true;
		boolean currentState =driver.findElement(By.xpath("//div/input[@value='Movies']")).isSelected();
		
		if(userInput){
			if(currentState){
				System.out.println("Checkbox Already checked!");
			}
			else{
				driver.findElement(By.xpath("//div/input[@value='Movies']")).click();
			}
		}else{
			if(currentState){
				driver.findElement(By.xpath("//div/input[@value='Movies']")).click();
			}
			else{
				System.out.println("Checkbox Already Unchecked!");
			}
			
		}
	}
}
