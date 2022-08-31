package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	
	@RequestMapping("/welcome")
	public String welcome(Model model)
	{
		model.addAttribute("Msg", "welcome to Ashok IT");
		String name=null;
		name.length();
		
		return "welcome";
	}

	
}


/*i/p(wen exception code removed)
http://localhost:7090/welcome
	
	o/p
	welcome to Ashok IT
	
	*
	*i/p  http://localhost:7090/welcome
	
	o/p
	Something Went Wrong,Please Try After Sometime...!111
	
	
	*/