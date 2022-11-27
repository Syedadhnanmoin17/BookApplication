package com.BookApp.bookApplication.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BookApp.bookApplication.Model.BookInventory;

import com.BookApp.bookApplication.Model.Product;
@Service

public interface ProductService {
	Product createProduct(Product p);
	Product updatesus(Product p);
	List<Product> getProducts();
	Product getProductById(int pid);
	Product updateProduct(Product p);
	//void delProduct(int pid);
	Product updateBalance(Product p);
	
 
}
