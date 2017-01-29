package application.account.reader.excel;

import application.account.resource.account;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import platform.util.Util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ReadAccountMaster {
    private static String[] validColumns = new String[]{
            "fin_year",
            "name",
            "code",
            "group_name",
            "opening_balance",
            "total_dr",
            "total_cr",
            "closing_balance"
    };

    public static boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }

    public static ArrayList<account> getAccounts(String filename, String community_id, String fin_year) throws Exception {
        ArrayList<account> account_list = new ArrayList<account>();
        HashMap<String, Boolean> requiredField = new HashMap<String, Boolean>();
        requiredField.put("name", false);
        int add_count = 0;
        int already_exist_count = 0;
        int error_count = 0;
        int deleted_count = 0;
        Workbook workbook = Workbook.getWorkbook(new File(filename));
        Sheet sheet = workbook.getSheet(0);
        int ROWS = sheet.getRows();
        System.out.println("Number of Rows -  " + ROWS + ", Columns : " + sheet.getColumns());
        Cell[] headerCells = new Cell[sheet.getColumns()];
        for (int i = 0; i < headerCells.length; i++) {
            headerCells[i] = sheet.getCell(i, 0);

            if (headerCells[i] == null) {
                continue;
            }
            if (isEmpty(headerCells[i].getContents()))
                continue;

            String content = headerCells[i].getContents();
            content = content.trim();
            requiredField.put(content, true);
        }
        for (int i = 0; i < headerCells.length; i++) {
            if (headerCells[i] == null) {
                continue;
            }
            System.out.println((i + 1) + "->" + headerCells[i].getContents());
        }
        for (Map.Entry<String, Boolean> entry : requiredField.entrySet()) {
            if (!entry.getValue()) {
                System.out.println("Required Field missing " + entry.getKey());
                System.exit(-1);
            }
        }
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (int i = 1; i < ROWS; i++) {
            Map<String, String> map = new HashMap<String, String>();
            for (int j = 0; j < headerCells.length; j++) {
                if (headerCells[j] == null) {
                    continue;
                }
                if (isEmpty(headerCells[j].getContents()))
                    continue;
                String content = headerCells[j].getContents();
                content = content.trim();

                Cell cell = sheet.getCell(j, i);
                System.out.println(content + "->" + cell.getContents());
                map.put(content.toLowerCase(), cell.getContents());
                if (cell.getContents() != null) {
                    map.put(content.toLowerCase(), cell.getContents().trim());
                }
            }
            list.add(map);
        }
        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = list.get(i);
            account _account = new account();
            _account.setName(map.get("name"));
            _account.setCode(map.get("code"));
            _account.setFin_year(map.get("fin_year"));
            if (Util.isEmpty(_account.getFin_year())) {
                _account.setFin_year(fin_year);
            }
            _account.setGroup_name(map.get("group_name"));
            _account.setId(community_id + "^" + map.get("fin_year") + "^" + _account.getCode());
            _account.setCommunity_id(community_id);
            if (!Util.isEmpty(map.get("opening_balance"))) {
                try {
                    double value = Double.parseDouble(map.get("opening_balance"));
                    _account.setOpening_balance(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (!Util.isEmpty(map.get("total_dr"))) {
                try {
                    double value = Double.parseDouble(map.get("total_dr"));
                    _account.setTotal_dr(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!Util.isEmpty(map.get("total_cr"))) {
                try {
                    double value = Double.parseDouble(map.get("total_cr"));
                    _account.setTotal_cr(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!Util.isEmpty(map.get("closing_balance"))) {
                try {
                    double value = Double.parseDouble(map.get("closing_balance"));
                    _account.setClosing_balance(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            account_list.add(_account);
        }
        System.out.println("Total Book read -> " + list.size() + ", Successfully created :" + add_count + ", Error : " + error_count + ", Already exists : " + already_exist_count + ", Deleted : " + deleted_count);
        workbook.close();
        return account_list;
    }
}
