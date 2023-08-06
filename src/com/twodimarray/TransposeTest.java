package com.twodimarray;

public class TransposeTest {

	public static void main(String[] args) {
		int m1[][]= {{1,2},{3,4}};
		int i,j;
		int t[][]=new int[2][2];
		System.out.println("--------------origanal--------");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(m1[i][j]+"  ");
			}
			
			System.out.println();
		}
		
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				t[j][i]=m1[i][j];
				
			}
			
		}
		
		System.out.println("--------------Transpose----------");
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(t[i][j]+"  ");
			}
			
			System.out.println();
		}
	}

}
