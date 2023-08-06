package com.assignment1;
//16.WAP to count frequency of each element in an array.
public class FrequancyArray {
	public static void findfeqofElement(int a[])
	{
		int i,j,len=a.length;
		int count;
		
		for(i=0;i<len;i++)
		{
			count=1;
			if(a[i]==-1)
			continue;
			for(j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}
			System.out.println(a[i]+ " = "+count);
		}
	}

	public static void main(String[] args) {
		int num[]= {12,43,34,45,12,34,66,78,45,45,45,45,67,89,87};
		findfeqofElement(num);
	}

}
