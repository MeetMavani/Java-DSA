// Brute-Force: Step 1: Find all possible permutations of elements present and store them.
//              Step 2: Search input from all possible permutations.
//              Step 3: Print the next permutation present right after it.
// For reference of how to find all possible permutations, follow up https://www.youtube.com/watch?v=f2ic2Rsc9pU&t=32s.
// This video shows for distinct elements but code works for duplicates too.

// Optimal: The steps and code is provided below.

import java.util.*;

public class NextPermutation {
    
    public static List<Integer> nextGreaterPermutation(List<Integer> A) {
        int n = A.size();

        // step 1: Find the break point
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                ind = i;
                break;
            }
        }

        // If break point does not exist
        if (ind == -1) {
            Collections.reverse(A);
            return A;
        }

        // step 2: Find the next greater element and swap it with A[ind]
        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                Collections.swap(A, ind, i);
                break;
            }
        }

        // step 3: Reverse the sublist from ind+1 to end
        Collections.reverse(A.subList(ind + 1, n)); 

        return A;
    } 


    public static void main(String[] args) {

        // List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});

        // or we can use array list as shown below
        
        List<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(5);
        A.add(4);
        A.add(3);
        A.add(0);
        A.add(0);

        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
