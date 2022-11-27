package com.BookApp.bookApplication.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookApp.bookApplication.Model.BookInventory;
import com.BookApp.bookApplication.Model.Product;
import com.BookApp.bookApplication.Repository.BookRepository;
import com.BookApp.bookApplication.Repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImp implements ProductService{
	@Autowired
	private ProductRepository prodRep;
	//private BookRepository bookRep;
		
	@Override
	public Product createProduct(Product p){
		return prodRep.save(p);
	}
	
	@Override
	public Product updateProduct(Product p){
		Optional<Product> prodObj =this.prodRep.findById((long) p.getUserid());
		//if(prodObj.isPresent()){
			Product prodUpdate = prodObj.get();
			prodUpdate.setUserid(p.getUserid());
			prodUpdate.setUsername(p.getUsername());
			prodUpdate.setUseremail(p.getUseremail());
			prodUpdate.setUserphno(p.getUserphno());
			return this.prodRep.save(prodUpdate);
		//}
	}
	
	@Override
	public Product updatesus(Product p){
		Optional<Product> prodObj =this.prodRep.findById((long) p.getUserid());
		//if(prodObj.isPresent()){
			Product prodUpdate = prodObj.get();
			prodUpdate.setSusornot(1);
			return this.prodRep.save(prodUpdate);
		//}
	}
	
/*	
	@Override
	public Product getProductById(int pid){
		Optional<Product> prodObj =this.prodRep.findById((long) pid);
		return prodObj.get();
	}
*/
	@Override
	public List<Product> getProducts() {
		return this.prodRep.findAll();
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Product updateBalance(Product p){
		Optional<Product> prodObj =this.prodRep.findById(p.getUserid());
			Product prodUpdate = prodObj.get();
			if(p.getUserbalance()%500==0){
			prodUpdate.setUserbalance(p.getUserbalance()+prodUpdate.getUserbalance());
			return this.prodRep.save(prodUpdate);
			}
			else
				return null;
	}

	/*@Override
	public BookInventory createBooks(BookInventory b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookInventory> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}*/		
	
}
