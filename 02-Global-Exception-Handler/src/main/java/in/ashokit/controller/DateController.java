package in.ashokit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	
	@RequestMapping("/date")
	public String DateDisplay(Model model)
	{
		model.addAttribute("dateMsg", "Today's date is :; " + new Date());
		
		/*String name=null;
		name.length();
		*/
		return "dateDisplay";
	}
	
	
}


/*
i/p
http://localhost:7090/date
	
	o/p
	
	Something Went Wrong,Please Try After Sometime...!111
	
	*
	*
	*if exception code is removed n run
	*	
		String name=null;
		name.length()
		
		i/p :http://localhost:7090/date
		
		o/p
		Today's date is :; Mon Jul 12 21:17:31 IST 2021
	*/
