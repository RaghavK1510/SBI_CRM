package com.OtherPSeg.pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

    public void writeExcel(String sheetName, String cellvalue, int row, int col) throws Exception
    {
        String excelPath= System.getProperty("user.dir") + "/src/test/java/com/OtherPSeg/testData/OtherPSeg.xlsx";

        File file = new File(excelPath);

        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(fis);


        XSSFSheet sheet = wb.getSheet(sheetName);

        sheet.getRow(row).createCell(col).setCellValue(cellvalue);

        FileOutputStream fos = new FileOutputStream(new File(excelPath));

        wb.write(fos);

        wb.close();

        fos.close();
        }
}