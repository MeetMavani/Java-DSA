import java.util.Arrays;

public class ProductButSelf {

    public static int[] productButSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int prefixProduct = 1;
        int suffixProduct = 1;

        for (int i = 0; i < n; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];      
        }


        return result;

    }

    public static void main(String[] args) {
        

        int[] arr = {1, 2, 3, 4};

        int[] result = productButSelf(arr);
        System.out.println("Product of array except self: " + Arrays.toString(result));
    }
}
