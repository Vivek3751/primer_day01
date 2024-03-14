//Right Down Triangle

import  java.util.Scanner;
public class rightDownTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                // Printing Spaces
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                // Printing stars
                System.out.print("* ");
            }

            System.out.println();
        }

        }
    }