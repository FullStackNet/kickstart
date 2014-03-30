package platform.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class SmtpAuthenticator extends Authenticator
{

    public SmtpAuthenticator(String user, String pwd)
    {
        username = null;
        password = null;
        username = user;
        password = pwd;
    }

    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication(username, password);
    }

    String username;
    String password;
}
