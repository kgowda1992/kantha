package Data_control;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;

public class DC_Excel 
{
	public  Object[][] customer_DC() throws IOException
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\Kinara\\Desktop\\kantha\\User.XLSX");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet Sh=wb.getSheet("Sheet1");   
		DataFormatter df=new DataFormatter();
		Object[][] obj=new Object[Sh.getLastRowNum()][Sh.getRow(0).getLastCellNum()];
		for(int i=1;i<=obj.length;i++)
		{
			for(int j=0;j<=obj[0].length-1;j++)
			{
				obj[i-1][j]=df.formatCellValue(Sh.getRow(i).getCell(j));
			
			}
		}
		return obj;
	
	
	}

}
