package com.twodimarray;

import java.util.Scanner;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int m1[][]=new int[3][3];
		int m2[][]=new int[3][3];
		int sum[][]=new int[3][3];
		int i,j,rows,cols;
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter No of Rows: ");
		rows=sc.nextInt();
		
		System.out.println("Enter No of Column: ");
		cols=sc.nextInt();
		
		System.out.println("Enter Element Of 2D Array: ");
		
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.println("Enter Element for m1["+i+"]["+j+"]");
				m1[i][j]=sc.nextInt();
				
				System.out.println("Enter Element for m2["+i+"]["+j+"]");
				m2[i][j]=sc.nextInt();
				sum[i][j]=m1[i][j]+m2[i][j];
			}
		}
		
System.out.println("------------2D Array Addition-------------");
		
		for(i=0;i<rows;i++)   
		{
			for(j=0;j<cols;j++)                                        
			{
				System.out.print(sum[i][j]+"  ");
			}
			
			System.out.println();
		}

	}

}
