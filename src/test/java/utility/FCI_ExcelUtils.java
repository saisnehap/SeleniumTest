package utility;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class FCI_ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;


public static String getCellData(int RowNum, int ColNum) throws Exception{
	try {

String file = "G:/seleniumGit/seleniumTest/src/test/java/datapools/testing.xlsx";

FileInputStream ExcelFile = new FileInputStream(new File(file));
	
	ExcelWBook = new XSSFWorkbook(ExcelFile);

	ExcelWSheet = ExcelWBook.getSheet("Sheet1");

	} catch (Exception e){

		throw (e);

	}
		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

			}catch (Exception e){

			return"";

			}

}





}
