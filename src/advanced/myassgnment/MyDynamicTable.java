package advanced.myassgnment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import advanced.B17TableUtil;

public class MyDynamicTable {
	
	@Test(groups="advanced")
	public void dynamicTableTest(){
		System.setProperty("webdriver.gecko.driver","D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://money.rediff.com/mutual-funds/liquid");		
		
		B17TableUtil mytable=new B17TableUtil();
		String planName=mytable.getTableCellValue(driver, 
				"Company", "Plan", "JP Morgan Asset Management India Pvt. Ltd.");
		
		System.out.println(planName);
		Assert.assertEquals(planName, "Dividend-Annual");
	}

}
