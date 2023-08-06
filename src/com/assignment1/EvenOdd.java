package com.assignment1;
//3.WAP to take array and find even and odd numbers
public class EvenOdd {
	public static void findEvenAndOddNumber(int a[])
	{
		
		for(int q:a)
		{
			if(q%2==0)
			{
			System.out.println("Even Number: "+q);
			}
		}
		System.out.println("------------------------------------------");
		for(int q:a)
		{
			if(q%2!=0)
			{
				System.out.println("Odd Number: "+q);
			}
		}
	}
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even Number From Array:");
		findEvenAndOddNumber(num);

	}

}
