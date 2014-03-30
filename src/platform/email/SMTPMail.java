/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.email;

import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;


/**
 * 
 * @author saurabhd
 * 
 */
public class SMTPMail {

	// SMTP Variables...
	String serverAddr;

	String toAddr[];

	String ccAddr[];

	String bccAddr[];

	String fromAddr;

	String subject;

	String fileAttachment;

	String userName;

	String password;

	Session session;

	int smtp_timeout;

	int smtp_conn_timeout;

	String smtpssl_port;

	boolean isSSL;

	public SMTPMail() {

	}
	/**
	 * 
	 * @param server
	 * @param from
	 * @param to
	 * @param sub
	 * @throws IOException
	 */
	public SMTPMail(String server, String from, String to,String cc,String bcc, String sub)
			throws IOException {
		serverAddr = "";
		fromAddr = "admin@m16.com";
		subject = "";
		fileAttachment = null;
		userName = "";
		password = "";
		smtp_timeout = 0;
		smtp_conn_timeout = 0;
		smtpssl_port = "465";
		toAddr[0] = to;
		ccAddr[0] = cc;
		bccAddr[0] = bcc;
		fromAddr = from;
		subject = sub;
		serverAddr = server;
		Properties props = new Properties();
		props.put("mail.smtp.host", serverAddr);
		smtp_timeout = getSmtpTimeout();
		if (smtp_timeout != -1)
			props.put("mail.smtp.timeout", (new StringBuilder()).append("")
					.append(smtp_timeout).toString());
		smtp_conn_timeout = getSmtpConnectionTimeout();
		if (smtp_conn_timeout != -1)
			props.put("mail.smtp.connectiontimeout", (new StringBuilder())
					.append("").append(smtp_conn_timeout).toString());
		session = Session.getInstance(props, null);
	}

	/**
	 * 
	 * @param server
	 * @param from
	 * @param to
	 * @param sub
	 * @throws IOException
	 */
	public SMTPMail(String server, String from, String to[],String cc[],String bcc[], String sub)
			throws IOException {
		serverAddr = "";
		fromAddr = "admin@m16.com";
		subject = "";
		fileAttachment = null;
		userName = "";
		password = "";
		smtp_timeout = 0;
		smtp_conn_timeout = 0;
		smtpssl_port = "465";
		toAddr = to;
		ccAddr = cc;
		bccAddr = bcc;
		fromAddr = from;
		subject = sub;
		serverAddr = server;
		Properties props = new Properties();
		props.put("mail.smtp.host", serverAddr);
		smtp_timeout = getSmtpTimeout();
		if (smtp_timeout != -1)
			props.put("mail.smtp.timeout", (new StringBuilder()).append("")
					.append(smtp_timeout).toString());
		smtp_conn_timeout = getSmtpConnectionTimeout();
		if (smtp_conn_timeout != -1)
			props.put("mail.smtp.connectiontimeout", (new StringBuilder())
					.append("").append(smtp_conn_timeout).toString());
		session = Session.getInstance(props, null);
	}

	/**
	 * 
	 * @param server
	 * @param from
	 * @param to
	 * @param sub
	 * @param usr
	 * @param pwd
	 * @throws IOException
	 */
	public SMTPMail(String server, String from, String to[],String cc[],String bcc[] , String sub,
			String usr, String pwd) throws IOException {
		serverAddr = "";
		subject = "";
		fileAttachment = null;
		userName = "";
		password = "";
		smtp_timeout = 0;
		smtp_conn_timeout = 0;
		smtpssl_port = "465";
		toAddr = to;
		ccAddr = cc;
		bccAddr = bcc;
		fromAddr = from;
		subject = sub;
		serverAddr = server;
		userName = usr;
		password = pwd;
		Properties props = new Properties();
		props.put("mail.smtp.host", serverAddr);
		props.put("mail.smtp.auth", "true");
		smtp_timeout = getSmtpTimeout();
		if (smtp_timeout != -1)
			props.put("mail.smtp.timeout", (new StringBuilder()).append("")
					.append(smtp_timeout).toString());
		smtp_conn_timeout = getSmtpConnectionTimeout();
		if (smtp_conn_timeout != -1)
			props.put("mail.smtp.connectiontimeout", (new StringBuilder())
					.append("").append(smtp_conn_timeout).toString());
		String decPassword = null;
		try {
			// decPassword = Coding.convertFromBase(password);
			decPassword = password;
		} catch (Exception e) {
			System.out.println("Exception while Decrpting PASSWORD ");
			e.printStackTrace();
		}
		SmtpAuthenticator auth = new SmtpAuthenticator(userName,
				decPassword);
		session = Session.getInstance(props, auth);
	}

