package mypackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mypackage.model.EmailModel;
import mypackage.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	EmailService eserv;
	
	@GetMapping("api/sendemail")
	public String SendEmail() {
		EmailModel e = new EmailModel("laxmanishwargund123@gmail.com","Sample Email Test", "this is email testing code");
		String msg=eserv.SendEmail(e);
		return msg;
	}
}
