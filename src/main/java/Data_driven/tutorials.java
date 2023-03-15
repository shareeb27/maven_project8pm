package Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class tutorials {

	public static void get_data() throws IOException {
	
		File f = new File("C:\\Users\\Shareeb\\Documents\\names1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);	
		
		Workbook wb = new XSSFWorkbook(fis);
		
	    Sheet sheet = wb.getSheet("names1");	
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		for(int i=0; i <sheet.getPhysicalNumberOfRows();  i++) {
				Row r = sheet.getRow(i);
				
		    for(int j=0; j<r.getPhysicalNumberOfCells() ; j++) {
		    	
		    	Cell c = r.getCell(j);
		    	
		    	CellType cellType = c.getCellType();
		    
		    if(cellType.equals(cellType.STRING)) {
		    	
		    	String stringCellValue = c.getStringCellValue();
		    	System.out.println(stringCellValue);
		    }
		    	
		    else if (cellType.equals(cellType.NUMERIC)) {
		    		
		    	double numericCellValue = c.getNumericCellValue();
		    	System.out.println(numericCellValue);
		    	
		    	
		    	
		    
		    
		    
		    }
		    }
		    	
		    	
		    	
		    	
		    }
		
		
		
		
		}
		
	public static void main(String[] args) throws IOException {
		get_data();
	}
	
		}
		
		
		
		
		
		
		
		
	
	
	
	

