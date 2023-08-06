package com.assignment2;
//. WAP to print maximum in columns. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}} output is: 34, 42, and 16

public class MaxInColumns {
	public static void maxValue(int a[][])
	{
	int cols = a.length;
    int rows = a.length;

    int[] maxInColumns = new int[cols];

 
    // Find the maximum in each column
    for (int j = 0; j < cols; j++) {
        for (int i = 0; i < rows; i++) {
            if (a[j][i] > maxInColumns[i]) {
                maxInColumns[i] = a[j][i];
            }
        }
    }

    // Print the maximum value in each column
    for (int i = 0; i < rows; i++) {
        System.out.print(maxInColumns[i]);
        if (i < rows - 1) {
            System.out.print(", ");
        }
    }
}
	public static void main(String[] args) {
        int[][] arr = {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
        maxValue(arr);
    }

}
