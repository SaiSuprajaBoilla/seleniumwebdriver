package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"testdata\\dataxlxx.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		

		XSSFSheet sheet=sheet.getLastSheet("Sheet1");    //XSSFSheet sheet=worjbook.getSheetAt(0);
		
		int totalRows=Sheet.getLastRowNum();
		
		int totalCells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows:"+ totalRows); //5
		System.out.println("number of cells:"+ totalCells); //4
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++)
			{
				
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
				
		}
		
		workbook.close();
		file.close();
		
		
	}

}
