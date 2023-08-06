package com.assignment1;

public class LowestAlphabhet
{
	public static char findMinCharacter(char[] arr) 
	{
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

public static void main(String[] args)
{
    char[] ch = {'y', 'c', 'k', 'x', 'd', 'a'};
    char minChar = findMinCharacter(ch);
    System.out.println("The smallest character is: " + minChar);
}




}
