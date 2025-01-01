// Optimal Approach: 
// Step 1: Initialise an integer revNum to 0. This variable will store the reversed number.
// Step 2: Using a while loop we iterate while n is greater than 0 and at each iteration:
//         Extract the last digit of the number using the modulus operator (N%10) and store it in a variable last digit.
//         Update the reversed number by multiplying it with 10 and adding the last digit. This effectively appends the last digit to the end of the reversed number.
//         Remove the last digit of the number by dividing it by 10.
// Step 3: After exiting the while loop, return the reversed number.

public class ReverseNumber {
    
    public static void Reverse(int n) {
        
        int revNum = 0;

        while(n > 0){
            
            int ld = n % 10;
    
            revNum = (revNum * 10) + ld;
            
            n = n / 10;
        }
        // Print the reversed number.
        System.out.println(revNum);
    }
                            
                        

    public static void main(String[] args) {
        int n = 123456;
        Reverse(n);
    }
}
