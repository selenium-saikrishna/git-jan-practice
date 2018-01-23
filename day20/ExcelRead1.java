package day20;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r,r1;
		int rowCount=ws.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			r=ws.getRow(i);
			int colCount=r.getLastCellNum();
			for(int j=0;j<colCount;j++)
			{
				if(r.getCell(j).getStringCellValue().equals("for"))
				{
					for(int k=0;k<colCount;k++)
						System.out.print(r.getCell(k).getStringCellValue()+"   ");
					System.out.println();
					for(int l=0;l<=rowCount;l++)
					{
						r1=ws.getRow(l);
						System.out.print(r1.getCell(j).getStringCellValue()+"   ");
					}
						
				}
			}
			System.out.println("aaaaaaaaaaaa");
		}

	}

}
