package platform.email;

import java.util.Arrays;
import java.util.Map;

import platform.config.Reader;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.Util;


public class EmailDispatcher {
	private static EmailDispatcher instance;
	private Reader reader;
	private SMTPServerProps smtpServerProps;
	
	private String genericFromId;	//Populated as "from" id in all outgoing mails. Fetched from messaging.properties::m16mail_admin.
	private String uniqueId;
	private String wtBccMail;
	private String domainName;
	private boolean doNotMail;
	private boolean sendMailUniqueId;
	private boolean sendMailToRightId;
	private boolean sendMailToBoth;
	
	public static EmailDispatcher getInstance() {
		if (instance == null)
			instance = new EmailDispatcher();
		return instance;
	}
	
	EmailDispatcher() {
		reader = new Reader(ApplicationConstants.CONFIGURATION_FILE); 
		smtpServerProps = new SMTPServerProps();
		smtpServerProps.setSmtpServer(reader.getString("smtp_server","localhost"));
		smtpServerProps.setSmtpSSLPort(reader.getString("smtp_ssl_port","8080"));
		smtpServerProps.setSmtpUserName(reader.getString("smtp_username",null));
		smtpServerProps.setSmtpPassword(reader.getString("smpt_password",null));
		
		genericFromId = reader.getString("mail_admin",null);
		uniqueId = reader.getString("unique_id",null); 
		wtBccMail = reader.getString("bccMail",null);
		doNotMail = reader.getBoolean("do_not_mail",false);
		sendMailUniqueId  = reader.getBoolean("send_mail_unique_id",true);
		sendMailToRightId  = reader.getBoolean("send_mail_to_right_id",false);
		sendMailToBoth  = reader.getBoolean("send_mail_to_both",false);
		domainName = reader.getString("domain",null);
	}
	
	public  String getDomainName() {
		return domainName;
	}
	
	public  String getUniqueId() {
		return uniqueId;
	}
	
	public  boolean isReachable() {
		//return Util.isReachableByPing(smtpServerProps.getSmtpServer());
		return true;
	}
	
	public boolean isInternetNotAccessible(ApplicationException e) {
		return !Util.isEmpty(e.getMessage()) && (e.getMessage().contains("Unknown SMTP host") ||
				e.getMessage().contains("Could not connect to SMTP host"));
	}
	
	//Use this to send mail to admin (like monitoring alerts) - SendMail.send("adminEmailId", "subject", "message")
	public  void sendToAdmin(String adminEmailId, String subject, String message) throws ApplicationException {
		SMTPMail smtpMail = new SMTPMail(smtpServerProps.getSmtpServer(), genericFromId,
				null, new String[] {adminEmailId}, null, new String[] {uniqueId, wtBccMail}, subject, null,
				smtpServerProps.getSmtpUserName(), smtpServerProps.getSmtpPassword(), true);
		smtpMail.sendMessage(message);
	}
	
	//Use this to send mail to end users (like registration) - SendMail.send("toEmailId", "subject", "message")
	public  void sendToUser(String toEmailId, String subject, String message) throws ApplicationException {
		sendToUser(toEmailId, null, subject, message);
	}
	
	// Use this to send mail to end users (like message share) with reply-to pointing to another email id
	public void sendToUser(String toEmailId, IMailReply iMailReply, String subject, String message) throws ApplicationException {
		if(Util.isEmpty(toEmailId))
			return;
		
		sendToUser(new String[] {toEmailId}, iMailReply, subject, message);
	}
	
	public void sendMail(String toEmailIds, IMailReply iMailReply, String subject, String templete,
			Map<String, String> params) throws ApplicationException 
	{
		sendMail(new String[]{toEmailIds}, iMailReply, subject, templete, params);
	}
	
	public void sendMail(String[] toEmailIds, IMailReply iMailReply, String subject, String templete,
			Map<String, String> params) throws ApplicationException 
	{
		String message = Util.readFileFromLocal(templete.toLowerCase(), params);
		sendToUser(toEmailIds,iMailReply,subject,message);
	}
	
	public void sendSMSMail(String subject, String templete,Map<String, String> params) throws ApplicationException 
	{
		String message = Util.readSMSFileFromLocal(templete.toLowerCase(), params);
		sendToUser(new String[]{uniqueId},null,subject,message);
	}
	
	//Use this to send mail to end users (like registration) - SendMail.send("toEmailIds", "subject", "message")
	public void sendToUser(String[] toEmailIds, IMailReply iMailReply, String subject, String message) throws ApplicationException {
		if(doNotMail || Util.isEmpty(toEmailIds))
			return;
		// Replace all M16 tokens with empty string
		subject = subject.replaceAll("!!!.*!!!", "");
		message = message.replaceAll("!!!.*!!!", "");
		
		// Don't send any mail to WT enterprise admin (as that email doesn't exist). Ex: whistletalk@myntra.com
		for (int i = 0; i < toEmailIds.length; i++) {
			if (Util.isEmpty(toEmailIds[i]))
				continue;
			
			if (toEmailIds[i].toLowerCase().startsWith("c4tinfo@"))
				toEmailIds[i] = uniqueId;
		}
		String[] bcc  = null;
		if(sendMailToBoth) // SoftLayer
			bcc = new String[] {uniqueId};
		else if(sendMailUniqueId) { // Demo & Dev
			subject = subject + " " + Arrays.toString(toEmailIds);
			toEmailIds = new String[] {uniqueId};
		} else if(sendMailToRightId)
			bcc = new String[] {wtBccMail};
		
		String replyToEmailId = iMailReply != null ? iMailReply.getReplyToEmailId() : null;
		String replyToName = iMailReply != null ? iMailReply.getReplyToName() : null;
		String from = genericFromId;
		String replyTo = replyToEmailId;
		if (!Util.isEmpty(replyToName)) {
			replyToName = replyToName.replaceAll("[^a-zA-Z ]", "");
			from = replyToName + " via " + genericFromId;
			if (!Util.isEmpty(replyToEmailId))
				replyTo = replyToName + "<" + replyToEmailId + ">";
		}
		SMTPMail smtpMail = new SMTPMail(smtpServerProps.getSmtpServer(), from, replyTo,
				toEmailIds, null, bcc, subject, null, smtpServerProps .getSmtpUserName(),
				smtpServerProps.getSmtpPassword(), true);
		try {
			smtpMail.sendMessage(message);
		} catch(ApplicationException e) {
			e.printStackTrace();
			//		if (isInternetNotAccessible(e))
	//			HelperFactory.getUnsentEmailHelper().createEntry(toEmailIds, replyToEmailId, replyToName, subject, message);
			throw e;
		}
	}
}