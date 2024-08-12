// Brute-Force: Sort using sorting algorithms i.e merge/quick sort which takes TC of O(nlogn) and SC of (n for temp array in merge sort) 
// Better: Firstly, iterate thru the array find the nos of 0's 1's and 2's using three count variables, then either use three loops
//         or one with conditions to place the 0,1,2's to there appropriate positions(Both ways take TC of O(n)),
//         overall TC = O(2n) and SC(1)
// Optimal: We will be using the Dutch National Flag Algorithm,
//          so what we do here is use three pointers low, mid and high set at 0, 0 and n-1,
//          there are three rules 1: index 0 to low - 1 everything is filled up with 0's
//                                2: index low to mid - 1 everything is filled with 1's
//                                index mid to high - 1 everything is filled with random numbers(unsorted)
//                                3: index high to n - 1 everything is filled with 2's 
//          so we can say that from area covered in rule 1, 2 and 3 is sorted the only middle part (from mid to high - 1) is unsorted,
//          which we are gonna deal with these three easy conditions,
//                                1: If mid == 0 swap low and mid and increment both
//                                2: If mid == 1 increment mid
//                                3: If mid == 2 swap mid and high but increment only high as high may be containing 0    
//          so the TC is O(n) and SC is O(1)                     

import java.util.Arrays;

public class SortArrayOf0s1s2s {
    
    public static void sort (int[] nums, int n) {
        int low = 0; 
        int mid = 0; 
        int high = n-1;
        int temp;
        while(mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        int n = arr.length;
        sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
