package com.twodimarray;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int tab[][]=new int[3][3];
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
				System.out.println("Enter Element for tab["+i+"]["+j+"]");
				tab[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("------------2D Array-------------");
		
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.print(tab[i][j]+"  ");
			}
			
			System.out.println();
		}

	}

}
