package Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_data {
	
	public static void createdata() throws IOException {

		
		File f = new File("C:\\Users\\Shareeb\\Documents\\shareeb.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("shareebsheet").createRow(1).createCell(1).setCellValue("vijay");
		
		FileOutputStream fos = new FileOutputStream(f);
		  
		  wb.write(fos);
		
		  System.out.println("sheet created...!!");
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		createdata();
		
	}
	

}
