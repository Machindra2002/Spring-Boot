package mypackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import mypackage.model.EmailModel;

@Service
public class EmailService {

	@Autowired private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String sender;
	
	
	
	public String SendEmail(EmailModel em) {
		try {
			SimpleMailMessage smm = new SimpleMailMessage();
			smm.setFrom(sender);
			smm.setTo(em.getEmail_address());
			smm.setText(em.getSubject());
			smm.setSubject(em.getSubject());
			javaMailSender.send(smm);
			return "Mail send successfully";
			
		}
		catch(Exception ex) {
			return ex.getMessage();
		}
	}
}
