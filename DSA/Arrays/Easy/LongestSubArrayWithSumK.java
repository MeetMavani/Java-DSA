// Brute-Force approach: TC of O(n*n) and SC of O(1)

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

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        int ans = positive(nums, k);
        System.out.println("The size of longest sub-array with sum k is: " + ans);
    }

}
