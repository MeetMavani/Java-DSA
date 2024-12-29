// A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

// Brute-Force Approach: We can iterate through numbers from 1 to n, 
//                       counting how many of these numbers divide n without a remainder. 
//                       If exactly two numbers do, so n is prime otherwise it is not prime.

// Optimal Approach: We can optimise the algorithm by only iterating up to the square root of n when checking for factors. 
//                   This is because if n has a factor greater than its square root,
//                   it must also have a factor smaller than its square root.

                                
public class CheckForPrime {
 
    static boolean bruteForce(int n) {
        
        int cnt = 0;
        // Loop through numbers from 1 to n.
        for (int i = 1; i <= n; i++) {
            // If n is divisible by i
            // without any remainder.
            if (n % i == 0) {
                // Increment the counter.
                cnt = cnt + 1;
            }
        }

        // If the number of
        // factors is exactly 2
        if (cnt == 2) {
            // Return true, indicating
            // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else {
            // Return false, indicating
            // that the number is not prime.
            return false;
        }
    }


    static boolean optimal(int n){ 
        int cnt = 0;

        // Loop through numbers from 1
        // to the square root of n.
        for(int i = 1; i <= Math.sqrt(n); i++){ 

            // If n is divisible by i
            // without any remainder.
            if(n % i == 0){ 

                // Increment the counter.
                cnt = cnt + 1;

                // If n is not a perfect square,
                // count its reciprocal factor.
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }

        // If the number of
        // factors is exactly 2.
        if(cnt == 2){
             // Return true, indicating
             // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else{ 
            // Return false, indicating
            // that the number is not prime.
            return false; 
        }
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = bruteForce(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
                                
                            