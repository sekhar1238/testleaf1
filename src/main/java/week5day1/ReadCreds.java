package week5day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadCreds {
	@Test
public Object[][] readCreds(String fileName) throws IOException{
//go to the excel workbook
	XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
	//go to the sheet
	XSSFSheet wSheet = wBook.getSheetAt(0);
	/*for (int k=0;k<=3;k++)
	{
	XSSFSheet newSheet = wBook.createSheet();
	System.out.println("name of new sheet is "+newSheet.getSheetName());
	}*/
	//find row count of sheet without considering header
	int rowCount = wSheet.getLastRowNum();
	System.out.println("No. of rows are "+rowCount);
	//to get row count including header row
	int rcWithHeader = wSheet.getPhysicalNumberOfRows();
	System.out.println("No. of rows with header are "+rcWithHeader);
	//find the column count
	short colCount = wSheet.getRow(rowCount).getLastCellNum();
	System.out.println("No. of columns are "+colCount);
	//Go to each cell of each row and read the data
	Object[][] credsData= new Object[rowCount][colCount];
	for(int i=1;i<=rowCount;i++)
	{
		//go to the each row
		XSSFRow wRow = wSheet.getRow(i);
		for (int j=0;j<colCount;j++)
		{
			//go to the each cell of each row
			XSSFCell wCell = wRow.getCell(j);
			credsData[i-1][j]= wCell.getStringCellValue();
			//System.out.println("the value of row "+i+" and column "+j+" is "+credsData);
		}
	}
	wBook.close();
	return credsData;
		}
}
