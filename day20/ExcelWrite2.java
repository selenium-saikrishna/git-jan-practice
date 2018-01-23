package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\book4.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws1=wb.getSheet("sheet1");
		XSSFSheet ws2=wb.getSheet("sheet2");
		Row r1,r2;
		int rowCount=ws1.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			r1=ws1.getRow(i);
			r2=ws2.createRow(i);
			int colCount=r1.getLastCellNum();
			for(int j=0;j<colCount;j++)
			{
				r2.createCell(j).setCellValue(r1.getCell(j).getStringCellValue());
			}
		}
		FileOutputStream f=new FileOutputStream("c:\\users\\sai\\desktop\\book4.xlsx");
		wb.write(f);
		
	}

}
