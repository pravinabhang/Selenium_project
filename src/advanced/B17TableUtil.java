package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class B17TableUtil {
	
	
	public String getTableCellValue(WebDriver driver, String firstColName, String secColName, String firstColValue){
		
		List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
		int numberOfCols =cols.size();
		
		int firstColLocation = 0;
		
		for(int i=1;i<=numberOfCols;i++ ){
			String colName = driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText();
			if(colName.equals(firstColName)){
				firstColLocation = i;
			}
		}
		
		int secondColLocation =0;
		for(int i=1;i<=numberOfCols;i++ ){
			String colName = driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText();
			if(colName.equals(secColName)){
				secondColLocation = i;
			}
		}
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int numberOfRows =rows.size();
		
		int rowPosition = 0;
		int cnt=0;
		
		for(int i =1; i<=numberOfRows;i++){
			String CompanyValue = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+firstColLocation+"]")).getText();
			if(CompanyValue.equals(firstColValue)){
				rowPosition = i;
				cnt++;
				if(cnt==2)// if there are multiple elements then we wants to access 2nd one
					break;
			}
		}
		String val = driver.findElement(By.xpath("//table/tbody/tr["+rowPosition+"]/td["+secondColLocation+"]")).getText();
		return val;
	}
	public void enterTextInTableCell(){
		
	}

}
