package pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//method to read excel data	
		public String readData(String excelPath,String sheetName,int rowcount,int cellCount) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowcount);
			Cell cell=row.getCell(cellCount);
			String data=cell.getStringCellValue();
			return data;
			
		}
		//method to get  rowcount
		public int getrowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			int rc=sh.getLastRowNum();//count no of rows in sheet
			return rc;
		}
		
		//write into excel file
		public void writeExcelData(String excelPath,String sheetName,int rowcount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb=WorkbookFactory.create(fis);//make file ready
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowcount);
			Cell cell=row.createCell(cellCount);//clear the cell(empty)
			cell.setCellValue(data);//setting new value to cell
			
			FileOutputStream fos=new FileOutputStream(excelPath);
			wb.write(fos);//write into output file i.e excel file
			
		}
		//read property file
		public String readPropertyFile(String propPath, String key) throws IOException
		{
			FileInputStream fis=new FileInputStream(propPath);
			Properties prop=new Properties();//create object
			prop.load(fis);//load file
			String value=prop.getProperty(key);//getting value of key
			return value;
		}
		}

	





