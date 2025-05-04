package Utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Excelreader {

    public static List<Map<String, String>> read(String path, String sheetName) throws IOException {
        List<Map<String, String>> excelData = new ArrayList<>();

        //.xlsx>>XSSF  ,xls>>>>HSFF
        try
                (FileInputStream fileInputStream = new FileInputStream(path);
             XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet1 = excelFile.getSheet(sheetName);
            int noOfRows = sheet1.getPhysicalNumberOfRows();

            Row headerRow = sheet1.getRow(0);
            for (int rowNo = 1; rowNo < noOfRows; rowNo++) {
                Row row = sheet1.getRow(rowNo);
                if (row == null) continue;

                Map<String, String> rowMap = new LinkedHashMap<>();
                int noOfCells = headerRow.getPhysicalNumberOfCells();

                for (int colNo = 0; colNo < noOfCells; colNo++) {
                    String key = headerRow.getCell(colNo).toString();
                    String value = (row.getCell(colNo) != null) ? row.getCell(colNo).toString() : "";
                    rowMap.put(key, value);
                }
                excelData.add(rowMap);
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw e; // rethrowing after logging
        }

        return excelData;
    }

    public static List<Map<String, String>> read() throws IOException {
        return read(Constants.EXCEL_FILE_PATH, "Sheet1");
    }
}
