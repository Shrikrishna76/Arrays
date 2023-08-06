package com.assignment1;
//37.	 Accept number from user and add table of number in array and display 
import java.util.Scanner;

public class TabelArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Assuming we want the table up to 10, you can change the limit if needed
        int tableLimit = 10;
        
        // Create an array to store the table values
        int[] tableArray = new int[tableLimit];
        
        
        for (int i = 1; i <= tableLimit; i++) {
            tableArray[i - 1] = number * i;
        }
        
        // Display the array elements (table values)
        System.out.println("Table of " + number + ":");
        for (int i = 0; i < tableArray.length; i++)
        {
            System.out.println(number + " x " + (i + 1) + " = " + tableArray[i]);
        }
        
        sc.close();
    }
}
