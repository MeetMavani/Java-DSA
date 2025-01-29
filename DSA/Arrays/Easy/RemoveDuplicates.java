import java.util.*;

public class RemoveDuplicates {


    public static int remove(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }            
        }

        return j + 1;
    }

    public static int hash(int[] arr) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }

        int k = hashSet.size();
        int j = 0;
        for(int x : hashSet) {
            arr[j++] = x;
        }
        
        return k;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,1,2,2,2,3,3};

        // System.out.println(remove(arr));
        // System.out.println(Arrays.toString(arr));

        System.out.println(hash(arr));

    }
}