package com.classwork;

public class MergeWithoutSame {
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
		
		int arr1[]= {1,3,4,5,6};
		int arr2[]= {3,2,4,6,8};
		
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
