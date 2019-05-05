package basics.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAllSelectedOptions {

	@Test
	public void myTestMethod() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Boolean testResult = true;
		String message = "";
		try
		{
			WebElement webElement = driver.findElement(By.xpath("//div/select[@id='Skills']"));
			
			Select selObj = new Select(webElement);
			selObj.selectByVisibleText("Analytics");
			
			//getAllSelectedOptions()  command is used to retrieve the list of options
			//that are currently selected in the Multi-Selection Box field.
			List<WebElement> selectedItem = selObj.getAllSelectedOptions();
			
		    for (WebElement selectedOption : selectedItem) 
		    {    
		        System.out.println("Selected String in dropdown menu : " +selectedOption.getText());
		    }
		}
		catch(Exception e)
		{
			message = "Item is not selected in dropdown menu !!";
			testResult = false;
		}
		
		Assert.assertTrue(testResult, message);

	}
}