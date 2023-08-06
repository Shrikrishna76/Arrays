package com.assignment1;
//WAP to print all unique elements in the array.
public class UniqueElementInArray {
	  public static void main (String[] args)    
	    {   
	        //create an integer array having some duplicate elements   
	        int arr[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
	          
	        //calculate length of the arrayWithDuplicates array   
	        int len = arr.length;   
	          
	        //create an integer array to store new elements   
	        int[] newArray = new int[20];  
	          
	        //integer variable to increment array index  
	        int index = 0;  
	          
	        // outermost loop to take element one by one from the leftmost side  
	        for (int i = 0; i < len; i++)   
	        {   
	            int flag = 0;  
	            //innermost loop to make comparision between elemnts and skip duplicate elements  
	            for (int j = 0; j < i; j++){  
	                if (arr[i] == arr[j]){   
	                    flag = 1;  
	                    break;   
	                }  
	            }  
	            //store or print the element if it is not present in the newArray  
	            if (flag == 0){   
	                newArray[index] = arr[i];  
	                index++;    //increment index value  
	            }  
	        }  
	        //print newArray   
	        for(int i = 0; i < index; i++)  {
	            System.out.print( newArray[i] + " ");
	        }
	        }
}
