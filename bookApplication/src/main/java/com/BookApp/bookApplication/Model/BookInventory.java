package com.BookApp.bookApplication.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookinventory")
public class BookInventory {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookid;
	
	@Column(name="bookname")
	private String bookname;
	
	@Column(name="bookcategory")
	private String bookcategory;
	
	@Column(name="bookauthor")
	private String bookauthor;
	
	@Column(name="bookprice")
	private long bookprice;
	
	@Column(name="bookdateadded")
	private String bookdateadded;
	
	@Column(name="booklikes")
	private long booklikes;
	
	@Override
	public String toString() {
		return "BookInventory [bookid=" + bookid + ", bookname=" + bookname + ", bookcategory=" + bookcategory
				+ ", bookauthor=" + bookauthor + ", bookprice=" + bookprice + ", bookdateadded=" + bookdateadded
				+ ", booklikes=" + booklikes + ", bookquantity=" + bookquantity + "]";
	}

	public String getBookdateadded() {
		return bookdateadded;
	}

	public void setBookdateadded(String bookdateadded) {
		this.bookdateadded = bookdateadded;
	}

	public long getBooklikes() {
		return booklikes;
	}

	public void setBooklikes(long booklikes) {
		this.booklikes = booklikes;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public long getBookprice() {
		return bookprice;
	}

	public void setBookprice(long bookprice) {
		this.bookprice = bookprice;
	}

	@Column(name="bookquantity")
	private long bookquantity;
	
	BookInventory(){
	}

	public long getBookid() {
		return bookid;
	}

	public void setBookid(long bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookcategory() {
		return bookcategory;
	}

	public void setBookcategory(String bookcategory) {
		this.bookcategory = bookcategory;
	}

	public long getBookquantity() {
		return bookquantity;
	}

	public void setBookquantity(long bookquantity) {
		this.bookquantity = bookquantity;
	}


	
	
}
