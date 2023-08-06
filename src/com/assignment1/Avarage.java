package com.assignment1;

 /* 7.Write two methods that return the average of an array with following headers.
	a.	public static int average(int[] array)
	b.	public static double average(double[] array).
	c.	Write main and invoke the 2 methods. 

 */

import java.util.Scanner;

public class Avarage {
	static int n;
	static int av;
	static int sum=0;
	
	static double n1;
	static double av1;
	static double sum1=0;

	
	
	public static int average(int[] k)
	{
		System.out.println("Sum: "+sum);
		av = (int) sum / n;
		return av;
	}
	
	public static double average(double[] s)
	{
		System.out.println("Sum: "+sum);
		av1 = (double) sum1 / n1;
		return av1;
	}

	public static void main(String[] args) {
		int num[]=new int [10];
		int i, len=num.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Element:");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enetr Element:");
			num[i]=sc.nextInt();
		}
		
		for( i=0;i<len;i++)
		{
			sum=sum+num[i];
		}
			
			
			int ans=average(num);
			System.out.println("Sum: "+ans);
			
			System.out.println("--------------------------------------------------");
			
			double ans2=average(num);
			System.out.println("Sum: "+ans2);
	}

}
