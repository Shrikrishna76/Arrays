package com.assignment1;
//34.	WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’. 
public class MinCharacterFound {
	public static char findMinCharacter(char[] arr) {
		
        char minChar = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < minChar)
            {
                minChar = arr[i];
            }
        }
        return minChar;
    }

    public static void main(String[] args) {
        char[] arr = {'q', 'D', 'E', 'x', 'z', 'R'};
        char minChar = findMinCharacter(arr);
        System.out.println("The minimum character is: " + minChar);
    }

}
