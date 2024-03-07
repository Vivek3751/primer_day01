/*4. Write a program to check if a given string is a Palindrome.
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.
*/

import java.util.Scanner;

public class p4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calling the function to check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);

        // Displaying the result
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }

    private static boolean checkPalindrome(String str) {
        // Removing spaces and converting the string to lowercase for case-insensitive comparison
        String cleanedString = str.replaceAll("\\s", "").toLowerCase();

        int length = cleanedString.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
