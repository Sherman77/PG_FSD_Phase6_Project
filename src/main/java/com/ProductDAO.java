package com;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	private static Products list = new Products();
	
	static
	{
		list.getProductList().add(new Product(1, "Nike", 99.99, "Black"));
		list.getProductList().add(new Product(2, "Nike", 29.59, "Red"));
		list.getProductList().add(new Product(3, "Puma", 50.00, "Black"));
		list.getProductList().add(new Product(4, "Adidas", 75.50, "White"));
		list.getProductList().add(new Product(5, "Puma", 9.99, "Yellow"));
	}
	
	public Products getAllProducts() {
		return list;
	}
	
}
