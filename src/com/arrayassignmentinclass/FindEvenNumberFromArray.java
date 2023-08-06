package com.arrayassignmentinclass;

public class FindEvenNumberFromArray {
	
	public static void findEvenNum(int a[])
	{
		int i,len=a.length;
		
//		for(i=0;i<len;i++)
//		{
//			if(a[i]%2==0)
//			{
//				System.out.println(a[i]);
//			}
//		}
		
		for(int q:a)
		{
			if(q%2==0)
			{
			System.out.println(q);
			}
		}
	}

	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even Number From Array:");
		findEvenNum(num);

	}

}
