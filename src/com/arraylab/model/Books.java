package com.arraylab.model;

public class Books {
	
	private int bookId;
	private String bookName;
	private float bookPrice;
	
	public Books()
	{
		
	}
	
	public Books(int bookId,String bookName,float bookPrice)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}
	
	
	
	public int getBookid() {
		return bookId;
	}

	public void setBookid(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String toString()
	{
		return "Book Id: "+bookId+" Book Name: "+bookName+" Book Price: "+bookPrice;
	}

}
//Books b[]=new Books[10];
