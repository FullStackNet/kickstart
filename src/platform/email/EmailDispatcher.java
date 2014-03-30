package platform.email;

import java.io.IOException;
import java.util.Map;

import platform.util.ApplicationException;
import platform.util.Conf;
import platform.util.Util;


public class EmailDispatcher {
	static EmailDispatcher instance = null;
	String smtpServer;
	short  smtpSSLPort;
	String smtpUserName;
	String smtpPassword;
	String  mailFrom;
	String  domain; 
	String  unique_id;  
	String  bccMail;
	Boolean  do_not_mail = true;
	Boolean  send_mail_unique_id;
	Boolean  send_mail_to_right_id;
	Boolean  send_mail_to_both;
	
	synchronized public static EmailDispatcher getInstance() {
		 if (instance == null) {
			 instance = new EmailDispatcher();
		 }
		 return instance;
	}
	
	EmailDispatcher() {
		loadConfiguration();
	}
	
	public void loadConfiguration() {
		Conf conf = new Conf("email");
		conf.loadProperties();
		smtpServer = conf.getValue("smtp_server");
		smtpSSLPort = Short.parseShort(conf.getValue("smtp_ssl_port"));
		smtpUserName = conf.getValue("smtp_username");
		smtpPassword = conf.getValue("smpt_password");
		mailFrom = conf.getValue("mail_admin");
		domain = conf.getValue("domain");
		unique_id = conf.getValue("unique_id"); 
		bccMail = conf.getValue("bccMail");
		do_not_mail = conf.getValueAsBoolean("do_not_mail");
		send_mail_unique_id  = conf.getValueAsBoolean("send_mail_unique_id");
		send_mail_to_right_id  = conf.getValueAsBoolean("send_mail_to_right_id");
		send_mail_to_both  = conf.getValueAsBoolean("send_mail_to_both");
	}
	
	void sendMail(String[] toRightId ,String ccId, String subject, String message) throws IOException, ApplicationException
	{
		String[] cc = null;
		if (ccId != null) {
			cc = new String[] {ccId};
		}
		if(send_mail_to_both == true)
		{
			SMTPMail s = new SMTPMail(smtpServer, mailFrom,
					toRightId,cc,new String[] {unique_id,bccMail},
					subject, null, smtpUserName, smtpPassword, true);

			if(!do_not_mail) {
				s.sendMessage(message);
			}
		}
		else if(send_mail_unique_id == true)
		{
			SMTPMail s = new SMTPMail(smtpServer
					, mailFrom,
					new String[] {unique_id,bccMail},cc,null,subject+ " this is the target email:  "+toRightId, null, 
					smtpUserName, smtpPassword, true);
			if(!do_not_mail) {
				s.sendMessage(message);
			}

		}
		else if(send_mail_to_right_id == true)
		{
			SMTPMail s = new SMTPMail(smtpServer, mailFrom,
					toRightId,cc,new String[] {bccMail},subject, null, smtpUserName, smtpPassword, true);
			if(!do_not_mail) {
				s.sendMessage(message);
			}
		}
	}
	
	public void sendMail(final String[] to,final String subject, final String template,final Map<String, String> params)
	{
		 Runnable emailThread = new Runnable() {
			public void run() {
				 String message = Util.readFileFromLocal(template, params);
				 try {
					sendMail(to, null, subject, message);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ApplicationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		new Thread(emailThread).start();
	}
}
