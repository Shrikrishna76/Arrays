package com.assignment1;
//17.WAP to merge 2 arrays to 3rd array. 3rd array should not have elements of same value.

public class MergeArray {
	public static int[] mergeTwoArray(int arr1[], int arr2[])
	{
			int i, j ,k, len1 = arr1.length;
			int len2 = arr2.length;
			int len3 = len1 + len2;
			int arr3[] = new int[len3];
			int index = 0;
			boolean status = false;
			for (k = 0; k < len1; k++) {
				
				arr3[k] = arr1[k];
				index++;
			}
			for (i = 0; i < len2; i++)
			{
				status = false;
				for (j = 0; j < index; j++) 
				{
					if (arr2[i] == arr3[j]) 
					{
						status = true;
					}
				}
				if (status)
					continue;
				else 
				{
					arr3[index++] = arr2[i];
				}
			}
			return arr3;
		
	}

	public static void main(String[] args) {
		
		int arr1[]= {23,67,89,40,50};
		int arr2[]= {40,50,45,90,75};
		
		int merge[]=mergeTwoArray(arr1, arr2);
		for(int s:merge)
		{
			if(s!=0)
			{
			System.out.print(s+" ");
			}
		}

	}

}
