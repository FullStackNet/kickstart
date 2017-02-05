package application.account.reader.tally;

import application.account.resource.ledger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import platform.util.Util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class ReadTallyVoucher {

    public static ArrayList<ledger> readLedger(String filePath, String community_id) {
        ArrayList<ledger> list = new ArrayList<ledger>();
        try {
            File fXmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            Node request_data = doc.getElementsByTagName("REQUESTDATA").item(0);

            System.out.println("----------------------------");

            for (int temp = 0; temp < request_data.getChildNodes().getLength(); temp++) {
                Node nNode = request_data.getChildNodes().item(temp);
                if (!"TALLYMESSAGE".equalsIgnoreCase(nNode.getNodeName())) {
                    continue;
                }
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                for (int tally_message_index = 0; tally_message_index < nNode.getChildNodes().getLength(); tally_message_index++) {
                    Node tally_message_child_node = nNode.getChildNodes().item(tally_message_index);
                    if (!"VOUCHER".equalsIgnoreCase(tally_message_child_node.getNodeName())) {
                        continue;
                    }
                    String narration = "";
                    String voucherno = "";
                    Element voucherElement = (Element) tally_message_child_node;
                    Element dateNode = (Element) voucherElement.getElementsByTagName("DATE").item(0);
                    NodeList narrationList = voucherElement.getElementsByTagName("NARRATION");
                    if (narrationList != null) {
                        if (narrationList.getLength() > 0) {
                            Element narrationNode = (Element) narrationList.item(0);
                            narration = narrationNode.getTextContent();
                        }
                    }
                    String date = dateNode.getTextContent();
                    NodeList voucherNoList = voucherElement.getElementsByTagName("VOUCHERNUMBER");
                    if (voucherNoList != null) {
                        if (voucherNoList.getLength() > 0) {
                            Element vouchernoNode = (Element) voucherNoList.item(0);
                            voucherno = vouchernoNode.getTextContent();
                        }
                    }

                    String voucherId = voucherElement.getAttribute("REMOTEID");
                    String voucherType = voucherElement.getAttribute("VCHTYPE");

                    String dateStr = date.substring(6, 8) + "-" + date.substring(4, 6) + "-" + date.substring(0, 4);
                    int month = Integer.parseInt(date.substring(4, 6));
                    int year = Integer.parseInt(date.substring(0, 4));
                    String fin_year = Util.getFin_year(month, year);

                    NodeList ledgerNodes = voucherElement.getElementsByTagName("ALLLEDGERENTRIES.LIST");
                    for (int ledger_index = 0; ledger_index < ledgerNodes.getLength(); ledger_index++) {
                        Element ledger_node = (Element) ledgerNodes.item(ledger_index);
                        Element accountElement = (Element) ledger_node.getElementsByTagName("LEDGERNAME").item(0);
                        String account_id = accountElement.getTextContent();
                        Element amountElement = (Element) ledger_node.getElementsByTagName("AMOUNT").item(0);
                        Double amount = Double.parseDouble(amountElement.getTextContent());
                        ledger _ledger = new ledger();
                        _ledger.setVoucher_type(voucherType);
                        _ledger.setId(community_id + "^" + fin_year + "^" + _ledger.getVoucher_type() + "^" + voucherId + "^" + account_id.replace(" ", "-"));
                        _ledger.setEvent_date_str(dateStr);
                        _ledger.setVoucher_no(voucherno);
                        String acc_id = community_id + "^" + fin_year + "^" + account_id.replace(" ", "-");
                        _ledger.setAccount_id(acc_id);
                        _ledger.setParticular(narration);
                        _ledger.setReference_id(voucherId);
                        if (amount > 0) {
                            _ledger.setCr_amount(amount);
                        } else {
                            _ledger.setDr_amount((-1) * amount);
                        }
                        _ledger.setCommunity_id(community_id);
                        _ledger.setFin_year(fin_year);
                        list.add(_ledger);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
