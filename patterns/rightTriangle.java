/*The right triangle star pattern is also the same as the left triangle star pattern but it has a shape of a triangle with its perpendicular line at the right side.*/
import  java.util.Scanner;
public class rightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = n; j>=1 ; j--) {
                if (j>i)
                    System.out.print(" ");
                else
                    System.out.print("*");

            }
            System.out.println();

        }
    }
}