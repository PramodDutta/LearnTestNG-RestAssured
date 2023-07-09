package com.thetestingacademy._practice.july23;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;

public class UtilExcelPro {

    // Read the TestData.xlsx file by using the Apache POI.

    // Workbook, Sheet, row and column, cell

    static Workbook book;
    static Sheet sheet;


    public static String SHEET_NAME_PATH = System.getProperty("user.dir") + "/src/test/java/resource/td/TD1.xlsx";

    // Open the Workbook, Read the Sheet ,
    // Read and ROw NAD COLUMn and
    // put them in getData to return as Object[][]

    public static Object[][] getTestData(String sheetName, String SHEET_NAME_PATH) throws Exception {

        FileInputStream file = new FileInputStream(SHEET_NAME_PATH);
        book = WorkbookFactory.create(file);
        sheet = book.getSheet(sheetName);

        System.out.println("R -> " + sheet.getLastRowNum());
        System.out.println("C-> " + sheet.getRow(0).getLastCellNum());
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
            }
        }
        return data;
    }


    @DataProvider
    public Object[][] getData() throws Exception {
        return getTestData("Sheet1",SHEET_NAME_PATH);
    }


}
