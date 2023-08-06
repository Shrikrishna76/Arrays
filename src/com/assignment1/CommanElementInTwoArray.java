package com.assignment1;
/*
 * Write a Java program to find the common elements between two arrays (int values) Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and 
 * arr2[] = [39, 25, 15, 23, 55, 91, 66, 22], so common between two arrays are 23 and 91
 */


import java.util.ArrayList;

import java.util.List;


public class CommanElementInTwoArray {

	public static void main(String[] args) {
	      int[] arr1 = {12, 23, 34, 67 ,78, 91, 56};
	      int[] arr2 = {39, 25, 15, 23, 55, 91, 66, 22};
	      List<Integer> commonElements = new ArrayList<>();
	      for (int i = 0; i < arr1.length; i++) {
	         for (int j = 0; j < arr2.length; j++) {
	            if (arr1[i] == arr2[j]) {
	               commonElements.add(arr1[i]);
	               break;
	            }
	         }
	      }
	      System.out.println("Common Elements: " + commonElements);
	   }
	
}