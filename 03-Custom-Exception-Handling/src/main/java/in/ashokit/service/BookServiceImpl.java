package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.exception.NoBookFoundException;

@Service
public class BookServiceImpl  implements BookService{

	@Override
	public Double findPriceById(String bookId) {
		
		if(bookId.equals("B101"))
		{
			return 450.0;
		}
				
		else
		{
			throw new NoBookFoundException("No Book Found With Given Id");
		}
		
	}
	

}


/*i/p

http://localhost:7090/findPriceById?bookId=B101
	
	o/p
	Book Price ::450.0
	
	
	i/p
	*/