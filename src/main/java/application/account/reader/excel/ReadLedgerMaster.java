package application.account.reader.excel;

import application.account.resource.ledger;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import platform.util.Util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ReadLedgerMaster {
    private static String[] validColumns = new String[]{
            "voucher_no",
            "voucher_type",
            "no",
            "type",
            "date",
            "code",
            "particuler",
            "dr_amount",
            "cr_amount"
    };

    public static boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }


    public static ArrayList<ledger> getLedger(String filename, String community_id) throws Exception {
        ArrayList<ledger> ledger_list = new ArrayList<ledger>();
        HashMap<String, Boolean> requiredField = new HashMap<String, Boolean>();
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
            content = content.trim().toLowerCase();
            requiredField.put(content, true);
        }
        for (int i = 0; i < headerCells.length; i++) {
            if (headerCells[i] == null) {
                continue;
            }
            System.out.println((i + 1) + "->" + headerCells[i].getContents().toLowerCase());
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
                content = content.trim().toLowerCase();

                Cell cell = sheet.getCell(j, i);
                System.out.println(content + "->" + cell.getContents());
                map.put(content.toLowerCase(), cell.getContents());
                if (cell.getContents() != null) {
                    map.put(content, cell.getContents().trim());
                }
            }
            list.add(map);
        }
        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = list.get(i);
            ledger _ledger = new ledger();
            _ledger.setVoucher_type(map.get("voucher_type"));
            if (Util.isEmpty(_ledger.getVoucher_type())) {
                _ledger.setVoucher_type(map.get("type"));
            }
            _ledger.setVoucher_no(map.get("voucher_no"));
            if (Util.isEmpty(_ledger.getVoucher_no())) {
                _ledger.setVoucher_no(map.get("no"));
            }
            if (Util.isEmpty(_ledger.getVoucher_no())) {
                continue;
            }
            String date = map.get("date");
            if (Util.isEmpty(date)) {
                continue;
            }
            date = date.replace("/", "-");
            date = date.replace("//", "-");
            _ledger.setEvent_date_str(date);
            _ledger.setCode(map.get("code"));
            _ledger.setCommunity_id(community_id);
            String[] tokens = _ledger.getEvent_date_str().split("-");
            if (tokens[0].length() == 1) {
                tokens[0] = "0" + tokens[0];
            }
            if (tokens[1].length() == 1) {
                tokens[1] = "0" + tokens[1];
            }
            _ledger.setEvent_date_str(tokens[0] + "-" + tokens[1] + "-" + tokens[2]);
            if (tokens[2].length() == 2) {
                tokens[2] = "20" + tokens[2];
                _ledger.setEvent_date_str(tokens[0] + "-" + tokens[1] + "-" + tokens[2]);
            }
            String fin_year = Util.getFin_year(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
            _ledger.setAccount_id(community_id + "^" + fin_year + "^" + _ledger.getCode());
            _ledger.setFin_year(fin_year);
            _ledger.setParticular(map.get("particular"));
            _ledger.setId(community_id + "^" + fin_year + "^" + _ledger.getVoucher_type() + "^" + _ledger.getVoucher_no());
            if (!Util.isEmpty(map.get("debit"))) {
                try {
                    double value = Double.parseDouble(map.get("debit"));
                    _ledger.setDr_amount(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!Util.isEmpty(map.get("credit"))) {
                try {
                    double value = Double.parseDouble(map.get("credit"));
                    _ledger.setCr_amount(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            ledger_list.add(_ledger);
        }
        System.out.println("Total  read -> " + list.size() + ", Successfully created :" + add_count + ", Error : " + error_count + ", Already exists : " + already_exist_count + ", Deleted : " + deleted_count);
        workbook.close();
        return ledger_list;
    }
}
