// Brute-Force: 1:since the number of positive and negative elements are the same, 
//                we put positives into an array called “pos” and negatives into an array called “neg”.
//              2:Since the array must begin with a positive number and the start index is 0, 
//                so all the positive numbers would be placed at even indices (2*i) and negatives at the odd indices (2*i+1),
//                where i is the index of the pos or neg array while traversing them simultaneously.
//              3:This approach uses O(N+N/2) of running time due to multiple traversals and O(n) SC,
//                which we’ll try to optimize in the optimized approach given below.

// Optimal: we use the two pointer approach, firstly we create an new arr called 'ans' then we take two pointers posindex 
//          and negIndex initially placed at 0 and 1 why 0 and 1?, coz we have to place the positives at even indexes and vice versa.
//          So what we do is create an for loop from i = O to n, now we check the current element if
//                                     1: current elem is positve we will put it on the posIndex of result array which is 
//                                        ans[posindex] which is nothing but ans[0] and increment posIndex by 2 so that every 
//                                        positive element gets stored in the even index of the resultant array.
//                                     2: elem is negative we the same for negIndex as we have already initailzed negIndex as 1,
//                                        so incrementing it by 2 will always end up with an odd digit.
//          This approach takes TC of O(n) and O(n) of SC

// Version 2: In this version of the question the onll difference is that given array will not conttain wqual nos of positives and 
//            negatives so what you have to do is you will either have positives extra or negatives extras so firstly,
//            do the same process as you did for previous version for the equal nos of the positives and negatives then add the extras
//            of either positives or negatives in the end.


import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeElemsBySign {
    
    public static int[] Rearrange(int[] nums, int n) {
        int[] ans = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
            else {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        return ans;
    }

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
        // Define 2 ArrayLists, one for storing positive 
        // and other for negative elements of the array.
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Segregate the array into positives and negatives.
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0)
                pos.add(A.get(i));
            else
                neg.add(A.get(i));
        }

        // If positives are lesser than the negatives.
        if (pos.size() < neg.size()) {

            // First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining negatives at the end of the array.
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }

        // If negatives are lesser than the positives.
        else {
            // First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining positives at the end of the array.
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 1,- 2, -5, 2, -4};
        int n = arr.length;
        System.out.println(Arrays.toString(Rearrange(arr, n)));

        // Version 2
        int m = 6;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));

        ArrayList<Integer> ans = RearrangebySign(A, m);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
