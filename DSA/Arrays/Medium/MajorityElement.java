// Brute-Force: We will run a loop that will select the elements of the array one by one.
//              Now, for each element, we will run another loop and count its occurrence in the given array.
//              If any element occurs more than the floor of (N/2), we will simply return it.

// Better: Use a hashmap and store as (key, value) pairs. (Can also use frequency array based on the size of nums) 
//         Here the key will be the element of the array and the value will be the number of times it occurs. 
//         Traverse the array and update the value of the key. Simultaneously check if the value is greater than the floor of N/2. 
//         If yes, return the key  Else iterate forward.

// Optimal: Moore’s Voting Algorithm: In short which number is Owning!!!

public class MajorityElement {
    public static int majorityElement(int []nums) {
        int n = nums.length;
        int count = 0; 
        int elem = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                elem = nums[i];
            }    
            else if(nums[i] == elem) {
                count++;
            } 
            else {
                count--;
            }
        }

        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == elem) {
                count2++;
            }
        }
        if (count2 > n/2) {
            return elem;
        }

       return -1;
    }

    public static void main(String args[]) {
        int[] arr = {5, 7, 5, 7, 5, 1, 5, 5, 5, 3, 7, 7, 5, 5, 7, 5};

        System.out.println(majorityElement(arr));
    }

}


