package com.garrett.SpringBootECommerce.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.garrett.SpringBootECommerce.model.Product;

@Service
public class ProductService {
	
	private List<Product> products = new ArrayList<>(Arrays.asList(
			new Product(0, "Pepsi", 1.99),
			new Product(1, "Mountain Dew", 2.50),
			new Product(2, "Coca Cola", 2.25),
			new Product(3, "Sprite", 1.50)
			));
	
	public Product getProductById(int id) {
		// filters through products
		// grabs the first product that matches the given id or it will return null
		return products.stream()
				.filter(p -> p.getProductID() == id)
				.findFirst()
				.orElse(null);
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}

	public void updateProduct(Product product) {
		boolean match = false;
		Product found = null;
		// locate if product exists
		// if it exists, update it
		// else, throw error message
		for (Product p : products) {
			if (p.getProductID() == product.getProductID()) {
				System.out.println("Product found. Old Product: " + p);
				p.setProductName(product.getProductName());
				p.setPrice(product.getPrice());
				match = true;
				found = p;
				break;
			}
		}
		if (match == true) {
			System.out.println("Updated product: New Product: " + found);
		} else {
			System.out.println("Product not found.");
		}
	}

	public void deleteProduct(int id) {
		int index = -1;
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProductID() == id) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			products.remove(index);
			System.out.println("Product deleted with id: " + id);
		} else {
			System.out.println("Unable to delete product. Product not found.");
		}
	}
}
