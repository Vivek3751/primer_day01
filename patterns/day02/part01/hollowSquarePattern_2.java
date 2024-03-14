import java.util.Scanner;

public class hollowSquarePattern_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the side length of the hollow square: ");
        int sideLength = scanner.nextInt();


        for (int i = 1; i <= sideLength; i++) {
         
            for (int j = 0; j < 3; j++) {
               
                for (int k = 1; k <= sideLength; k++) {
                    
                    if (i == 1 || i == sideLength || k == 1 || k == sideLength) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

               
               /*if we want space between squares write this code
		    if (j < 2) {
                    System.out.print("  ");
                } */
            }
            System.out.println();
        }
        scanner.close();
    }
}