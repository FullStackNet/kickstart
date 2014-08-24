package platform.notification;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Map;

import platform.log.ApplicationLogger;
import platform.util.Util;

import com.google.gson.JsonObject;


public class NotificationDispatcher {
	private static NotificationDispatcher instance;
	private String username = "ajay.nema@gmail.com";
	private String password = "9880158155";
	private String api_key= "2Ykb8C7MApQ6M6u7x7Y6mQCQNCOMzyzs";
	private String sessionId;
	private String URL_ACS = "https://api.cloud.appcelerator.com/v1/";
	Date lastSessionUpdated = null;
	long count = 0;
	public void populateSessionId() throws Exception{
		URL url = null;
		HttpURLConnection conn = null;
		BufferedReader rd  = null;
		try {
			url = new URL(URL_ACS+"users/login.json?key="+URLEncoder.encode(api_key,"UTF-8")+"&login="+URLEncoder.encode(username,"UTF-8")+"&password="+URLEncoder.encode(password,"UTF-8"));
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			if (conn.getResponseCode() != 200) {
				throw new Exception(conn.getResponseMessage());
			}
			InputStream is = conn.getInputStream();
			rd = new BufferedReader(
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

			if(respuesta.contains("ok") && respuesta.contains("200") ){
				int number=sb.indexOf("session_id");
				String meta=sb.substring(number+14, number+60);
				int fin=meta.indexOf("\"");
				sessionId=meta.substring(0, fin);
				System.out.println("Got the Session Id :"+sessionId);
			}else{
				ApplicationLogger.error("Error in login ", this.getClass());
			}
		} catch (Exception e) {
			if (rd != null) {
				rd.close();
			}
			if (conn != null)
				conn.disconnect();
			ApplicationLogger.error("Error in login " + " Response :: "+e.getMessage() , this.getClass());
			throw new Exception("Problem in getting session"+e);
		}
	}

	public static NotificationDispatcher getInstance() {
		if (instance == null)
			instance = new NotificationDispatcher();
		return instance;
	}
	
	NotificationDispatcher() {
		lastSessionUpdated = new Date();
	}
	
	public void sendNotification(String channel, String title, String templete,Map<String, String> params) throws Exception 
	{
		String message = Util.readNotificationFileFromLocal(templete.toLowerCase(), params);
		sendNotification(channel, title,message);
	}
	//Use this to send mail to end users (like registration) - SendMail.send("toEmailIds", "subject", "message")
	public void sendNotification(String channel, String title, String message) throws Exception {
		Date currentTime = new Date();
		if ((currentTime.getTime() - lastSessionUpdated.getTime() > (30*60*1000L))) {
			sessionId = null;
		}
		if (sessionId == null) {
			populateSessionId();
		}
		sendMessage(channel,title,message);
	}
	
	void sendMessage(String channel, String title, String message) throws Exception{
		URL url = null;
		HttpURLConnection conn = null;
		BufferedReader rd  = null;
		try {
			JsonObject cred = new JsonObject();
			cred.addProperty("alert",message);
			cred.addProperty("title",title);
			cred.addProperty("vibrate",true);
			cred.addProperty("sound","default");
			String ruta=URL_ACS+"push_notification/notify.json?key="+URLEncoder.encode(api_key,"UTF-8")+"&to_ids=everyone&channel="+URLEncoder.encode(channel,"UTF-8");
			ruta = ruta+"&session_id="+URLEncoder.encode(sessionId,"UTF-8")+"&_session_id="+URLEncoder.encode(sessionId,"UTF-8")+"&payload="+URLEncoder.encode(cred.toString(),"UTF-8");
			System.out.println("URL : " +ruta);
			ApplicationLogger.info("URL " +ruta, this.getClass());
			url = new URL(ruta);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			if (conn.getResponseCode() != 200) {
				System.out.println("Response code " +conn.getResponseCode());
				throw new Exception(conn.getResponseMessage());
			}
			InputStream is = conn.getInputStream();
			rd = new BufferedReader(
					new InputStreamReader(is));
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			rd.close();
			conn.disconnect();
			String respuesta=sb.toString();
			if(respuesta.contains("status\": \"ok") && respuesta.contains("code\": 200") ){
				ApplicationLogger.info("Send successfully Message " + channel + "::"+title+"::"+ message, this.getClass());
				System.out.println("Successfully Send message " + title +"::" +message + "to channel "+channel);
			}else{
				ApplicationLogger.error("Error in sending message " + channel + "::"+title+"::"+ message+" Response :: "+respuesta, this.getClass());
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (rd != null) {
				rd.close();
			}
			if (conn != null)
				conn.disconnect();
			ApplicationLogger.error("Error in sending message " + channel + "::"+title+"::"+ message + " Response :: "+e.getMessage() , this.getClass());
			throw new Exception("Problem in sending notification "+e);
		}
	}
}