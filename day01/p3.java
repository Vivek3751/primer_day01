/*3. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/

class p3{
public static void main(String args[]){
        // Step 1: Add 8 to the number 2345
        int originalNumber = 2345;
        int step1Result = originalNumber + 8;

        // Step 2: Divide the result by 3
        int step2Result = step1Result / 3;

        // Step 3: Take the modulus with 5
        int step3Result = step2Result % 5;

        // Step 4: Multiply the result by 5
        int finalResult = step3Result * 5;

        // Display the final result
        System.out.println("The final result is: " + finalResult);
    }
}


