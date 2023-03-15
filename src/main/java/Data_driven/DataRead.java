package Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	
	public static void getdata() throws IOException {

		File f = new File("C:\\Users\\Shareeb\\Documents\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("book1");
		
				Row row = sheet.getRow(0);
		
				Cell cell = row.getCell(1);
		
				CellType cellType1 = cell.getCellType();
				
				if(cellType1.equals(cellType1.STRING)){
					
					String stringCellValue = cell.getStringCellValue();
					
					System.out.println(stringCellValue);
				}
					else if (cellType1.equals(cellType1.NUMERIC)) {
						
						double numericCellValue = cell.getNumericCellValue();
					
						   System.out.println(numericCellValue);
					}	
					
					else {
						System.out.println("Invalid Cell Type...!!");
					}
					
				
				}
			public static void main(String[] args) throws IOException {
		
			getdata();
			
			
			
			
			
			}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
	}
	
	

