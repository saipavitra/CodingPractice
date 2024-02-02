import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Excelreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		
		File f=new File("location - of - the -file");
		FileInputStream a=new FileInputStream(f);//read the contents of the file
		Workbook b=new XSSFWorkbook(a);
		Sheet sheet = b.getSheet("SheetName");//provide the sheetName here
		Row row = sheet.getRow(0);//give the rowNumber 
		Cell cell = row.getCell(0);//used to get the cell value 
		
		//update a particular cell
		String stringCellValue = cell.getStringCellValue();
		if(stringCellValue.equals("content in the excel cell"))
		{
			cell.setCellValue("Updated text to the excel cell ");
		}

		cell.toString();
		CellType cellType = cell.getCellType();// types of cells -> type 0 (date and number) and type 1 (String)
		if(cellType.equals(1))
		{
			cell.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(cell))//to check if the cell has date as datatype
		{
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat date=new SimpleDateFormat("DD/MM/YYYY");
			String format = date.format(dateCellValue);//to convert the cell's date value to the format "DD/MM/YYYY"
			
		}
		else
		{
			double numericCellValue = cell.getNumericCellValue();//51.2021 or 1467890
			long convertedcell=(long)numericCellValue;//512021
			String value=String.valueOf(convertedcell);//to convert long to String
			String sringValue=String.valueOf(numericCellValue);//to convert double to String
			
			//Note :sendKeys() accepts only string datatype hence converted the double to string
		
		}
		
		//iterate the cells throughout the excel
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();//provides the number of rows
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();//provides the number of columns for that particular row
		for(int i=0;i<=physicalNumberOfRows;i++)
		{
			Row row2 = sheet.getRow(i);//fetches the each row's number based on the input from for loop
			for(int j=0;j<=physicalNumberOfCells;j++)
			{
				Cell cell2 = row2.getCell(j);//fetches the each cell's value based on the current row
				System.out.println(cell2.toString());//prints the particular cell
				cell.getDateCellValue();	
			}
		}
	}
}
