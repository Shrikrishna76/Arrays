package com.arraylab.service;

import java.util.Arrays;

import com.arraylab.dao.BooksDAO;
import com.arraylab.model.Books;

public class BooksService {
	static BooksDAO dao=new BooksDAO();
	
	public void addBookService(Books b1)
	{
		dao.addBook(b1);
	}
	
	public boolean modifyBookNameService(int bookId,String bookName)
	{
		return dao.modifyBookName(bookId, bookName);
	}
	
	public boolean modifyBooksPriceService(int bookId,float bookPrice)
	{
		boolean status=dao.modifyBookPrice(bookId, bookPrice);
		return status;
	}
	
	public Books[] getAllBooksServices()
	{
		return dao.getAllBooks();
	}
	
	
	

}
