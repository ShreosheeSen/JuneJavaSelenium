package ExcelFileReading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class excelfileread {

	public static void main(String[] args) throws IOException {
		//fileinputstream
		
		FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Automation\\Book1.xlsx");
				
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook.getSheet("Sheet1");
				
				int totalRows = sheet.getLastRowNum();
				sheet.getRow(1).getCell(1);
				int totalcells = sheet.getRow(1).getLastCellNum();
				
				System.out.println("total number of rows " +totalRows);
				System.out.println("total number of rows " +totalRows);
				
				//sheet >> row
				//row >> cell
				
				for(int r=0; r<=totalRows;r++)
				{
					XSSFRow currentrow = sheet.getRow(r);
					for(int c=0; c<totalcells;c++)
					{
						XSSFCell cell = currentrow.getCell(c);
						System.out.println(cell.toString());
					}
					System.out.println();
				}
				workbook.close();
				file.close();
		

	}

}
