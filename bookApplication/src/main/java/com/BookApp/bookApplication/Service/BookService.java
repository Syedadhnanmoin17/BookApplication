package com.BookApp.bookApplication.Service;

import java.util.List;


import com.BookApp.bookApplication.Model.BookInventory;

public interface BookService {
	BookInventory createBooks(BookInventory b);
	List<BookInventory> getBooks();
	BookInventory getBookById(int bookId);
	List<String> sortByLikes();
	List<String> sortByDate();
}
