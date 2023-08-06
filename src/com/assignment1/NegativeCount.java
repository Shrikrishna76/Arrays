package com.assignment1;
//5.WAP to print all negative elements in an array and also count total number of negative elements in an array.
import java.util.Scanner;

public class NegativeCount {
	
	public static int negative(int a[])
	{
		int len=a.length;
		int countnegative=0;
		for(int i=0;i<len;i++)
		{
			
			if(a[i]<0)
			{
				System.out.println("Negative Element:"+a[i]);
				countnegative++;
			}
			
		}
		System.out.println("Count is : "+countnegative);
		
		return 0;
	}

	public static void main(String[] args) {
		int num[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of element:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enetr Element:");
			num[i]=sc.nextInt();
		}
		int ans=negative(num);
	}

}
