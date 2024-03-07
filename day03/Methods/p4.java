/*4. Using recursion, define a method to know nth term of a Fibonacci series.
Nth term of Fibonacci series is
F(n) = F(n-1)+(n-2)
F(0) = 0
F(1) = 1
F(2) = F(1)+(0) = 1+0 = 1
F(3) = F(2)+(1) = 1+1 = 2
F(4) = F(3)+(2) = 2+1 = 3*/

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n to find the nth term in Fibonacci series: ");
        int n = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Display the nth term of the Fibonacci series
        int result = fibonacci(n);
        System.out.println("The " + n + "th term in the Fibonacci series is: " + result);
    }

    // Recursive method to find the nth term of the Fibonacci series
    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
