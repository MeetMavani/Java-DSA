// Brute-Force approach: Using division operator
//                       Step 1: Create an count variable for counting the number of digits in the integer.
//                       Step 2: While n(given nteger) is > 0 we increment counter and divide by 10.

// Optimal approach: - Using logarithmic base 10 of positive integer log 10(n).
//                   - Formula: Digits = [log10(n) + 1].
//                   - Why log10(n) works? :  
//                     The logarithm base 10 of a number log10(n) gives the order of magnitude of 𝑛.
//                     This means it tells you the largest power of 10 that is less than or equal to n
//                   - Adding 1:
//                     Since log10(n) gives the highest power of 10, 
//                     adding 1 gives the total number of digits     
//                   - Example:
//                     For n = 329823: log10(329823) = 5.518
//                     The integer part (5) indicates that 10^5 is the largest power of 10 less than 329823
//                     This implies n has 6 digits. Therefore adding 1 gives the total number of digits
//                   - The logarithmic operation returns a double(a decimal value), 
//                     so we cast it to an integer using (int) to round down to the nearest whole number.
//                   - The program does not currently account for negative integers.
//                   - Adding Math.abs(n) would fix this.

class CountDigits {

    public static int brute(int n) {
        int count = 0;

        while (n > 0) {
            count ++;
            n = n / 10;
        }

        return count;
    }

    public static int optimal(int n) {
//      Special case for 0
        if (n == 0) return 1; 

        return (int) (Math.log10(Math.abs(n)) + 1);
    }

    public static void main(String[] args) {
        int n = 1234568;
        System.out.println(brute(n));
        System.out.println(optimal(n));
    }
}