	/**
	 * 
	 * @param server
	 * @param from
	 * @param to
	 * @param sub
	 * @param fileAttach
	 * @throws IOException
	 */
	public SMTPMail(String server, String from, String to[],String cc[],String bcc[] ,String sub,
			String fileAttach) throws IOException {
		serverAddr = "";
		fromAddr = "admin@m16.com";
		subject = "";
		fileAttachment = null;
		userName = "";
		password = "";
		smtp_timeout = 0;
		smtp_conn_timeout = 0;
		smtpssl_port = "465";
		toAddr = to;
		ccAddr = cc;
		bccAddr = bcc;
		fromAddr = from;
		subject = sub;
		serverAddr = server;
		fileAttachment = fileAttach;
		Properties props = new Properties();
		props.put("mail.smtp.host", serverAddr);
		smtp_timeout = getSmtpTimeout();
		if (smtp_timeout != -1)
			props.put("mail.smtp.timeout", (new StringBuilder()).append("")
					.append(smtp_timeout).toString());
		smtp_conn_timeout = getSmtpConnectionTimeout();
		if (smtp_conn_timeout != -1)
			props.put("mail.smtp.connectiontimeout", (new StringBuilder())
					.append("").append(smtp_conn_timeout).toString());
		session = Session.getInstance(props, null);
	}

	/**
	 * 
	 * @param server
	 * @param from
	 * @param to
	 * @param sub
	 * @param fileAttach
	 * @param usr
	 * @param pwd
	 * @throws IOException
	 */
	public SMTPMail(String server, String from, String to[],String cc[],String bcc[], String sub,
			String fileAttach, String usr, String pwd) throws IOException {
		serverAddr = "";
		fromAddr = "admin@m16.com";
		subject = "";
		fileAttachment = null;
		userName = "";
		password = "";
		smtp_timeout = 0;
		smtp_conn_timeout = 0;
		smtpssl_port = "465";
		toAddr = to;
		ccAddr = cc;
		bccAddr = bcc;
		fromAddr = from;
		subject = sub;
		serverAddr = server;
		fileAttachment = fileAttach;
		userName = usr;
		password = pwd;
		Properties props = new Properties();
		props.put("mail.smtp.host", serverAddr);
		props.put("mail.smtp.auth", "true");
		smtp_timeout = getSmtpTimeout();
		if (smtp_timeout != -1)
			props.put("mail.smtp.timeout", (new StringBuilder()).append("")
					.append(smtp_timeout).toString());
		smtp_conn_timeout = getSmtpConnectionTimeout();
		if (smtp_conn_timeout != -1)
			props.put("mail.smtp.connectiontimeout", (new StringBuilder())
					.append("").append(smtp_conn_timeout).toString());
		String decPassword = null;
		try {
			// decPassword = Coding.convertFromBase(password);
			decPassword = password;
		} catch (Exception e) {
			System.out.println("Exception while Decrpting PASSWORD ");
			e.printStackTrace();
		}
		SmtpAuthenticator auth = new SmtpAuthenticator(userName,
				decPassword);
		session = Session.getInstance(props, auth);
	}

