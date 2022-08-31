package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Product;
import in.ashokit.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping(value="/getProduct",produces= {"application/json"})
	public Product getProductById(@RequestParam("pid") String pid)
	{
		return service.findProductById(Integer.parseInt(pid));
		
	}

	
}



/*i/p
http://localhost:7090/getProduct?pid=102
	
	o/p(browser)
	{"errorCode":400,"errorDesc":"No Product Found","date":"2021-07-12T15:16:59.316+00:00"}
	
o/p(postman)
{
   "errorCode": 400,
   "errorDesc": "No Product Found",
    "date": "2021-07-12T15:15:42.302+00:00"
}


i/p
http://localhost:7090/getProduct?pid=101
	
	o/p
	(browser)
	{"productId":101,"productName":"keyboard","productPrice":120.0}

(postman output)

{
    "productId": 101,
    "productName": "keyboard",
    "productPrice": 120
}
*/