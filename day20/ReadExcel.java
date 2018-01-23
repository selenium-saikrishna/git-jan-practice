package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		for(int k=1;k<=3;k++)
		{
			System.out.println("This is sheet"+k);
			System.out.println("######################################");
			XSSFSheet ws=wb.getSheet("sheet"+k);
			int rowCount=ws.getLastRowNum();
		
			for(int i=0;i<=rowCount;i++)
			{
				Row r=ws.getRow(i);
				int colCount=r.getLastCellNum();
			
				for(int j=0;j<colCount;j++)
				{
					String str=r.getCell(j).getStringCellValue();
					System.out.print(str+"   ");
				}
				System.out.println();
			}
		}
			
		
	}

}
