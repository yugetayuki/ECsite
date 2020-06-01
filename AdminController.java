package jp.co.internous.ecsite.controller;

import org.springframework.stereotype.Contoroller;

@Controller
@RequestMapping("/ecsite/admin")
public class AdminController {
	
	@RequestMapping("/")
	public String index() {
		return "adminindex";
	}
	
	@PostMapping("/welcome")
	public String welcome(loginForm form, Model m) {
		System.out.println(form.getUserName() + " " + form.getPassword());
		
		return "welcome";
	}

}
