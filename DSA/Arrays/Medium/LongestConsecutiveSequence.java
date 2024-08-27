// Brute-force: Using two nested loops we will store the ith element in variable x and check whether x + 1 exists in the array or not,
//              for checking it we will be using simple linear search, if x + 1 exists we will append x and count and keep on going
//              until we dont find any further sequence and as the sequence ends as well as the while loop we will keep track of the
//              longest sequence using the longest variable.
// TC = O(n*n) and SC (1)

// Better: Step 1: We will sort the array
//         step 2: We will consider 3 variables, ‘lastSmaller’ →(to store the last included element of the current sequence), 
//                ‘cnt’ → (to store the length of the current sequence), ‘longest’ → (to store the maximum length).
//         step 3: create an for loop to iterate through each element one by one then for every elem we will check 
//                 1: If arr[i]-1 == lastSmaller: The last element in our sequence is labeled as 'lastSmaller' and the current element 'arr[i]' is exactly 'lastSmaller'+1. 
//                    It indicates that 'arr[i]' is the next consecutive element. To incorporate it into the sequence,
//                    we update 'lastSmaller' with the value of 'arr[i]' and increment the length of the current sequence, denoted as 'cnt', by 1.
//                 2: If arr[i] == lastSmaller: we can skip it since we have already included it before.
//                 3: lastly if nums[i] is != lastSmaller we get to know that nums[i] > lastSmaller + 1 which indicates that nums[i] cannot
//                    be a part of current sequence so we start a new sequence by making  lastSmaller = nums[i] and make count = 1
//         step 4: Every time, inside the loop, we will compare ‘cnt’ and ‘longest’ and update ‘longest’ with the maximum value. 
//         step 5: Retunr longest
// TC = O(NlogN) + O(N) and SC = O(1)

// Optimal: We will adopt a similar approach to the brute-force method but with optimizations in the search process. 
//          Instead of searching sequences for every array element as in the brute-force approach, 
//          we will focus solely on finding sequences only for those numbers that can be the starting numbers of the sequences.
//          Steps 1: first we put all the data in the set data structure 
//                2: then we iterate through the set adn check whether the current number(x) is the starting number of the seqenece or 
//                   not.   
//                3: If x - 1 does not exist then then x is the staring number of the sequence so we will start findint the 
//                   consecutive elemnets.
//                   If x - 1 exits, This means x cannot be a starting number and we will move on to the next element in the set.
//                4: Instead of linear search we wll set data structure itself to search for the elements x+1, x+2, x+3, and so on.  
// TC = O(N) + O(2*N) ~ O(3*N) and SC = O(N)    


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static boolean LinearSearch(int[] nums, int x) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static int BruteForce(int[] nums) {
        int longest = 1;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int x = nums[i];

            while(LinearSearch(nums, x + 1) == true) {
                x += 1;
                count += 1;
            }

            longest = Math.max(longest, count);
        }
        return longest;
    }


    public static int Better(int[] nums) {
        Arrays.sort(nums);      // {1, 1, 1, 2, 3, 4, 100, 101, 102}

        int longest = 1;
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == lastSmaller) {
                lastSmaller = nums[i];
                count += 1;
            }
            else if(nums[i] != lastSmaller) {
                lastSmaller = nums[i];
                count = 1;
            }

            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static int Optimal(int[] nums) {
        int n = nums.length;
        if (nums.length == 0) {
            return 0;
        }

        int longest = 0;
        Set<Integer> set = new HashSet<>();
        
        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        // Find the longest sequence
        for(int i : set) {
            // if 'it' is a starting number
            if (!set.contains(i - 1)) {       
                // find consecutive numbers     
                int count = 1;
                int x = i;

                while (set.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }

                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        // System.out.println(BruteForce(arr));
        // System.out.println(Better(arr));
        System.out.println(Optimal(arr));
    }
    
}