package com.assignment1;
/*
 * 8.WAP to search for a given number in an array and accordingly print the index if exists.
 */

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		int num[]=new int [10];
		int i,n, len=num.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Element:");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enetr Element:");
			num[i]=sc.nextInt();
		}
		
		System.out.println("Enter  number which you want to search: ");
		int p=sc.nextInt();
		
		for(i=0;i<len;i++)
		{
			if(p==num[i])
			{
				System.out.println("This is index :"+i);
			}
					}
		}
		


}
