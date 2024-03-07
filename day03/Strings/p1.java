/*1. Write a program to check if the letter 'e' is present in the word 'Umbrella'.*/

public class p1 {
    public static void main(String[] args) {
        // Define the word
        String word = "Umbrella";

        // Check if the letter 'e' is present
        boolean isPresent = false;	
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                isPresent = true;
                break;
            }
        }

        // Display the result
        if (isPresent) {
            System.out.println("The letter 'e' is present in the word.");
        } else {
            System.out.println("The letter 'e' is not present in the word.");
        }
    }
}
