package day21;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String[] str={"G:\\Book1.xlsx","E:\\Book1.xlsx"};
		for(int i=0;i<str.length;i++)
		{
			System.out.println("#####################");
			System.out.println("This is on Book"+i);
			FileInputStream file=new FileInputStream(str[i]);
			XSSFWorkbook wb=new XSSFWorkbook(file);
			for(int j=1;j<=3;j++)
			{
				System.out.println("This is for sheet"+j);
				XSSFSheet ws=wb.getSheet("sheet"+j);
				int rowCount=ws.getLastRowNum();
				for(int k=0;k<=rowCount;k++)
				{
					Row r=ws.getRow(k);
					int colCount=r.getLastCellNum();
					for(int l=0;l<colCount;l++)
					{
						System.out.print(r.getCell(l).getStringCellValue()+"   ");
					}
					System.out.println();
				}
			}
		}

	}

}
