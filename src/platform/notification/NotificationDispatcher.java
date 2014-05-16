package platform.notification;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import platform.util.Util;

import com.google.gson.JsonObject;


public class NotificationDispatcher {
	private static NotificationDispatcher instance;
	private String username = "ajay.nema@gmail.com";
	private String password = "9880158155";
	private String api_key= "uHzBjHDBcS5gfpSTMA5vrcBAurHXiRoY";
	private String sessionId;
	private String URL_ACS = "https://api.cloud.appcelerator.com/v1/";
	
	public void populateSessionId() throws Exception{
		URL url = null;
		try {
			url = new URL(URL_ACS+"users/login.json?key="+api_key+"&login="+username+"&password="+password);
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
				sessionId=meta.substring(0, fin);
				System.out.println("Got the Session Id :"+sessionId);
			}else{
				System.out.println("No encuentra");
			}
		} catch (Exception e) {
			throw new Exception("Problem in getting session"+e);
		}
	}

	public static NotificationDispatcher getInstance() {
		if (instance == null)
			instance = new NotificationDispatcher();
		return instance;
	}
	
	NotificationDispatcher() {
		
	}
	
	public void sendNotification(String channel, String title, String templete,Map<String, String> params) throws Exception 
	{
		String message = Util.readNotificationFileFromLocal(templete.toLowerCase(), params);
		sendNotification(channel, title,message);
	}
	//Use this to send mail to end users (like registration) - SendMail.send("toEmailIds", "subject", "message")
	void sendNotification(String channel, String title, String message) throws Exception {
		if (sessionId == null) {
			populateSessionId();
		}
		sendMessage(channel,title,message);
	}
	
	void sendMessage(String channel, String title, String message) throws Exception{
		URL url = null;
		try {
			JsonObject cred = new JsonObject();
			cred.addProperty("alert",message);
			cred.addProperty("title",title);
			cred.addProperty("vibrate",true);
			cred.addProperty("sound","default");


			String ruta=URL_ACS+"push_notification/notify.json?key="+api_key+"&to_ids=everyone&channel="+channel;
			ruta = ruta+"&session_id="+sessionId+"&_session_id="+sessionId+"&payload="+URLEncoder.encode(cred.toString());
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
				System.out.println("Successfully Send message " + title +"::" +message + "to channel "+channel);
			}else{
				System.out.println("Problem in sending notification "+respuesta);
			}
		} catch (Exception e) {
			throw new Exception("Problem in sending notification "+e);
		}
	}
}