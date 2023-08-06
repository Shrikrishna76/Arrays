package com.arraylab.view;

import java.util.Arrays;
import java.util.Scanner;

import com.arraylab.model.Books;
import com.arraylab.service.BooksService;

public class BooksView {
	
	static Scanner sc=new Scanner(System.in);
	static BooksService bs=new BooksService();
	
	static void getAllBooks()
	{
		Books[] bookArray=bs.getAllBooksServices();
		for(Books b:bookArray)
		{
			if(b!=null)
			{
				System.out.println(b);
			}
		}
	}
	
	static void addBook()
	{
		System.out.println("Enter How many you want to add books:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter Book Id:");
		int bookId=sc.nextInt();
		
		System.out.println("Enter Book Name:");
		String bookName=sc.next();
		
		System.out.println("Enter Book Price:");
		float bookPrice=sc.nextFloat();
		
		Books nbook=new Books(bookId,bookName,bookPrice);
		bs.addBookService(nbook);
		
		System.out.println(" ");
		
		}
		
	}
	
	static void   modifyBookName()
	{
		System.out.println("Enter Book Id:");
		int bookId=sc.nextInt();
		System.out.println("Enter Book Name:");
		String bookName=sc.next();
		
		boolean y=bs.modifyBookNameService(bookId, bookName);
		if(y=true)
		{
			System.out.println("Sucessfully Modify Book Name");
		}
		else
		{
			System.out.println(bookId+"not found");
		}
		BooksView.getAllBooks();
		
	}
	
	static void modifyBooksPrice()
	{
		System.out.println("Enter Book Id:");
		int bookId=sc.nextInt();
		System.out.println("Enter Book Price:");
		float bookPrice=sc.nextFloat();
		boolean m=bs.modifyBooksPriceService(bookId,bookPrice);
		if(m)
		{
			System.out.println("Sucessfully Modify Book Name");
		}
		else
		{
			System.out.println(bookId+"not found");
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		int choice;
		
	do
	{	
		System.out.println("1. Add new book:");
		System.out.println("2. Modify the book name: ");
		System.out.println("3. Modify the book price:");
		
		System.out.println("Enter Choice:");
		 choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			addBook();
			getAllBooks();
			break;
			
			
		case 2:
			modifyBookName();
			break;
			
		case 3:
			modifyBooksPrice();
			break;
		case 4:
			getAllBooks();
			break;
			
		 default:
			System.out.println("enter valid data");
			break;
			
			
		}
		
	}while(choice!=0);
		
//	BooksView.addBook();
//	BooksView.getAllBooks();
//	BooksView.addBook();
//	BooksView.getAllBooks();
//	BooksView.modifyBookName();
//	BooksView.modifyBooksPrice();
//	BooksView.getAllBooks();
//	Scanner sc=new Scanner(System.in);
//	
		
		
	}
		
}
