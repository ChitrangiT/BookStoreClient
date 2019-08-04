package com.BookStoreClient.beans;

public class Book {

	private int bookId;
	private String bookName;
	private String auther;
	private int noOfCopies;
	private float price;
	
	public Book( String bookName, String auther, int noOfCopies, float price) {
		
		this.bookName = bookName;
		this.auther = auther;
		this.noOfCopies = noOfCopies;
		this.price = price;
	}
	
	public Book() {
		
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
