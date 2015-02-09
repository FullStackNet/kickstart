package platform.email;



public class EmailConfig {
	private SMTPServerProps smtpServerProps;
	private String genericFromId;	//Populated as "from" id in all outgoing mails. Fetched from messaging.properties::m16mail_admin.
	private String uniqueId;
	private String wtBccMail;
	private String domainName;
	private boolean doNotMail;
	private boolean sendMailUniqueId;
	private boolean sendMailToRightId;
	private boolean sendMailToBoth;
	public SMTPServerProps getSmtpServerProps() {
		return smtpServerProps;
	}
	public void setSmtpServerProps(SMTPServerProps smtpServerProps) {
		this.smtpServerProps = smtpServerProps;
	}
	public String getGenericFromId() {
		return genericFromId;
	}
	public void setGenericFromId(String genericFromId) {
		this.genericFromId = genericFromId;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getWtBccMail() {
		return wtBccMail;
	}
	public void setWtBccMail(String wtBccMail) {
		this.wtBccMail = wtBccMail;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public boolean isDoNotMail() {
		return doNotMail;
	}
	public void setDoNotMail(boolean doNotMail) {
		this.doNotMail = doNotMail;
	}
	public boolean isSendMailUniqueId() {
		return sendMailUniqueId;
	}
	public void setSendMailUniqueId(boolean sendMailUniqueId) {
		this.sendMailUniqueId = sendMailUniqueId;
	}
	public boolean isSendMailToRightId() {
		return sendMailToRightId;
	}
	public void setSendMailToRightId(boolean sendMailToRightId) {
		this.sendMailToRightId = sendMailToRightId;
	}
	public boolean isSendMailToBoth() {
		return sendMailToBoth;
	}
	public void setSendMailToBoth(boolean sendMailToBoth) {
		this.sendMailToBoth = sendMailToBoth;
	}
}