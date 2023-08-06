package com.assignment1;

import java.util.ArrayList;
import java.util.List;

//WAP to display all square number in array. Means e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9.
public class SquareElementInArray 
{
	public static void main(String[] args)
	{
		  int[] arr = {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};

	        List<Integer> squareNumbers = new ArrayList<>();

	        for (int num : arr) 
	        {
	            int squareRoot = (int) Math.sqrt(num);
	            if (squareRoot * squareRoot == num)
	            {
	                squareNumbers.add(num);
	            }
	        }

	        System.out.println("Square numbers in the array: " + squareNumbers);
	    }
	

}
