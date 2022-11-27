package com.BookApp.bookApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.BookApp.bookApplication.Model.Product;
import com.BookApp.bookApplication.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/product")
	private ResponseEntity<List<Product>> getAllProducts(){
		return ResponseEntity.ok().body(this.prodService.getProducts());
	}
	
	/*@GetMapping("/product/{productId}")
	private Product getProductById(@PathVariable long productId){
		return this.prodService.getProductById((int) productId);
	}*/
	
	@PostMapping("/product")
	private ResponseEntity<Product> saveProduct(@RequestBody Product p){
		return ResponseEntity.ok().body(this.prodService.createProduct(p));
	}
	
	@PutMapping("/product/updatesus/{userid}")
	private ResponseEntity<Product> updatesus(@PathVariable long userid,@RequestBody Product p){
		p.setUserid(userid);
		return ResponseEntity.ok().body(this.prodService.updatesus(p));
	}
	
	@PutMapping("/product/updateuser/{userid}")
	private ResponseEntity<Product> updateProduct(@PathVariable long userid,@RequestBody Product p){
		p.setUserid(userid);
		return ResponseEntity.ok().body(this.prodService.updateProduct(p));
	}
	
	@PutMapping("/product/updatemoney/{userid}")
	private ResponseEntity<Product> updateBalance(@PathVariable long userid,@RequestBody Product p){
		p.setUserid(userid);
		return ResponseEntity.ok().body(this.prodService.updateBalance(p));
	}
	
	
}
