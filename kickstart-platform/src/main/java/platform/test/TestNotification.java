package platform.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.JsonObject;

public class TestNotification {
	public static String API_KEY = "uHzBjHDBcS5gfpSTMA5vrcBAurHXiRoY";
	public static String API_USR = "9880158155";
	public static String API_PAS = "9880158155";
	public static String URL_ACS = "https://api.cloud.appcelerator.com/v1/";

	public static void main(String[] args){
		try {
			TestNotification cons=new TestNotification();
			String session=cons.obtieneIdSession();
			String text="testing it from program";
			String title="Title";
			cons.sendMessage(text, title, session);

		} catch (Exception e) {
			System.out.println("IOException: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public String obtieneIdSession() throws Exception{
		URL url = null;
		String idSession=null;
		try {
			url = new URL(URL_ACS+"users/login.json?key="+API_KEY+"&login="+API_USR+"&password="+API_PAS+"");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			if (conn.getResponseCode() != 200) {
				throw new Exception(conn.getResponseMessage());
			}
			InputStream is = conn.getInputStream();
			BufferedReader rd = new BufferedReader(
					new InputStreamReader(is));
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			rd.close();
			conn.disconnect();
			System.out.println(sb.toString());
			String respuesta=sb.toString();

			if(respuesta.contains("status\": \"ok") && respuesta.contains("code\": 200") ){
				int number=sb.indexOf("session_id");
				String meta=sb.substring(number+14, number+60);
				int fin=meta.indexOf("\"");

				idSession=meta.substring(0, fin);

				System.out.println("Session Id :"+idSession);
			}else{
				System.out.println("No encuentra");
			}
		} catch (Exception e) {
			throw new Exception("Problema de session "+e);
		}
		return idSession;
	}

	public String sendMessage(String text, String title,String session_id) throws Exception{
		URL url = null;
		String idSession=null;
		try {
			JsonObject cred = new JsonObject();
			cred.addProperty("alert","Notification from school");
			cred.addProperty("title",title);
			cred.addProperty("vibrate",true);
			cred.addProperty("sound","default");


			String ruta=URL_ACS+"push_notification/notify.json?key="+API_KEY+"&to_ids=everyone&channel="+URLEncoder.encode("cc84de40-ce1d-11e3-8e00-005056c00008","UTF-8");
			ruta = ruta+"&session_id="+session_id+"&_session_id="+session_id+"&payload="+URLEncoder.encode(cred.toString(),"UTF-8");
			System.out.println("URL : " +ruta);
			url = new URL(ruta);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			if (conn.getResponseCode() != 200) {
				System.out.println("Response code " +conn.getResponseCode());
				throw new Exception(conn.getResponseMessage());
			}
			InputStream is = conn.getInputStream();
			BufferedReader rd = new BufferedReader(
					new InputStreamReader(is));
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			rd.close();
			conn.disconnect();
			System.out.println(sb.toString());
			String respuesta=sb.toString();

			if(respuesta.contains("status\": \"ok") && respuesta.contains("code\": 200") ){
				int number=sb.indexOf("session_id");
				String meta=sb.substring(number+14, number+60);
				int fin=meta.indexOf("\"");

				idSession=meta.substring(0, fin);

				System.out.println("Session Id :"+idSession);
			}else{
				System.out.println("No encuentra");
			}
		} catch (Exception e) {
			throw new Exception("Problema de session "+e);
		}
		return idSession;
	}
	
	
}