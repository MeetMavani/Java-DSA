// The GCD of two numbers is the largest number that divides both of them without leaving a remainder.

// Brute-Force: Step 1: We iterate through all numbers from 1 up to the minimum of the two input numbers,
//                      checking if each number is a common factor of both input numbers.
//              Step 2: If a number is a common factor, we update our gcd variable to that number.

// Optimal: The Euclidean Algorithm is a method for finding the greatest common divisor of two numbers.
//          To find the GCD,
//          Repeatedly subtract/Mod the smaller number from the larger number until one of them becomes 0.
//          Once one of them becomes 0, the other number is the GCD of the original numbers.


public class GCD_or_HCF {
    
    public static int bruteForce(int N1, int N2) {
        int gcd = 0;
        int iterator;

        if (N1 > N2) {
            iterator = N2;
        } else {
            iterator = N1;
        }

        for (int i = 2; i <= iterator; i++) {
            if (N1%i == 0 && N2%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int Optimal(int a, int b) {
        // Continue loop as long as both
        // a and b are greater than 0
        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
    }
                                                 
    public static void main(String[] args) {

        int n1 = 20, n2 = 15;

        System.out.println(bruteForce(n1, n2));

        int gcd = Optimal(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
