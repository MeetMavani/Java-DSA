// Approach: - Basically, we store the character value in an integer which gives us the ASCII value
//             of the character.
//           - When we put character value inside an integer the typecasting occurs which converts the
//             character value into integer which is ASCII value. 
//           - And then we print the ASCII value.

import java.util.Scanner;

public class FindASCII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a single character or number:");
        char input = scanner.next().charAt(0); // Read the first character of the input

        int asciiValue = input; // Cast the character to its ASCII value

        System.out.println("The ASCII value of '" + input + "' is: " + asciiValue);

        scanner.close();

    }
}


// Additional content just for more understanding 
// For int input we can do this: 

        // int num = 7; // Numeric value
        // char numChar = (char) ('0' + num); // Convert to character
        // int asciiValue = numChar; // Get ASCII value

        // System.out.println("Numeric value: " + num);
        // System.out.println("Character representation: " + numChar);
        // System.out.println("ASCII value: " + asciiValue);

        // Ouput:
        // Numeric value: 7
        // Character representation: 7
        // ASCII value: 55

    
        // If You Just Need the ASCII Value:
        // int num = 5;
        // int asciiValue = '0' + num;
        // System.out.println("ASCII value: " + asciiValue); // Prints the ASCII value

        // If You Need the Character Representation:
        // char numChar = (char) ('0' + num);
        // System.out.println("Character representation: " + numChar);
