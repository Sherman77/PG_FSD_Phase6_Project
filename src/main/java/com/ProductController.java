package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	private ProductDAO productDao;
	
	@GetMapping(path="/all", produces = "application/json")
	public Products getProducts() {
		return productDao.getAllProducts();
	}
	
}