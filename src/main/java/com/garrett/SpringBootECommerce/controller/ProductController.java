package com.garrett.SpringBootECommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garrett.SpringBootECommerce.model.Product;
import com.garrett.SpringBootECommerce.service.ProductService;

@RestController
public class ProductController {
	
	ProductService service = new ProductService();

	@RequestMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
}
