package keyworddriven;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import datadriven.ReadExcelSheet;

/**
 * Keyword driven framework
 * @author Anil
 *
 */

public class KeywordDrivenScript1 {
	
	String excelPath="C:\\Users\\Pravin\\workspace\\SeleniumProject\\src\\keyworddriven\\loginDemo.xlsx";
	
	@Test
	public void loginFacebook() throws InvalidFormatException, IOException{
		
		System.setProperty("webdriver.gecko.driver","D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		DataProcess proce;
		String[][] data =  getData();
		//int len =data.length;
		for (int i = 0; i < data.length; i++) {
			String key =   data[i][0];
			String locType= data[i][1];
			String locValue = data[i][2];
			String param = data[i][3];
			//proce = new DataProcess(key, locType, locValue, param);
			proce = new DataProcess();
			proce.performAction(driver, key, locType, locValue,param);
		}
	}

	/*
	 * @Akale
	 */
	public String[][] getData() throws InvalidFormatException, IOException{
		
		ReadExcelSheet excelObj = new ReadExcelSheet(excelPath);
		int rowCount = excelObj.getRowCount(0);
		int colCount = excelObj.getCellCount(0);
		String[][] data = new String[rowCount+1][colCount];
		for(int i=0;i<=rowCount;i++ ){
			
			for(int j=0;j<colCount;j++){
				
				data[i][j]=excelObj.getCellData(0,i, j);
				
			}
//			data[i][0]=excelObj.getCellData(0,i, 0);
//			data[i][1]=excelObj.getCellData(0,i, 1);
//			data[i][2]=excelObj.getCellData(0,i, 2);
//			data[i][3]=excelObj.getCellData(0,i, 3);
		}
			
		return data;
		
	}

}
