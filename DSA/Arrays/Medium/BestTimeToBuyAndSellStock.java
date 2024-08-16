// Brute-Force: We can simply use 2 loops and track every transaction and maintain
//              a variable maxPro to contain the max value among all transactions.
//              Approach: 1: Use a for loop of ‘i’ from 0 to n.
//                        2: Use another for loop of j from ‘i+1’ to n.
//                        3: If arr[j] > arr[i] , take the difference and compare  and store it in the maxPro variable.
//                        4: Return maxPro.
// TC is O(n*n) and SC is O(1) 

// Optimal: We will linearly travel the array. We can maintain a minimum from the start of the array and 
//          compare it with every element of the array, if it is greater than the minimum 
//          then take the difference and maintain it in max, otherwise update the minimum.
// TC is O(n) and SC is O(1) 


public class BestTimeToBuyAndSellStock {
    
    public static int BuyAndSell(int[] nums, int n) {

        int profit = 0;
        int min = nums[0];
        int cost;
        
        for (int i = 1; i < n; i++) {
            cost = nums[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(min, nums[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        

        int[] arr = {7, 1, 5, 3, 6, 4};
        int n = arr.length;

        System.out.println(BuyAndSell(arr, n));

    }
}
