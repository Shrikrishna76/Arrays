package com.assignment1;
//34.	WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’. 
public class MaxCharacterFound {

public static char findMaxCharacter(char[] arr) {
		
        char maxChar = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > maxChar)
            {
                maxChar = arr[i];
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        char[] arr = {'y', 'D', 'E', 'x', 'w', 'R'};
        char maxChar = findMaxCharacter(arr);
        System.out.println("The maximum character is: " + maxChar);
    }

}
