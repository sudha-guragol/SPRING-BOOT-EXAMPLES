package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.exception.NoProductFoundException;
import in.ashokit.model.Product;

@Service
public class ProductServiceImpl  implements ProductService{

	@Override
	public Product findProductById(Integer pid) {
		if(pid==101)
		{
			return new Product(101,"keyboard",120.0);
		}
		else
		{
			//throw custom exception
			throw new NoProductFoundException("No Product Found Exception");
		}
		
	}

	
}
