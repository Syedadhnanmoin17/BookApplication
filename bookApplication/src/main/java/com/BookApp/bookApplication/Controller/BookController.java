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

import com.BookApp.bookApplication.Model.BookInventory;

import com.BookApp.bookApplication.Model.Product;
import com.BookApp.bookApplication.Service.BookService;
import com.BookApp.bookApplication.Service.ProductService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	private ResponseEntity<List<BookInventory>> getAllProducts(){
		return ResponseEntity.ok().body(this.bookService.getBooks());
	}
	
	@GetMapping("/books/{bookId}")
	private BookInventory getProductById(@PathVariable long bookId){
		return this.bookService.getBookById((int) bookId);
	}
	
	@PostMapping("/books")
	private ResponseEntity<BookInventory> saveBookInventory(@RequestBody BookInventory b){
		return ResponseEntity.ok().body(this.bookService.createBooks(b));
	}
	
	/*@PutMapping("/product/updatemoney/{userid}")
	private ResponseEntity<BookWallet> updateBalance(@PathVariable long userid,@RequestBody BookWallet b){
		b.setUserid(userid);
		return ResponseEntity.ok().body(this.prodService.updateBalance(b));
	}*/
	
	/*@PutMapping("/product/updateuser/{userid}")
	private ResponseEntity<Product> updateProduct(@PathVariable long userid,@RequestBody Product p){
		p.setUserid(userid);
		return ResponseEntity.ok().body(this.prodService.updateProduct(p));
	}*/
	
	@GetMapping("/books/sortByLikes")
	private ResponseEntity<List<String>> sortByLikes(){
		return ResponseEntity.ok().body(this.bookService.sortByLikes());
	}
	
	@GetMapping("/books/sortByDateAdded")
	private ResponseEntity<List<String>> sortByDate(){
		return ResponseEntity.ok().body(this.bookService.sortByDate());
	}
	
}

