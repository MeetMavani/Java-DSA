// Brute-Force: We are selecting every possible subarray using two nested loops and for each of them,
//              we add all its elements using another loop.

// Better: Solved Below

// Optimal: Kadane's Algorithm :


public class MaximumSubArraySum {

    public static int MaxSubArraySum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j]; 
                max = Math.max(max, sum);
            }
        }
        return max;
    } 

    public static int kadanesAlgo(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;    
            } 
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        // System.out.println(MaxSubArraySum(arr));
        System.out.println(kadanesAlgo(arr));
    }
}