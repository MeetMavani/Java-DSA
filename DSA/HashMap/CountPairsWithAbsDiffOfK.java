package DSA.HashMap;
import java.util.*;

public class CountPairsWithAbsDiffOfK {

    
    public static int map(int[] arr, int k) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if (hashmap.containsKey(arr[i] - k)) {
                count += hashmap.get(arr[i] - k);
            }

            if (hashmap.containsKey(arr[i] + k)) {
                count += hashmap.get(arr[i] + k);
            }
            
            hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
            
        }
        return count;
    }

    public static void main(String args[]) {

        int[] arr = {3, 2, 1, 5, 4};
        int k = 2;

        map(arr, k);
        System.out.println("Count of pairs with absolute difference of " + k + " is: " + map(arr, k));
    }

}