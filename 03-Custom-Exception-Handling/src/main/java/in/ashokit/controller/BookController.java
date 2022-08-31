package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	@RequestMapping(value="/findPriceById")
	public String getPriceById(@RequestParam("bookId") String bookId,Model model)
	{
		
		Double bookPrice = service.findPriceById(bookId);
		model.addAttribute("price", "Book Price ::" + bookPrice);
		
		return "display";
	}

	
}

/*i/p : http://localhost:7090/findPriceById?bookId=B101
	o/p
	Book Price ::450.0
	
	i/p :http://localhost:7090/findPriceById?bookId=B102
	
	o/p
	
	*image showing error message */
