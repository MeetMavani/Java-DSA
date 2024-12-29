// Optimal Approach: 
// Step 1: We use the algorithm created in reverse number to calculte the reverse of origial number.
// Step 2: We Simply compare the original number with reversed number to check if it is palindome or not.


public class Palindrome {

    public static void main(String[] args) {
        int num = 1211212;
        int n = num;

        int revnum = 0;

        while (n > 0) {
            int ld = n % 10;
            revnum = (revnum * 10) + ld;
            n = n / 10;
        }
        
        if (num == revnum) {
            System.out.println("The number is palindome number");
        } else {
            System.out.println("The number is not a palindome number");
        }

    }
}