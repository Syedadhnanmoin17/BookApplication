package com.BookApp.bookApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BookApp.bookApplication.Model.BookInventory;


public interface BookRepository  extends JpaRepository<BookInventory,Long>{
	@Query(value="Select * from bookinventory i order by booklikes desc",nativeQuery = true)
	List<BookInventory> sortByLikes();
	@Query(value="Select * from bookinventory i order by bookdateadded desc",nativeQuery = true)
	List<BookInventory> sortByDate();
}
