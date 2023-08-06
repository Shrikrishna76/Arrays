package com.assignment1;
//31.	 WAP to check if an array of integers contains two specified elements 65 and 77. 
public class FoundElement {

	public static void main(String[] args) {
        int[] arr = {34, 12, 65, 98, 77, 55};
        int num1 = 65;
        int num2 = 77;

        boolean foundNum1 = false;
        boolean foundNum2 = false;

        for (int num : arr) 
        {
            if (num == num1) 
            {
                foundNum1 = true;
            } else if (num == num2)
            {
                foundNum2 = true;
            }

           
        }

        if (foundNum1 && foundNum2) 
        {
            System.out.println("The array contains both " + num1 + " and " + num2);
        }
        else
        {
            System.out.println("The array does not contain both " + num1 + " and " + num2);
        }
    }


	

}
