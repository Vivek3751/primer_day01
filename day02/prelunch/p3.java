/* 3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/

import java.util.Scanner;

public class p3{
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();

        // Prompt the user to enter the number of classes attended
        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Calculate the percentage of classes attended
        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        // Display the percentage of classes attended
        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        // Check if the student is allowed to sit in the exam
        if (attendancePercentage >= 75) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            // Prompt the user to enter if there is a medical cause
            System.out.print("Do you have a medical cause? (Enter 'Y' for Yes, 'N' for No): ");
            Scanner medicalScanner = new Scanner(System.in);
            char hasMedicalCause = medicalScanner.next().charAt(0);

            // Check if the student has a medical cause
            if (hasMedicalCause == 'Y' || hasMedicalCause == 'y') {
                System.out.println("The student is allowed to sit in the exam due to a medical cause.");
            } else {
                System.out.println("The student is not allowed to sit in the exam.");
            }

            // Close the medicalScanner
            medicalScanner.close();
        }
    }
}
