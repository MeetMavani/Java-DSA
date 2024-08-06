// Brute-Force approach: TC of O(n*n) and SC of O(1)
// Better approach: TC of O(2n) and SC of O(n) 
// Optimal approach one: TC of O(n) and SC of O(1)
// Optimal approach two:

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3};
        int bn = arr.length + 1;
        // System.out.println(brute(arr, bn));

        // System.out.println(optimal_one(arr, bn));

        System.out.println(optimal_two(arr, bn));
    }

    public static int brute(int[] nums, int n) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        
        return -1;
    }


    public static int optimal_one(int[] nums, int n) {
        int total = (n*(n + 1))/2; 
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        return total - count;
    }

    public static int optimal_two(int[] nums, int n) {
        int xor1 = 0, xor2 = 0;

        // for (int i = 1; i <= n; i++) {
        //     xor1 = xor1 ^ i;
        // }
        // for (int j = 0; j < n - 1; j++) {
        //     xor2 = xor2 ^ nums[j];
        // }


        for (int i = 0; i < n - 1; i++) {
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i + 1);   
        }
        xor2 = xor2 ^ n;

        return xor1 ^ xor2;
    }
}
