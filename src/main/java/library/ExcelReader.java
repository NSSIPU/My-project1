package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	//instance variable:
	String file;
	String sheet;
	Sheet sh;
	
	//Constructor:
	public ExcelReader (String filename, String sheetname) throws IOException {
		file=filename;
		sheet= sheetname;
		FileInputStream fis= new FileInputStream(filename);
		Workbook wb= new XSSFWorkbook(fis);
		sh=wb.getSheet(sheetname);
	}//end constructor
	
	public Object [][] excelToArray(){
		Object [][]table;
		
		//how many row in excel:
		int totalRows=sh.getPhysicalNumberOfRows();
		
		//how many cols in row of excel:
		int totalCols=sh.getRow(0).getPhysicalNumberOfCells();
		
		table= new Object [totalRows-1][totalCols];
		
		//use loop to read excel and store in array again and again:
		for(int r=1;r<totalRows; r=r+1) {
			for(int c=0;c<totalCols; c=c+1) {
				if(sh.getRow(r).getCell(c).getCellType()== CellType.STRING) {
					String strValue=sh.getRow(r).getCell(c).getStringCellValue();
					table[r-1][c]=strValue;
				}//end string
				else {
					int numValue=(int)sh.getRow(r).getCell(c).getNumericCellValue();
				table [r-1][c]=""+numValue;
			}//Numeric part end
			

			}
		}
		return table;
	}

	public String getCellValue(int r, int c) {
		 DataFormatter df= new DataFormatter();
		 String strValue =df.formatCellValue(sh.getRow(r).getCell(c));
		return strValue;
	}
	
	
}
