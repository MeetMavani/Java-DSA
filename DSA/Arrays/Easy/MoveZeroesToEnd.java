// Brute-Force Approach: It requires three steps 1: For loop thru the array and pick out the non zeroes and put them in temp arr
//                                               2: pick up everythinh from the temp and put it in the front of the original arr
//                                               3: and finally for loop from i = temp.len on the arr till n-1 and place 0's  
// Therefor,
// it takes TC of O(n) + O(x) + O(n-x) = O(2n) and extra space of O(x) and O(n) for worst case

// Optimal Approach: It requires two steps 1: For loop for finding the starting index for j(which is to find index for first zero)
//                                         2: For loop for using two pointers i & j for swapping the zeroes with values > 0's   
// TC is O(x) + O(n-x) = O(n) and SC of O(1) as we are updating the given arr                                               
// the solution is given below

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        
        int[] nums = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = nums.length;
        shift(nums, n);
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int a , int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void shift(int[] nums, int n) {
        int j = -1;
        for(int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        
        for (int i = j + 1; i < n; i++) {
            if (nums[i] > 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }
}
