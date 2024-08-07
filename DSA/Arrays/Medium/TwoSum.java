// Brute-Force: Taking two for loops, i goes 0 < n and j goes i+1 to n which makes it take Tc of lesser then n*n,
//              comparing the addition of ith and jth element of the array with the sum and returning indices if the addition matches,
//              so SC = O(1) and TC = O(n*n)
// optimal: HashMap(it is the optimal approach if we have to return the indices) 
//         TC = O(nlogn) and O(n) if used unordered map and in worst case of unordered map it can go till o(n*n), SC = O(n)
// optimal: This is optimal approach only if we have to return yes or no otherwise the last one is optimal
//          so we use two pointer greedy approach here firstly, we sort the array and then using the two pointers,
//          set at indexes 0 and n-1 we check if the elems on the two pointers add up the required sum or not and based on the 
//          whether the sum is < or > the target based on which we increase or decrease the pointers 


import java.util.HashMap;
import java.util.Map;
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }

            // Otherwise, add the current element and its index to the map
            map.put(nums[i], i);
        }

        // Throw an exception if no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 23;

        try{
            // Call the twoSum method and handle the potential exception
            int[] result = twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            // Handle the exception, e.g., by printing an error message
            System.out.println(e.getMessage());
        }

       
        
    }
}
