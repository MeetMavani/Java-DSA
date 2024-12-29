public class Union {

    public static int[] union(int[] nums1, int[] nums2) {
        
        int p1 = 0; int p2 = 0; 
        int[] ans = new int[nums1.length + nums2.length];
        
        for (int i = 0; i < (ans.length); i++) {
            ans[i] = nums1[p1];
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {7, 2, 4, 1, 6, 9};
        
    }    
}
