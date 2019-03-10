package mo.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersion2")
	public String processFormVersion2(HttpServletRequest request,Model model) {
		String name =  request.getParameter("studentName");
		String msg = "Welcome " + name + " in Spring MVC.";
		model.addAttribute("massage", msg);
		return "helloworld";
	}


}
