package lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public static void main(String[] args) throws IOException {

		String fr= "dataexcel/sample.xlsx";

		FileInputStream fis= new FileInputStream (fr);
	
		Workbook wb= new XSSFWorkbook(fis);
		
		Sheet sh= wb.getSheet("Sheet1");
		
	
		for (Row r: sh) {
			
			for (Cell c: r) {
				
				if(c.getCellType()==Cell.CELL_TYPE_STRING) {
					
					
				String v= c.getStringCellValue();
				System.out.println(v);
				}
			
				else {
				
					if (c.getNumericCellValue()%1==0) {
						
						
						int i= (int) c.getNumericCellValue();
					System.out.println(i);
					}
					
					else {
						double d= c.getNumericCellValue();
						System.out.println(d);
						
					}
				}
			
			
			}
			
			
		}
		wb.close();
		fis.close();
	}

}
