package com.twodimarray;



public class Array2D {
	
	public static void PrintfirstElementOfColumn(int a[][])
	{
		int i,j;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				
					System.out.println(a[j][i]);
					
			}
			System.out.println("-----------------------");
		}	
		
	
	}
	
	public static void printMinInColumn(int a[][])
	{
		 int colum = a.length;
	     int columns = a[0].length;
	     int i,j;
	     
	     int[] minimumInColumns = new int[columns];

	        
	        for ( j = 0; j < columns; j++) 
	        {
	            int min = a[0][j];
	            for ( i = 1; i < colum; i++)
	            {
	                if (a[i][j] < min) 
	                {
	                    min = a[i][j];
	                }
	            }
	            minimumInColumns[j] = min;
	        }

	        
	        for ( i = 0; i < columns; i++) 
	        {
	            System.out.print(minimumInColumns[i]);
	            if (i < columns - 1)
	            {
	                System.out.print(", ");
	            }
	        }
	}
	
	public static void main(String[] args) {
		
		
		int a[][]= {{2,46,5},{8,9,7}};
		
		PrintfirstElementOfColumn(a);
		printMinInColumn(a);

		
		
		
	}

}
