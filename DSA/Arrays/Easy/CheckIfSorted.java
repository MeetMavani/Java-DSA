public class CheckIfSorted {
    public static void main(String[] args) {
        int[] array = {1, 22, 3, 14, 5};
        System.out.println(CheckSorted(array));
    }

    public static boolean CheckSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1] ) {
                
            } else {
                return false;
            } 
        }
        return true;
    }
}
