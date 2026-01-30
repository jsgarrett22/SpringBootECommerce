package com.garrett.SpringBootECommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garrett.SpringBootECommerce.model.Product;
import com.garrett.SpringBootECommerce.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	private final ProductService service;
	
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		System.out.println(product);
		service.addProduct(product);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product product) {
		service.updateProduct(product);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable int id) {
		service.deleteProduct(id);
	}
}
