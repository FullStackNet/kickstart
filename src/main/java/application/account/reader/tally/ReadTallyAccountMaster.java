package application.account.reader.tally;

import application.account.resource.account;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class ReadTallyAccountMaster {

    public static ArrayList<account> readAccount(String community_id, String fin_year, String filePath) {
        ArrayList<account> list = new ArrayList<account>();
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
                    if (!"LEDGER".equalsIgnoreCase(tally_message_child_node.getNodeName())) {
                        continue;
                    }
                    Element element = (Element) tally_message_child_node;
                    System.out.println(" Name :" + element.getAttribute("NAME"));
                    account _account = new account();
                    _account.setId(community_id + "^" + fin_year + "^" + element.getAttribute("NAME").replace(" ", "-"));
                    _account.setName(element.getAttribute("NAME"));
                    _account.setCommunity_id(community_id);
                    _account.setFin_year(fin_year);
                    NodeList opening_balance = element.getElementsByTagName("OPENINGBALANCE");
                    if ((opening_balance != null) && (opening_balance.getLength() > 0)) {
                        System.out.println(" Opening Balance :" + opening_balance.item(0).getTextContent());
                        try {
                            _account.setOpening_balance(Double.parseDouble(opening_balance.item(0).getTextContent()));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    list.add(_account);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
