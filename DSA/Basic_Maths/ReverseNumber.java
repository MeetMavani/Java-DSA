// Optimal Approach: 
// Step 1: Initialise an integer revNum to 0. This variable will store the reversed number.
// Step 2: Using a while loop we iterate while n is greater than 0 and at each iteration:
//         Calculate the last digit of the number using the modulus operator (N%10) and store it in a variable last digit.
//         Update the reversed number by multiplying it with 10 and adding the last digit. This effectively appends the last digit to the end of the reversed number.
//         Remove the last digit of the number by dividing it by 10.
// Step 3: After exiting the while loop, return the reversed number.

public class ReverseNumber {
    
    public static void Reverse(int n) {
        
        int revNum = 0;
        // Start a while loop to reverse the
        // digits of the input integer.
        while(n > 0){
            // Extract the last digit of
            // 'n' and store it in 'ld'.
            int ld = n % 10;
            // Multiply the current reverse number
            // by 10 and add the last digit.
            revNum = (revNum * 10) + ld;
            // Remove the last digit from 'n'.
            n = n / 10;
        }
        // Print the reversed number.
        System.out.println(revNum);
    }
                            
                        

    public static void main(String[] args) {
        int n = 123456;
    }
}
