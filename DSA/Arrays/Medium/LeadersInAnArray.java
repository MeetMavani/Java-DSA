// Brute-Force: TC is less than O(n*n) and SC is less than O(n) for worst case it can go till O(n) if every elem is an leader

// Optimal: If we think carefully, we only want to compare the elements on the right side. So, what if we start from the last element?
//          we take an integer varaible named max for storing the greatest elem as we traverse thru the array,
//          we will check whether the current elem is larger than the previous greatest elem(max) if yes if we update max and most
//          importantntly we add it to the ans list why?,  as we are moving from right so if we get any larger elem than previously 
//          stored it is obviously an leader so this way we get all the leaders in the ans list in one loop.
//          TC is O(n) and SC is les than O(n) worst case wll be O(n) if everyone is an leader. 
//  NOTE! we are using extra space to learn and not to solve the problem. 

import java.util.ArrayList;

public class LeadersInAnArray {
    
    public static ArrayList<Integer> BruteForce(int[] nums, int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        //Checking whether arr[i] is greater than all 
        //the elements in its right side
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {

                // If any element found is greater than current leader
                // curr element is not the leader.
                if (nums[j] > nums[i]) {
                    leader = false;
                    break;
                }
            }
            // Push all the leaders in ans array.
            if (leader) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }

    public static ArrayList<Integer> Optimal(int[] nums, int n) {

        ArrayList<Integer> ans = new ArrayList<>(); 

        int max = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {

            if (nums[i] > max) {
                max = nums[i];
                ans.add(max);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        int n = arr.length;

        //Brute-Force
        // ArrayList<Integer> ans = new ArrayList<>(BruteForce(arr, n));

        // for (int i = 0; i < ans.size(); i++) {
        //     System.out.print(ans.get(i) + " ");
        // }

        // Optimal
        ArrayList<Integer> ans2 = new ArrayList<>(Optimal(arr, n));

        for (int i = 0; i < ans2.size(); i++) {
            System.out.print(ans2.get(i) + " ");
        }
    }
}