	/**
	 * 
	 * @param server
	 * @param from
	 * @param to
	 * @param sub
	 * @param fileAttach
	 * @param usr
	 * @param pwd
	 * @param ssl
	 * @throws IOException
	 */
	public SMTPMail(String server, String from, String to[],String cc[],String bcc[], String sub,
			String fileAttach, String usr, String pwd, boolean ssl)
					throws IOException {
		serverAddr = "";
		fromAddr = "admin@m16.com";
		subject = "";
		fileAttachment = null;
		userName = "";
		password = "";
		smtp_timeout = 0;
		smtp_conn_timeout = 0;
		smtpssl_port = "465";
		toAddr = to;
		ccAddr = cc;
		bccAddr = bcc;
		fromAddr = from;
		subject = sub;
		serverAddr = server;
		if (fileAttach == null)
			fileAttach = "";
		if (usr == null)
			usr = "";
		if (pwd == null)
			pwd = "";
		fileAttachment = fileAttach;
		userName = usr;
		password = pwd;
		try {
			Properties props = getMailDetails(ssl);
			if (!ssl) {
				if (userName.equals("") || password.equals(""))
					session = Session.getInstance(props, null);
				if (!userName.equals("") && !password.equals("")) {
					String decPassword = new String();
					try {
						// decPassword = Coding.convertFromBase(password);
						decPassword = password;
					} catch (Exception e) {
						System.err
						.println("Exception while Decrypting PASSWORD ");
						e.printStackTrace();
					}
					props.put("mail.smtp.auth", "true");
					SmtpAuthenticator auth = new SmtpAuthenticator(
							userName, decPassword);
					session = Session.getInstance(props, auth);
				}
			} else {
				if (userName.equals("") || password.equals(""))
					session = Session.getInstance(props, null);
				if (!userName.equals("") && !password.equals("")) {
					String decPassword = new String();
					try {
						// decPassword = Coding.convertFromBase(password);
						decPassword = password;
					} catch (Exception e) {
						System.err
						.println("Exception while Decrypting PASSWORD ");
						e.printStackTrace();
					}
					props.put("mail.smtp.auth", "true");
					SmtpAuthenticator auth = new SmtpAuthenticator(
							userName, decPassword);
					session = Session.getInstance(props, auth);
				}
			}
		} catch (Exception e) {
			System.err.println((new StringBuilder()).append("Exception is : ")
					.append(e).toString());
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param isSSLMode
	 * @return
	 */
	public Properties getMailDetails(boolean isSSLMode) {
		Properties props = new Properties();
		props.put("mail.smtp.host", serverAddr);
		smtp_timeout = getSmtpTimeout();
		if (smtp_timeout != -1)
			props.put("mail.smtp.timeout", (new StringBuilder()).append("")
					.append(smtp_timeout).toString());
		smtp_conn_timeout = getSmtpConnectionTimeout();
		if (smtp_conn_timeout != -1)
			props.put("mail.smtp.connectiontimeout", (new StringBuilder())
					.append("").append(smtp_conn_timeout).toString());
		if (isSSLMode) {
			smtpssl_port = getSslPort();
			props.put("mail.smtp.port", smtpssl_port);
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.socketFactory.port", smtpssl_port);
			props.put("mail.smtp.socketFactory.class",
					"javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.socketFactory.fallback", "false");
		}
		return props;
	}

	/**
	 * 
	 * @param from
	 */
	public void setFromAddress(String from) {
		fromAddr = from;
	}

	/**
	 * 
	 * @param to
	 */
	public void setToAddress(String to) {
		String too[] = new String[1];
		too[0] = to;
		setToAddress(too);
	}

	public void setCcAddress(String cc) {
		String ccc[] = new String[1];
		ccc[0] = cc;
		setToAddress(ccc);
	}

	public void setBccAddress(String bcc) {
		String too[] = new String[1];
		too[0] = bcc;
		setToAddress(too);
	}

	/**
	 * 
	 * @param to
	 */
	public void setToAddress(String to[]) {
		toAddr = to;
	}

	public void setCcAddress(String cc[]) {
		bccAddr = cc;
	}

	public void setBccAddress(String bcc[]) {
		bccAddr = bcc;
	}

	/**
	 * 
	 * @param sub
	 */
	public void setSubject(String sub) {
		subject = sub;
	}

	/**
	 * 
	 * @param file
	 */
	public void setFileAttachment(String file) {
		fileAttachment = file;
	}

	/**
	 * 
	 * @return
	 */
	public String getSslPort() {
		smtpssl_port = System.getProperty("smtp.sslport");
		if (smtpssl_port != null && !smtpssl_port.equals(""))
			return smtpssl_port;
		
		return "465";
	}

	/**
	 * 
	 * Actual method to send the message
	 * 
	 * @param message
	 * @throws IOException
	 * @throws ApplicationException 
	 */
	public void sendMessage(String message) throws IOException, ApplicationException {
		try {
			if (fromAddr == null) throw new ApplicationException(ExceptionSeverity.ERROR, "From address is wrong");
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(fromAddr));
			InternetAddress address[] = new InternetAddress[toAddr.length];
			InternetAddress address1[] = null;
			InternetAddress address2[] = null;
			if(bccAddr != null && bccAddr.length>0){
				address1 = new InternetAddress[bccAddr.length];
				for (int i = 0; i < toAddr.length; i++)
					address[i] = new InternetAddress(toAddr[i]);
			}
			if(ccAddr != null && ccAddr.length>0){
				address2 = new InternetAddress[ccAddr.length];
			}


			if(bccAddr != null && bccAddr.length>0){
				if (address1 != null) {
					for (int i = 0; i < bccAddr.length; i++)
						address1[i] = new InternetAddress(bccAddr[i]);
				}
			}

			if(ccAddr != null && ccAddr.length>0){
				if (address2 != null) {
					for (int i = 0; i < ccAddr.length; i++)
						address2[i] = new InternetAddress(ccAddr[i]);
				}
			}

			msg.setRecipients(javax.mail.Message.RecipientType.TO, address);
			if(address1 != null && address1.length>0){
				msg.setRecipients(javax.mail.Message.RecipientType.BCC, address1);
			}
			if(address2 != null && address2.length>0){
				msg.setRecipients(javax.mail.Message.RecipientType.CC, address2);
			}
			String charset = "UTF-8";
			if (charset != null && !charset.trim().equals(""))
				msg.setSubject(subject, charset);
			else
				msg.setSubject(subject);
			msg.setSentDate(new Date());
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			if (charset != null && !charset.trim().equals(""))
				messageBodyPart.setContent(message, "text/html");
			//messageBodyPart.setText(message, charset);
			else
				messageBodyPart.setContent(message, "text/html");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			if (fileAttachment != null) {
				for (StringTokenizer st = new StringTokenizer(fileAttachment,
						","); st.hasMoreTokens(); multipart
						.addBodyPart(messageBodyPart)) {
					String fileUrl = st.nextToken();
					messageBodyPart = new MimeBodyPart();
					javax.activation.DataSource source = new FileDataSource(
							fileUrl);
					File file = new File(fileUrl);
					String filename = file.getName();
					messageBodyPart.setDataHandler(new DataHandler(source));
					messageBodyPart.setFileName(filename);
				}

			}
			msg.setContent(multipart);
			Transport.send(msg);
		} catch (MessagingException mex) {
			System.err.println((new StringBuilder()).append(
					"Exception while sending mail notification. ").append(
							mex.getMessage()).toString());
			Exception ex = mex;
			do {
				if (ex instanceof SendFailedException) {
					SendFailedException sfex = (SendFailedException) ex;
					javax.mail.Address invalid[] = sfex.getInvalidAddresses();
					if (invalid != null) {
						System.err.println("    ** Invalid Addresses");
						if (invalid != null) {
							for (int i = 0; i < invalid.length; i++)
								System.err.println((new StringBuilder())
										.append("         ").append(invalid[i])
										.toString());

						}
					}
					javax.mail.Address validUnsent[] = sfex
							.getValidUnsentAddresses();
					if (validUnsent != null) {
						System.err.println("    ** ValidUnsent Addresses");
						if (validUnsent != null) {
							for (int i = 0; i < validUnsent.length; i++)
								System.err.println((new StringBuilder())
										.append("         ").append(
												validUnsent[i]).toString());

						}
					}
					javax.mail.Address validSent[] = sfex
							.getValidSentAddresses();
					if (validSent != null) {
						System.err.println("    ** ValidSent Addresses");
						if (validSent != null) {
							for (int i = 0; i < validSent.length; i++)
								System.err.println((new StringBuilder())
										.append("         ").append(
												validSent[i]).toString());

						}
					}
				}
				if (!(ex instanceof ConnectException)
						&& !(ex instanceof UnknownHostException)
						&& !(ex instanceof SocketException))
					continue;
				System.err
				.println("Invalid HostName or Port, unable to connect the mail server");
				break;
			} while ((ex = ((MessagingException) ex).getNextException()) != null);
		}
	}

	/**
	 * 
	 * @return
	 */
	private int getSmtpTimeout() {
		int retTimeoutVal;
		int smtpTimeout;
		String timeout;
		retTimeoutVal = -1;
		smtpTimeout = 0;
		timeout = System.getProperty("smtp.timeout");
		if (timeout == null)
			return 30000; // 30 seconds default timeout..

		smtpTimeout = Integer.parseInt(timeout);
		if (smtpTimeout > 0)
			return smtpTimeout;
		try {
			System.err.println((new StringBuilder()).append(
					"Invalid SMTP timeout value specified : ").append(
							smtpTimeout).append(", setting default infinite timeout")
							.toString());
			return retTimeoutVal;
		} catch (Exception e) {
			System.err
			.println("Invalid SMTP timeout value, setting default infinite timeout");
		}
		return retTimeoutVal;
	}

	/**
	 * 
	 * @return
	 */
	private int getSmtpConnectionTimeout() {
		int retConnTimeoutVal;
		String connTimeout;
		retConnTimeoutVal = -1;
		int smtpConnTimeout = 0;
		connTimeout = System.getProperty("smtp.connectiontimeout");
		if (connTimeout == null)
			return 30000;

		smtpConnTimeout = Integer.parseInt(connTimeout);
		if (smtpConnTimeout > 0)
			return smtpConnTimeout;
		try {
			System.err.println((new StringBuilder()).append(
					"Invalid SMTP connection timeout value specified : ")
					.append(connTimeout).append(
							", setting default infinite timeout").toString());
			return retConnTimeoutVal;
		} catch (Exception e) {
			System.err
			.println("Invalid SMTP connection timeout value, setting default infinite timeout");
		}
		return retConnTimeoutVal;
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void close() throws IOException {
		// TODO
	}

	public static void main(String[] args) throws ApplicationException {
		try {
			SMTPMail s = new SMTPMail("smtp.gmail.com", "m16root@gmail.com", new String[]{"wtbackupmail@gmail.com"}, new String[]{"wtbackupmail@gmail.com"}, null, "Hey.. u got a message",
					null, "m16root@gmail.com", "m16root_pass", true);
			s.sendMessage("You have got a new message!!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getFromAddr() {
		return fromAddr;
	}
	public void setFromAddr(String fromAddr) {
		this.fromAddr = fromAddr;
	}
	public boolean isSSL() {
		return isSSL;
	}
	public void setSSL(boolean isSSL) {
		this.isSSL = isSSL;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getServerAddr() {
		return serverAddr;
	}
	public void setServerAddr(String serverAddr) {
		this.serverAddr = serverAddr;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public int getSmtp_conn_timeout() {
		return smtp_conn_timeout;
	}
	public void setSmtp_conn_timeout(int smtp_conn_timeout) {
		this.smtp_conn_timeout = smtp_conn_timeout;
	}
	public int getSmtp_timeout() {
		return smtp_timeout;
	}
	public void setSmtp_timeout(int smtp_timeout) {
		this.smtp_timeout = smtp_timeout;
	}
	public String getSmtpssl_port() {
		return smtpssl_port;
	}
	public void setSmtpssl_port(String smtpssl_port) {
		this.smtpssl_port = smtpssl_port;
	}
	public String[] getToAddr() {
		return toAddr;
	}
	public void setToAddr(String[] toAddr) {
		this.toAddr = toAddr;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFileAttachment() {
		return fileAttachment;
	}
	public String getSubject() {
		return subject;
	}
}
