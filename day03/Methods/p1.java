/*1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
*/

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calling the methods to find and print the maximum and minimum numbers
        printMaximumNumber(num1, num2, num3);
        printMinimumNumber(num1, num2, num3);
    }

    private static void printMaximumNumber(double num1, double num2, double num3) {
        double maxNumber = num1;
        if (num2 > maxNumber) {
            maxNumber = num2;
        }
        if (num3 > maxNumber) {
            maxNumber = num3;
        }
        System.out.println("Maximum number: " + maxNumber);
    }

    private static void printMinimumNumber(double num1, double num2, double num3) {
        double minNumber = num1;
        if (num2 < minNumber) {
            minNumber = num2;
        }
        if (num3 < minNumber) {
            minNumber = num3;
        }
        System.out.println("Minimum number: " + minNumber);
    }
}
