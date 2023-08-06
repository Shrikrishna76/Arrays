package com.assignment1;
//4.WAP to take array and print all positive numbers 

import java.util.Scanner;

public class PositiveNumber
{
	
	public static int positive(int b[])
	{
		int len=b.length;
		for(int i=0;i<len;i++)
		{
			if(b[i]>0)
			{
				System.out.println("Positive Element:"+b[i]);
				
			}
		}
		System.out.println("-------------------------------");
		for(int i=0;i<len;i++)
		{
			
			if(b[i]<0)
			{
				System.out.println("Negative Element:"+b[i]);
			}
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element:");
		int n=sc.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enetr Element:");
			a[i]=sc.nextInt();
		}
		
		int ans=positive(a);
		
	}

}
