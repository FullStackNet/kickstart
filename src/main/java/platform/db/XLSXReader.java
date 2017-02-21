package platform.db;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import platform.util.Util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ajay on 11/2/17.
 */
public class XLSXReader {

    public static ArrayList<Map<String, String>> readFile(String filename) throws Exception {
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        ArrayList<String> headers = new ArrayList<String>();
        File myFile = new File(filename);
        FileInputStream fis = new FileInputStream(myFile);
        // Finds the workbook instance for XLSX file
        XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
        // Return first sheet from the XLSX workbook
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);
        // Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = mySheet.iterator();
        // Traversing over each row of XLSX file
        int rowIndex = 0;
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // For each row, iterate through each columns
            Map<String, String> map = new HashMap<String, String>();
            Iterator<Cell> cellIterator = row.cellIterator();
            int colIndex = 0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String value = "";
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        value = value + cell.getNumericCellValue();
                        break;
                    case Cell.CELL_TYPE_STRING:
                        value = value + cell.getStringCellValue();
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        break;
                    case Cell.CELL_TYPE_BLANK:
                        break;
                }
                if (rowIndex == 0) {
                    colIndex++;
                    if (Util.isEmpty(value)) {
                        continue;
                    }
                    headers.add(value.toLowerCase());
                } else {
                    String colName = headers.get(colIndex);
                    colIndex++;
                    if (Util.isEmpty(value)) {
                        continue;
                    }
                    if (Util.isEmpty(colName)) {
                        continue;
                    }
                    map.put(colName, value);
                }
            }
            if (rowIndex > 0) {
                list.add(map);
            }
            rowIndex++;
        }
        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = list.get(i);
            for (Map.Entry<String, String> param : map.entrySet()) {
                String value = param.getValue();
                String key = param.getKey();
                System.out.println(key + "->" + value);
            }
        }
        return list;
    }

    Map<String, String> readReadHeaderFile(String filename) {
        Map<String, String> map = new HashMap<String, String>();
        return map;
    }
}
