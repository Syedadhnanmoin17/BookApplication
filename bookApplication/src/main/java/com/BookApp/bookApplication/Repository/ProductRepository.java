package com.BookApp.bookApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookApp.bookApplication.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	
}
