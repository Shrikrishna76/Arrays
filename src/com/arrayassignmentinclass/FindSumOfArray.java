package com.arrayassignmentinclass;

import java.util.Scanner;

public class FindSumOfArray {
	
	public static int findSum(int a[])
	{
		int sum=0;
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

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
		
		int ans=findSum(num);
		System.out.println("Sum: "+ans);
	}

}
