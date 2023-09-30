package resuable;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    public static String getValueFromSheet(String sheetName,int rowIndex, int col) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/datasheet/SampleTestData.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        return sheet.getRow(rowIndex).getCell(col).getStringCellValue();

    }
}
