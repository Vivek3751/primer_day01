/*3. Write a program to find the number of vowels, consonents, digits and white space characters in a string.*/

import java.util.Scanner;

public class p3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calling the function to count characters
        countCharacters(inputString);
    }

    private static void countCharacters(String inputString) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int whiteSpaces = 0;

        // Converting the input string to lowercase for case-insensitive comparison
        String lowerCaseString = inputString.toLowerCase();

        for (int i = 0; i < lowerCaseString.length(); i++) {
            char ch = lowerCaseString.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                // Checking if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                // Checking if the character is a digit
                digits++;
            } else if (ch == ' ') {
                // Checking if the character is a white space
                whiteSpaces++;
            }
        }

        // Displaying the results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of white spaces: " + whiteSpaces);
    }
}
