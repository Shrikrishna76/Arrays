package com.assignment1;

import java.util.Scanner;
//6.WAP to take array and print prime numbers
public class PrimeNumber {
			public static void prime(int a[])
			{
				
				for(int i=0;i<a.length;i++)
				{
					boolean isprime=true;
					for(int j=2;j<a[i];j++)
					{
						if(a[i]%j==0)
						{
							
							isprime=false;
							break;
						}
						
					}
					if(isprime)
					{
						System.out.print(a[i]+" ");
					}
				}
			}
	

	public static void main(String[] args) {
		int num[]= {12,3,5,6,8,7,9,11,90,65,44};
		
		prime(num);
	}

}
