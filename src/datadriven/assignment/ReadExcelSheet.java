package datadriven.assignment;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	
	public static void main(String arg[]) throws Exception{
		File src=new File("D:/sampleData.xlsx");
		
		FileInputStream file= new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int numRows=sheet.getLastRowNum();
		
		numRows=numRows+1;
		
		int numCols=sheet.getRow(0).getLastCellNum();
				
		System.out.println("Number of rows in the Excelsheet is "+numRows);
		
		System.out.println("Number of Cols in the Excelsheet is "+numCols);
		
		System.out.println("User Name : "+sheet.getRow(0).getCell(0));
		
		System.out.println("Password  : "+sheet.getRow(0).getCell(1));
		
		System.out.println("User name    Password");
		
		for(int i=0;i<numRows;i++){
			
			for(int j=0;j<numCols;j++){
				System.out.print(sheet.getRow(i).getCell(j)+" ");
			}
			System.out.println();
		}
		
		
		
		wb.close();
	}

}
