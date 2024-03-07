/*7. Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.*/

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String oldSubstring = scanner.nextLine();

        System.out.print("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        // Calling the function to replace the substring
        String resultSentence = replaceSubstring(sentence, oldSubstring, newSubstring);

        // Displaying the result
        System.out.println("Modified sentence: " + resultSentence);
    }

    private static String replaceSubstring(String sentence, String oldSubstring, String newSubstring) {
        // Using replace method to replace oldSubstring with newSubstring
        return sentence.replace(oldSubstring, newSubstring);
    }
}
