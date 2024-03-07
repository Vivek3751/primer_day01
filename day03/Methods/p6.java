/*6. Define a method named 'perfect' that determines if parameter number is a perfect number. Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.
[An integer number is said to be "perfect number" if its factors, including 1(but not the number itself), sum to the number. E.g., 6 is a perfect number because 6=1+2+3].
 */
public class p6{
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");

        // Iterate through numbers from 1 to 1000 and check if they are perfect
        for (int i = 1; i <= 1000; i++) {
            if (perfect(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is a perfect number
    private static boolean perfect(int number) {
        int sum = 1; // Initialize sum with 1 (since 1 is always a factor)

        // Find factors and add them to sum
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        // Check if the sum of factors is equal to the number
        return sum == number;
    }
}
