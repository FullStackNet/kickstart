package platform.email;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

import platform.helper.CustomerHelper;
import platform.helper.SMS_accountHelper;
import platform.resource.customer;
import platform.resource.sms_account;
import platform.util.ApplicationException;
import platform.util.Util;


public class SMSDispatcher {
	private static SMSDispatcher instance;
	Map<String, sms_account> accountMap;
	
	public static SMSDispatcher getInstance() {
		if (instance == null)
			instance = new SMSDispatcher();
		return instance;
	}
	
	SMSDispatcher() {
		accountMap = new HashMap<String, sms_account>();
	}
	
	public  boolean isReachable() {
		//return Util.isReachableByPing(smtpServerProps.getSmtpServer());
		return true;
	}
	public void cleanCache() {
		accountMap.clear();
	}
	public boolean isInternetNotAccessible(ApplicationException e) {
		return !Util.isEmpty(e.getMessage()) && (e.getMessage().contains("Unknown SMTP host") ||
				e.getMessage().contains("Could not connect to SMTP host"));
	}
	void sendHTTPMessage(String urlstr) {
		HttpURLConnection httpURLConnection;
		StringBuilder responseStr = new StringBuilder();
		try {
			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestMethod("GET");

			httpURLConnection.setDoInput(true);
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");

			httpURLConnection.setDoOutput(true);
			OutputStreamWriter ouput = new OutputStreamWriter(
					httpURLConnection.getOutputStream());
			ouput.flush();
			ouput.close();

			InputStream input = httpURLConnection.getInputStream();
			String contentEncoding = httpURLConnection.getContentEncoding();
			// get correct input stream for compressed data:
			if (contentEncoding != null) {
				if (contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); // reads 2 bytes to
														// determine GZIP
														// stream!
				else if (contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte[] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1) {
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}
			System.out.println(responseStr);
			httpURLConnection.disconnect();
			input.close();
		} catch (MalformedURLException mue) {
			System.err.println("Invalid URL");
		} catch (IOException ioe) {
			System.err.println("I/O Error - " + ioe);
		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
	
	public boolean isValidMobileforSMS(String mobileno) {
		if (mobileno.length() != 10)
			return false;
		if (!Util.isNumeric(mobileno)) {
			return false;
		}
		return true;
	}
	
	String getURLFromAccount(sms_account _account,String mobile_no,String message) {
		String url = _account.getUrl()+"?"+_account.getUsername_fieldname()+"="+_account.getUsername();
		url = url + "&"+_account.getPassword_fieldname()+"="+_account.getPassword();
		url = url + "&"+_account.getMobile_fieldname()+"=91"+mobile_no;
		url = url + "&"+_account.getMessage_fieldname()+"="+message;
		return url;
	}
	
	
	public void sendSMS(String mobile_no,String templete,Map<String, String> params) throws ApplicationException 
	{
		sms_account _account = null;
		if (mobile_no.startsWith("91")) {
			mobile_no = mobile_no.substring(2, mobile_no.length());
		}
		if (mobile_no.startsWith("+91")) {
			mobile_no = mobile_no.substring(3, mobile_no.length());
		}
		String message;
		String customerId = params.get("CUSTOMER_ID");
		_account = accountMap.get(customerId);
		if (_account == null) {
			customer _customer = (customer)CustomerHelper.getInstance().getById(customerId);
			if ((_customer != null) && (_customer.getSms_account() != null)) {
				_account = (sms_account)SMS_accountHelper.getInstance().getById(_customer.getSms_account());
				if (_account != null) {
					accountMap.put(customerId, _account);
				}
			}
		}
		try {
			if (isValidMobileforSMS(mobile_no)) {
				message = URLEncoder.encode(Util.readSMSFileFromLocal(templete.toLowerCase(), params),"UTF-8");
				if (_account != null) {
					String url = getURLFromAccount(_account,mobile_no,message);
					sendHTTPMessage(url);
				} else {
					String url = "http://luna.a2wi.co.in:7501/failsafe/HttpLink?aid=516180&pin=cfy@1&mnumber=91"+mobile_no+"&message="+message;
					sendHTTPMessage(url);
				}
			}
			EmailDispatcher.getInstance().sendSMSMail("SMS to "+mobile_no, templete, params);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}