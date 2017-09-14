/*
 * Copyright 2010-2020 ExceptionSeverity, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to ExceptionSeverity, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of ExceptionSeverity, Inc.
 */

package platform.email;

import java.io.File;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import platform.log.ApplicationLogger;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;

public class SMTPMail {
	// SMTP Variables...
	private String serverAddr;
	private String toAddr[];
	private String ccAddr[];
	private String bccAddr[];
	private String fromAddr;
	private Address[] replyToAddresses;
	private String subject;
	private String fileAttachment;
	private String userName;
	private String password;
	private Session session;
	private int smtp_timeout;
	private int smtp_conn_timeout;
	private String smtpssl_port;

	public SMTPMail(String server, String from, String replyTo, String to[], String cc[],String bcc[], String sub,
				String fileAttach, String usr, String pwd, boolean ssl)
						throws ApplicationException {
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
			if (!Util.isEmpty(replyTo))
				replyToAddresses = new InternetAddress[] {new InternetAddress(replyTo)};
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
			throw new ApplicationException(ExceptionSeverity.ERROR, e.toString());
		}
	}

	private Properties getMailDetails(boolean isSSLMode) {
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

	private String getSslPort() {
		smtpssl_port = System.getProperty("smtp.sslport");
		if (smtpssl_port != null && !smtpssl_port.equals(""))
			return smtpssl_port;
		else
			return "465";
	}

	public void sendMessage(String message) throws ApplicationException {
		try {
			MimeMessage msg = new MimeMessage(session);
			if (!Util.isEmpty(replyToAddresses))
				msg.setReplyTo(replyToAddresses);
			msg.setFrom(new InternetAddress(fromAddr));
			if (Util.isEmpty(toAddr)) {
				if (!Util.isEmpty(bccAddr)) {
					toAddr = bccAddr;
				}
			}
			InternetAddress address[] = new InternetAddress[toAddr.length];
			InternetAddress address1[] = null;
			InternetAddress address2[] = null;
			if(bccAddr != null && bccAddr.length>0){
			 address1 = new InternetAddress[bccAddr.length];
			}
			if(ccAddr != null && ccAddr.length>0){
				 address2 = new InternetAddress[ccAddr.length];
				}
			
			for (int i = 0; i < toAddr.length; i++)
				address[i] = new InternetAddress(toAddr[i]);
			if(bccAddr != null && bccAddr.length>0){
			for (int i = 0; i < bccAddr.length; i++)
				address1[i] = new InternetAddress(bccAddr[i]);
			}
			
			if(ccAddr != null && ccAddr.length>0){
				for (int i = 0; i < ccAddr.length; i++)
					address2[i] = new InternetAddress(ccAddr[i]);
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
			Exception ex = mex;
			do {
				if (ex instanceof SendFailedException) {
					SendFailedException sfex = (SendFailedException) ex;
					javax.mail.Address invalid[] = sfex.getInvalidAddresses();
					if (invalid != null) {
						ApplicationLogger.error("    ** Invalid Addresses", getClass());
						for (int i = 0; i < invalid.length; i++)
							ApplicationLogger.error((new StringBuilder())
									.append("         ").append(invalid[i])
									.toString(), getClass());

					}
					javax.mail.Address validUnsent[] = sfex
							.getValidUnsentAddresses();
					if (validUnsent != null) {
						ApplicationLogger.error("    ** ValidUnsent Addresses", getClass());
						for (int i = 0; i < validUnsent.length; i++)
							ApplicationLogger.error((new StringBuilder())
									.append("         ").append(
											validUnsent[i]).toString(), getClass());

					}
					javax.mail.Address validSent[] = sfex
							.getValidSentAddresses();
					if (validSent != null) {
						ApplicationLogger.error("    ** ValidSent Addresses", getClass());
						for (int i = 0; i < validSent.length; i++)
							ApplicationLogger.error((new StringBuilder())
									.append("         ").append(
											validSent[i]).toString(), getClass());

					}
				}
				if (!(ex instanceof ConnectException)
						&& !(ex instanceof UnknownHostException)
						&& !(ex instanceof SocketTimeoutException)
						&& !(ex instanceof SocketException))
					continue;
				break;
			} while (ex instanceof MessagingException && (ex = ((MessagingException) ex).getNextException()) != null);
			throw new ApplicationException(ExceptionSeverity.ERROR, mex.toString());
		}
	}

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
}