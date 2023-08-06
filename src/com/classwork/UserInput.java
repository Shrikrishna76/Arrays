package com.classwork;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		double marks[]=new double[10];
		int len=marks.length;
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Length: "+len);
		System.out.println("How many marks you want to add : ");
		 n=sc.nextInt();
		 
		 for(i=0;i<n;i++)
		 {
			 System.out.println("Enter marks : ");
			  marks[i]=sc.nextDouble();
		 }
		 
		 System.out.println("--------------Array------------");
		 
		 for(i=0;i<n;i++)
		 {
			 System.out.println("marks["+i+"] : "+marks[i]);
		 }
		 
	}

}
