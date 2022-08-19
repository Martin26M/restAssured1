package Project1.RestAssured;

import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/**
 * Hello world!
 *
 */
public class App 
{
	
public static 	HashMap<String , String > map = new HashMap<String , String>();
	
public static  HashMap<String, String> check(String sheetname , int rowcount1) {
		
		
		Assert.assertEquals("", "");
		
		XSSFWorkbook workbook = new  	XSSFWorkbook();
		
		
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row1 = sheet.getRow(0);
		XSSFRow row2 = sheet.getRow(1);
		
		int rowcount = sheet.getLastRowNum();
		
		int colcount = row1.getLastCellNum();
	
			
			
			for (int i =1 ; i<colcount ; i++) {
				
				
				map.put(map.get(row1.getCell(i).getStringCellValue()), map.get(row2.getCell(i).getStringCellValue()));
			}
			
			
			return map;
	
	

		
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HashMap<String, String> map1 =  check("sheet", 0);
        
        map1.get("Maritn");
        
    }
}
