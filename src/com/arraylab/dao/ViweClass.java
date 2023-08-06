package com.arraylab.dao;

import java.util.Arrays;

import com.arraylab.model.Books;

public class ViweClass {
	
	public static void main(String args[])
	{
		BooksDAO b=new BooksDAO();
		
		b.addBook(new Books(1,"java",200));
		b.addBook(new Books(2,"c++",150));
		
		
		
		//System.out.println(Arrays.toString(bookArray));
		System.out.println(Arrays.toString(b.getAllBooks()));
		System.out.println(b.modifyBookName(1, "c"));
		System.out.println(b.modifyBookPrice(2, 24.5f));
		
		System.out.println(Arrays.toString(b.getAllBooks()));
		
		
		
	}

}
