package in.ashokit.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Model model)
	{
		model.addAttribute("errMsg", "Something Went Wrong,Please Try After Sometime...!111");
		return "error";
	}
	
	
	@ExceptionHandler(value=NoBookFoundException.class)
	public String handleNoBookFoundException(Model model) {
		model.addAttribute("errMsg", "Something Went Wrong,Please Try After SomeTime...!!!");
		return "customError";
		
		
	}

}


