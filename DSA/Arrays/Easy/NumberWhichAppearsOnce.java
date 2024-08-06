public class NumberWhichAppearsOnce {
    public static int FindTheNumberWhichAppearsOnce(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 3, 4, 4};
        System.out.println("The Number which appears once is: " + FindTheNumberWhichAppearsOnce(nums));
    }
}
