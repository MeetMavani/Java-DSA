// Brute-Force approach: Takes 3 loops so it takes TC of O(d) + O(n-d) + O(d) = O(n+d) and 
//                       Extra space taken would be O(d) coz we taking and temp array to store the d elems

// Optimal Approach: Takes TC of  O(d) + O(n-d) + O(n) = O(2n) and
//                   SC of O(1) as no temp array used     

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArrayByDPlaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        scanner.close();

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;

        // Rotate(array, d, n);

        Reverse(array, 0, d - 1);
        Reverse(array, d, n - 1);
        Reverse(array, 0, n - 1);

        System.out.println(Arrays.toString(array));
    }

    // Brute-Force Approach
    public static void Rotate(int[] nums, int d, int n) {

        d = d % n;
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }

        for (int i = d; i < n; i++) {
            nums[i - d] = nums[i];
        }   

        // int j = 0;
        for (int i = n - d; i < n; i++) {
            nums[i] = temp[i -(n - d)];         // temp[j++];
        }
        
        System.out.println(Arrays.toString(nums));
    }

     // Optimal Appraoch of Reversing the array

     // Function to Reverse the array
    public static void Reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
