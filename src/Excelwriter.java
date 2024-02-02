import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//write data to the file
      File file = new File("C:\\Users\\916926\\eclipse-workspace\\TakesScreenshot\\Excel\\newFile.xlsx");
      Workbook b=new XSSFWorkbook();
      Sheet createSheet = b.createSheet("SheetName");
      Row createRow = createSheet.createRow(1);
      Cell createCell = createRow.createCell(1);
      createCell.setCellValue("CellValue");
      
      FileOutputStream FileOS=new FileOutputStream(file);//interacts with file to write contents
      b.write(FileOS);//writes the content
      
	}

}
