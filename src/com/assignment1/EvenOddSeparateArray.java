package com.assignment1;

public class EvenOddSeparateArray {
	public static void EvenOddArray(int arr[])
	{
		//int newEven[],newOdd[];
		int i,len=arr.length;
		int ieven=0, iodd=0;
		
		int newEven[]=new int[arr.length];
		int newOdd[]=new int[arr.length];
		
		for(i=0;i<len;i++)
		{
			if(arr[i]%2==0)
			{
				newEven[ieven]=arr[i];
				ieven++;
			}
			else
			{
				newOdd[iodd]=arr[i];
				iodd++;
			}
		}
		
		System.out.println("Printing Array Of  Even Number");
		for(i=0;i<ieven;i++)
		{
			System.out.println(newEven[i]+" ");
		}
		
		System.out.println("Printing Array Of  Odd Number");
		for(i=0;i<iodd;i++)
		{
			System.out.println(newOdd[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int num[]= {23,45,76,89,56,43,100};
		EvenOddArray(num);
		
	}

}
