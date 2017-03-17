package platform.db;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.util.Util;

/**
 * Created by ajay on 11/2/17.
 */
public class DBFReader {
    public static ArrayList<Map<String, String>> readFile(String filename) throws Exception {
        com.linuxense.javadbf.DBFReader reader = null;
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        try {
            reader = new com.linuxense.javadbf.DBFReader(new FileInputStream(filename));
            int numberOfFields = reader.getFieldCount();
            String header[] = new String[numberOfFields];
            for (int i = 0; i < numberOfFields; i++) {
                DBFField field = reader.getField(i);
                header[i] = field.getName().toLowerCase();
            }
            Object[] rowObjects;
            while ((rowObjects = reader.nextRecord()) != null) {
                Map<String, String> map = new HashMap<String, String>();
                for (int i = 0; i < rowObjects.length; i++) {
                	if (rowObjects[i] == null) {
                		continue;
                	}
                    map.put(header[i], rowObjects[i].toString());
                }
                list.add(map);
            }
        } catch (DBFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            DBFUtils.close(reader);
        }
        return list;
    }

    Map<String, String> readReadHeaderFile(String filename) {
        Map<String, String> map = new HashMap<String, String>();
        return map;
    }
}
