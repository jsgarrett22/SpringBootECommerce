package com.garrett.SpringBootECommerce.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.garrett.SpringBootECommerce.model.Product;

@Service
public class ProductService {
	
	private List<Product> products = Arrays.asList(
			new Product(0, "Pepsi", 1.99),
			new Product(1, "Mountain Dew", 2.50),
			new Product(2, "Coca Cola", 2.25),
			new Product(3, "Sprite", 1.50)
			);
	
	public List<Product> getProducts() {
		return products;
	}
}
