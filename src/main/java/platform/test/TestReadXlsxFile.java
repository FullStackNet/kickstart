package platform.test;

import platform.db.XLSReader;
import platform.db.XLSXReader;

public class TestReadXlsxFile {
    public static void main(String[] args) throws Exception {
        XLSXReader.readFile("/home/ajay/test_xlsx.xlsx");
        XLSReader.readFile("/home/ajay/test_xlsx.xls");
    }
}	
