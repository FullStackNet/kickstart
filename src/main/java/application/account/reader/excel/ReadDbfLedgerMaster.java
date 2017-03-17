package application.account.reader.excel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import platform.db.DBFReader;
import platform.util.Util;
import application.account.resource.ledger;


public class ReadDbfLedgerMaster {

    public static boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }


    public static ArrayList<ledger> getLedger(String filename, String community_id) throws Exception {
        ArrayList<ledger> ledger_list = new ArrayList<ledger>();
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        list = DBFReader.readFile(filename);
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
            if (!Util.isEmpty(_ledger.getVoucher_no())) {
                _ledger.setVoucher_no(_ledger.getVoucher_no().replaceAll("[.0]+$", ""));
            }
            String date_str = map.get("date");
            SimpleDateFormat parseFormat = 
            	    new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
            Date date = parseFormat.parse(date_str);
        	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        	date_str = format.format(date);
           
            if (Util.isEmpty(date_str)) {
                continue;
            }
            date_str = date_str.replace("/", "-");
            date_str = date_str.replace("//", "-");
            _ledger.setEvent_date_str(date_str);
            _ledger.setCode(map.get("code"));
            if (!Util.isEmpty(_ledger.getCode())) {
                _ledger.setCode(_ledger.getCode().replaceAll("[.0]+$", ""));
            }
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
        return ledger_list;
    }
}
