package application.account.reader.tally;

import platform.db.DBFReader;
import platform.resource.mandi_arrival;
import platform.util.Util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class ReadDbfArrivalMaster {
    public static ArrayList<mandi_arrival> readArrival(String community_id, String filePath) {
        ArrayList<mandi_arrival> arrival_list = new ArrayList<mandi_arrival>();
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        try {
            list = DBFReader.readFile(filePath);
        } catch (Exception e) {
            e.printStackTrace();
            return arrival_list;
        }
        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = list.get(i);
            mandi_arrival _arrival = new mandi_arrival();
            _arrival.setType(map.get("type"));
            String date_str = map.get("date");
            _arrival.setCode(map.get("code"));
            _arrival.setCommunity_id(community_id);
            SimpleDateFormat parseFormat =
                    new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
            try {
                Date date = parseFormat.parse(date_str);
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                date_str = format.format(date);
            } catch (Exception e) {

            }
            if (Util.isEmpty(date_str)) {
                System.out.println("No valid Date " + date_str);
                continue;
            }
            date_str = date_str.replace("/", "-");
            date_str = date_str.replace("//", "-");
            _arrival.setArrival_date_str(date_str);
            String[] tokens = _arrival.getArrival_date_str().split("-");
            if (tokens[0].length() == 1) {
                tokens[0] = "0" + tokens[0];
            }
            if (tokens[1].length() == 1) {
                tokens[1] = "0" + tokens[1];
            }
            _arrival.setArrival_date_str(tokens[0] + "-" + tokens[1] + "-" + tokens[2]);
            if (tokens[2].length() == 2) {
                tokens[2] = "20" + tokens[2];
                _arrival.setArrival_date_str(tokens[0] + "-" + tokens[1] + "-" + tokens[2]);
            }
            String fin_year = Util.getFin_year(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
            String id = community_id+"^"+fin_year+"^"+map.get("no");
            _arrival.setId(id);
            _arrival.setFin_year(fin_year);
            _arrival.setCode(map.get("code"));
            _arrival.setCommunity_id(community_id);
            int bags = 0;
            if (!Util.isEmpty(map.get("bags"))) {
                try {
                    bags = Integer.parseInt(map.get("bags"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            int sold = 0;
            if (!Util.isEmpty(map.get("sold"))) {
                try {
                    sold = Integer.parseInt(map.get("sold"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            double freight = 0.0;
            double advance = 0.0;
            double expense = 0.0;

            if (!Util.isEmpty(map.get("freight"))) {
                try {
                    freight = Double.parseDouble(map.get("freight"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (!Util.isEmpty(map.get("advance"))) {
                try {
                    advance = Double.parseDouble(map.get("advance"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            expense = advance + freight;
            _arrival.setBags(bags);
            _arrival.setSold(sold);
            _arrival.setExpense(expense);
            _arrival.setFreight(freight);
            _arrival.setAdvance(advance);
            arrival_list.add(_arrival);
        }
        return arrival_list;
    }
}
