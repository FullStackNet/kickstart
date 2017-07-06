package application.account.reader.tally;

import java.util.ArrayList;
import java.util.Map;

import platform.db.DBFReader;
import platform.util.Util;
import application.account.resource.account;

public class ReadDbfAccountMaster {
    public static ArrayList<account> readAccount(String community_id, String fin_year, String filePath) {
    	 ArrayList<account> account_list = new ArrayList<account>();
         ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
         try {
        	 list = DBFReader.readFile(filePath);
         } catch(Exception e) {
        	 e.printStackTrace();
        	 return account_list;
         }
         for (int i = 0; i < list.size(); i++) {
             Map<String, String> map = list.get(i);
             account _account = new account();
             _account.setName(map.get("name"));
             _account.setCode(map.get("code"));
             _account.setImie(map.get("imie"));
             _account.setLicense_no(map.get("reg_no"));
             _account.setFin_year(map.get("fin_year"));
             if (Util.isEmpty(_account.getFin_year())) {
                 _account.setFin_year(fin_year);
             }
             _account.setGroup_name(map.get("group_name"));
             if (Util.isEmpty(_account.getGroup_name())) {
                 _account.setGroup_name(map.get("address"));
             }
             _account.setId(community_id + "^" + _account.getFin_year() + "^" + _account.getCode());
             _account.setCommunity_id(community_id);
             if (!Util.isEmpty(map.get("opening_balance"))) {
                 try {
                     double value = Double.parseDouble(map.get("opening_balance"));
                     _account.setOpening_balance(value);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             } else if (!Util.isEmpty(map.get("op_bal"))) {
                 try {
                     double value = Double.parseDouble(map.get("op_bal"));
                     _account.setOpening_balance(value);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             } else if (!Util.isEmpty(map.get("op_balance"))) {
                 try {
                     double value = Double.parseDouble(map.get("op_balance"));
                     _account.setOpening_balance(value);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             } else if (!Util.isEmpty(map.get("opening_bal"))) {
                 try {
                     double value = Double.parseDouble(map.get("opening_bal"));
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
             } else if (!Util.isEmpty(map.get("cl_bal"))) {
                 try {
                     double value = Double.parseDouble(map.get("cl_bal"));
                     _account.setClosing_balance(value);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             }
             account_list.add(_account);
         }
         return account_list;
    }
}
