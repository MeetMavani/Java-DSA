// Brute-Force approach: (The positive function) it takes TC of O(n*n) and SC of O(1)
// Optimal: It is the optimal approach only if the array contains 0's and positives,
//          It takes TC of O(2n), why? you must be telling there are two while loops, 
//          so the reason for 2n is that the second while loop never iterates to n times for every iteration of outer while loop 
//          instead it maximum iterates to n times so, TC is calculated as O(n)for outer while loop + O(n) for inner while loop = O(2n)
// Negative: If the array contains negatives too then negative func is the optimal one

public class LongestSubArrayWithSumK {

    public static int positive(int[] nums, int k) {
        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                } else if (sum > k) {
                    break;
                }
            }
        }

        return max;
    }

    public static int optimal(int[] nums, int k) {
        int left = 0; int right = 0;
        int maxlen = 0;
        long sum = nums[0]; 
        int n = nums.length;

        while (right < n) {
            while (sum > k && left <= right) {
                sum = sum - nums[left];
                left++;
            }

            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            
            right++;
            if (right < n) {
                sum += nums[right]; 
            }
        }

        return maxlen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};  //10
        int k = 4;
        // int ans = positive(nums, k);
        // System.out.println("The size of longest sub-array with sum k is: " + ans);
        System.out.println(optimal(nums, k));
    }

}
