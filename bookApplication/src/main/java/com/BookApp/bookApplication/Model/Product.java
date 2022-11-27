package com.BookApp.bookApplication.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long userid;
	
	@Column(name="username")
	private String username;
	
	@Column(name="useremail")
	private String useremail;
	
	@Column(name="userphno")
	private int userphno;
	
	@Column(name="userbalance")
	private long userbalance;
	
	@Column(name="susornot")
	private int susornot;
	
	Product(){
		this.susornot=0;
		this.userbalance=0;
	}
	

	public long getUserbalance() {
		return userbalance;
	}


	public void setUserbalance(long userbalance) {
		this.userbalance = userbalance;
	}


	public int getSusornot() {
		return susornot;
	}


	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public int getUserphno() {
		return userphno;
	}

	public void setUserphno(int userphno) {
		this.userphno = userphno;
	}


	public void setSusornot(int susornot) {
		this.susornot = susornot;
	}


	
}