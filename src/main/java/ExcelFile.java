package main.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is the ExcelFile helper class to get data from Excel.
 *  
 * @author adubey
 */
public class ExcelFile {

    private static Workbook book;
    private static Sheet sheet;
    public static String filePath = System.getProperty("user.dir") + "/src/textdata/webpass.xlsx";

    /**
     * Apache POI code.
     * 
     * @param sheetName Excel sheet
     * @return two dimensional data object
     */
    public static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        DataFormatter formatter = new DataFormatter();
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = formatter.formatCellValue((Cell) sheet.getRow(i + 1).getCell(k));
            }
        }
        return data;
    }
}
