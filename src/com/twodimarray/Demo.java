package com.twodimarray;

public class Demo {

	public static void main(String[] args) {
		
		int arr[][]=new int[2][2];
		
		System.out.println("Before Inserting Value in Array");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);

		
		arr[0][0]=12;
		arr[0][1]=34;
		arr[1][0]=56;
		arr[1][1]=78;
		
		System.out.println();
		System.out.println("After Inserting Value in Array");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println();
		
		System.out.println("Using For loop");
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Using For loop with formating");
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("element at: ["+i+"]"+"["+j+"]"+"="+arr[i][j]);
			}
			
			
		}
		
		

	}

}
