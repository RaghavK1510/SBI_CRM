package com.OtherPSeg.utilities;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException 
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;		
	}
	
	
	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		//int cellcount=row.getLastCellNum();
		int cellcount=row!=null?row.getLastCellNum():null;
		wb.close();
		fi.close();
		return cellcount;
	}
	
	
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try 
		{
			DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
		}
		catch (Exception e) 
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	/*public static void setCellData(String path, String sheetName,int rownum,int colnum,String data) throws IOException
	//public static void setCellData(String path, String sheetName,int rownum,String data) throws IOException
	{
		fi=new FileInputStream(data);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(sheetName);
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(data);
		wb.write(fo);		
		wb.close();
		fi.close();
		fo.close();
	}*/
	
	public static void setCellData(String xlsheet,int rownum,int colnum,String data)
			  throws IOException {
			  
		String excelPath= System.getProperty("user.dir") + "/src/test/java/com/OtherPSeg/testData/OtherPSeg.xlsx";
			
		      File file = new File(excelPath);
			  FileInputStream fis= new FileInputStream(file);
			  
			  wb=new XSSFWorkbook(fis); 
			  ws=wb.getSheet(xlsheet);
			  row=ws.getRow(rownum);
			  cell=row.createCell(colnum); 
			  cell.setCellValue(data);
			  fo=new FileOutputStream(data);
			  wb.write(fo); 
	}
	
}
