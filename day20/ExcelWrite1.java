package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\book3.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		r=ws.createRow(0);
		String[] str={"one","two","three","four","five"};
		for(int j=0;j<3;j++)
		{
			r=ws.createRow(j);
			for(int i=0;i<str.length;i++)
			{
				r.createCell(i).setCellValue(str[i]);
			}
		}
		
		FileOutputStream f=new FileOutputStream("c:\\users\\sai\\desktop\\book4.xlsx");
		wb.write(f);

	}

}
