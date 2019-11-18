package sendEmailPackage;

/**
 * @author jigarsony
 */

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void sendEmail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("yoursenderemailid","emailpassword"));
		email.setSSLOnConnect(true);
		email.setFrom("yoursenderemailid");
		email.setSubject("Automation Mail from ...");
		email.setMsg("This is a test mail from ...");
		email.addTo("receiveremailid");
		email.send();
	}

}
