package Kantha;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AAAAAAA {

	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		File Fi=new File("C:\\Users\\Kinara\\Desktop\\kantha\\user.xlsx");
		Workbook wb=new XSSFWorkbook(Fi);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(1);
		Cell c=rw.getCell(0);
		System.out.println(c.getStringCellValue());
		
	}

}
