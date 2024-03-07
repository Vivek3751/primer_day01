/*2. Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.
*/

import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Process the full name and display the abbreviations
        String[] nameParts = fullName.split(" ");

        if (nameParts.length >= 2) {
            // Abbreviate the first and middle names
            String abbreviatedFirstName = nameParts[0].substring(0, 1) + ".";
            String abbreviatedMiddleName = nameParts[1].substring(0, 1) + ".";

            // Display the result
            System.out.println("Abbreviated Name: " + abbreviatedFirstName + abbreviatedMiddleName + nameParts[nameParts.length - 1]);
        } else {
            // Display an error message if the input is not in the expected format
            System.out.println("Please enter a valid full name with at least a first and last name.");
        }
    }
}
