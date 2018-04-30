import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class SendMail {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=========test start");
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("samartha788@gmailcom", "sammy@123"));
		email.setSSL(true);
		email.setFrom("samarth.bhishma@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail from selenium");
		email.addTo("foo@bar.com");
		email.send();
		System.out.println("========= email sent");
	}

}
