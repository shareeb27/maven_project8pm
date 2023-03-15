package Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class get_All_data {
	
	public static void Alldata() throws IOException {
		
	
		File f = new File("C:\\Users\\Shareeb\\Documents\\names1.xlsx");
	
			FileInputStream fis = new FileInputStream(f);	
	
				Workbook wb = new XSSFWorkbook(fis);
	
				Sheet sheet = wb.getSheet("names1");	
	
						int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	
		for (int i=0; i<physicalNumberOfRows;i++) {
	    
				Row row = sheet.getRow(i);

					System.out.println();
		
						int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		
		
		for(int j= 0; j<physicalNumberOfCells; j++ ) {

				Cell cell = row.getCell(j);
			
					System.out.println();
				
						CellType cellType = cell.getCellType();
				
		if(cellType.equals(cellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			
				System.out.println(stringCellValue);
		}		
				
		else if (cellType.equals(cellType.NUMERIC)){
			
			double numericCellValue = cell.getNumericCellValue();
			
				System.out.println(numericCellValue);
		}		
		
		else {
			
			System.out.println("Invalid cell type...!!");
		}
		
		}
		
		
		
	}
	
  
	}	
	public static void main(String[] args) throws IOException {
			
	Alldata();
		
	}
	

	
	
	
	
	

}
