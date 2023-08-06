package com.arrayassignmentinclass;

public class ReplaceZero {
	
	public static void replace(int a[])
	{
		int i,len=a.length;
		for(i=0;i<len;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int num[]= {78,2,55,0,8,42,79,0,0,69,56};
		replace(num);
		
		
				

	}

}
