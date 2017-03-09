package platform.db;

import jxl.Sheet;
import jxl.Workbook;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import platform.util.Util;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ajay on 11/2/17.
 */
public class XLSReader {

	public static ArrayList<Map<String, String>> readFile(String filename) throws Exception {
		ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
		ArrayList<String> headers = new ArrayList<String>();
		File myFile = new File(filename);

		try {
			FileInputStream fis = new FileInputStream(myFile);
			// Finds the workbook instance for XLSX file
			HSSFWorkbook myWorkBook = new HSSFWorkbook(fis);
			// Return first sheet from the XLSX workbook
			HSSFSheet mySheet = myWorkBook.getSheetAt(0);
			// Get iterator to all the rows in current sheet
			Iterator<Row> rowIterator = mySheet.iterator();
			// Traversing over each row of XLSX file
			int rowIndex = 0;
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through each columns
				Map<String, String> map = new HashMap<String, String>();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					String value = "";
					switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:

							if (HSSFDateUtil.isCellDateFormatted(cell)) {
								SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
								value = value + sdf.format(cell.getDateCellValue());
							} else {
								value = value + cell.getNumericCellValue();
							}
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
						if (Util.isEmpty(value)) {
							continue;
						}
						headers.add(value.toLowerCase());
					} else {
						String colName = headers.get(cell.getColumnIndex());
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
		} catch (Exception e) {
			Workbook workbook = Workbook.getWorkbook(myFile);
			Sheet sheet = workbook.getSheet(0);
			int ROWS = sheet.getRows();
			jxl.Cell[] headerCells = new jxl.Cell[sheet.getColumns()];
			for (int i = 0; i < headerCells.length; i++) {
				headerCells[i] = sheet.getCell(i, 0);
			}
			list = new ArrayList<Map<String, String>>();
			for (int i = 1; i < ROWS; i++) {
				Map<String, String> map = new HashMap<String, String>();
				for (int j = 0; j < headerCells.length; j++) {
					jxl.Cell cell = sheet.getCell(j, i);
					map.put(headerCells[j].getContents().toLowerCase(), cell.getContents());
					if (cell.getContents() != null) {
						map.put(headerCells[j].getContents().toLowerCase(), cell.getContents().trim());
					}
				}
				list.add(map);
			}
		}
		return list;
	}

	Map<String, String> readReadHeaderFile(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		return map;
	}
}
