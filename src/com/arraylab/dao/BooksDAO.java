package com.arraylab.dao;

import java.util.Arrays;

import com.arraylab.model.Books;

public class BooksDAO {
	
	static Books bookArray[]=new Books[2];
	static int index=0;
	public void addBook(Books book)
	{
		bookArray[index++]=book;
	}
	
	public boolean modifyBookName(int bookId, String bookName)
	{
		boolean istrue=false;
		for(int i=0;i<index;i++)
		{
			if(bookArray[i].getBookid()==bookId)
			{
				bookArray[i].setBookName(bookName);
				istrue=true;
			}
		}
		
		return false;
	}
	
	public boolean modifyBookPrice(int bookId, float bookPrice)
	{
		boolean istrue=false;
		for(int i=0;i<index;i++)
		{
			if(bookArray[i].getBookid()==bookId)
			{
				bookArray[i].setBookPrice(bookPrice);
				istrue=true;
			}
		}
		
		return false;
	}
	//void,int,primitive and non primitive data type arrays String 
	public Books[] getAllBooks()
	{
		return bookArray;
	}
	
	
	
	

}
