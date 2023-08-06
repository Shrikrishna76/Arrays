package com.assignment1;

import java.util.Scanner;

/*
 * WAP to accept dimension of 1D array and create and accept data in that array. Calculate the sum and average
 *  value of array elements.
 */

public class SumAndAvarage {
	
	public static void main(String[] args) {
		int num[]=new int [10];
		int i,len=num.length,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Element:");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enetr Element:");
			num[i]=sc.nextInt();
		}
		
		
			int sum=0;
			
			for( i=0;i<len;i++)
			{
				sum=sum+num[i];
			}
			System.out.println("Sum: "+sum);
			double average = (double) sum / n;
			System.out.println("Avarage: "+average);
		
		
		
		
		

	}

}
