package com.arraylab.model;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Books b[]=new Books[4];
		Scanner sc=new Scanner(System.in);
		int i=0,len=b.length;
		for(i=0;i<len;i++)
		{
			b[i]=new Books();
			System.out.println("Enter Book Id: ");
			b[i].setBookid(sc.nextInt());
			
			System.out.println("Enter Book Name: ");
			b[i].setBookName(sc.next());
			
			System.out.println("Enter Book Price: ");
			b[i].setBookPrice(sc.nextFloat());
		}
		
		for(Books bs:b)
		{
			System.out.println(bs);
		}

	}

}
