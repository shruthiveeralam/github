package javaBasics;

import java.util.Scanner;
/**
 * Java program that accepts a character and determines if it's a number between
 * 0 - 9 or lower case letter.
 *
 * @author Nyanjui
 */
public class CheckNumberOrLowerCase
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a character and I'll tell you if it's "
                + "either a number or lower case letter.");
        char character = userInput.next().charAt(0);
        if (character >= '0' && character <= '9')
        {
            System.out.printf("%c is a number\n", character);
        } else if (character >= 'a' && character <= 'z')
        {
            System.out.printf("%c is a lowercase letter\n", character);
        } else
        {
            System.out.printf("%c is a neither number nor a lower case letter.\n",
                    character);
        }
    }
}

