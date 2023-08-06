package com.classwork;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		String name[]=new String[10];
		int i,n;
		//String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of name u want to add: ");
		 n=sc.nextInt();
		 
		 for(i=0;i<n;i++)
		 {
			 System.out.println("Enter name");
			 name[i]=sc.next();
		 }
		 for(i=0;i<n;i++)
		 {
			 System.out.println("name is: "+name[i]);
		 }


	}

}
