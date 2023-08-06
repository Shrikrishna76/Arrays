package com.arrayassignmentinclass;

public class CreateArray {
	public static void findEvenNum(int a[])
	{
		int i,len=a.length;
		int sum=0,sum1=0;
		
		for(i=0;i<len;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
				
			}
			
			if(i%2!=0)
			{
				sum1=sum1+i;
			}
			
		}
		System.out.println("Sum Of Even Number: "+sum);
		System.out.println("Sum Of Even Position Number: "+sum1);
		
	}
		

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even Number From Array:");
		findEvenNum(num);

	}

}
