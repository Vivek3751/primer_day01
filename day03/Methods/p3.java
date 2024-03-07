/*3. Print the multiplication table of 15 using recursion.*/

public class p3{
    public static void main(String[] args) {
        int number = 15;

        System.out.println("Multiplication table of " + number + ":");
        printMultiplicationTable(number, 1);
    }

    private static void printMultiplicationTable(int number, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
            printMultiplicationTable(number, multiplier + 1);
        }
    }
}
