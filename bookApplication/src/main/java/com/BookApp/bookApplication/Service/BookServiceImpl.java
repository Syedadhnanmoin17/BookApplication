package com.BookApp.bookApplication.Service;

import java.util.ArrayList;
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
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRep;
		
	@Override
	public BookInventory createBooks(BookInventory b){
		return bookRep.save(b);
	}
	
	@Override
	public List<BookInventory> getBooks() {
		return this.bookRep.findAll();
	}

	@Override
	public BookInventory getBookById(int bookId) {
		// TODO Auto-generated method stub
		Optional<BookInventory> bookObj =this.bookRep.findById((long) bookId);
		return bookObj.get();
	}

	@Override
	public List<String> sortByLikes() {
		// TODO Auto-generated method stub
		List<String> likes=new ArrayList<>();
		List<BookInventory> inv=this.bookRep.sortByLikes();
		for(BookInventory i:inv) {
			likes.add(i.toString());
		}
		return likes;
	}

	@Override
	public List<String> sortByDate() {
		// TODO Auto-generated method stub
		List<String> dates=new ArrayList<>();
		List<BookInventory> inv=this.bookRep.sortByDate();
		for(BookInventory i:inv) {
			dates.add(i.toString());
		}
		return dates;
	}

}
