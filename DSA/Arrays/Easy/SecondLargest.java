// 1. Brute force approach for finding both largest and second largest elements would be sorting then accessing through index 
//    It would takes TC of O(nlogn) and SC of O(1)

// 2. Better approach we can use two for loops first to find the largest, 
//    then using the second for loop we can find the second lagest the same way we found the largest and 
//    this approach takes TC of O(n + n) = O(2n)

// 3. But this optimal approach below takes TC of O(n) which is much better than O(nlogn) and O(2n)

public class SecondLargest {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 7, 5};
        SL(array);
    }

    public static void SL(int[] arr) {
        int largest, secondlargest;

        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondlargest = arr[1];
        } else {
            largest = arr[1];
            secondlargest = arr[0];
        }

        for(int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }

        System.out.println("Largest Element of the array is:" + largest);
        System.out.println("Second Largest Element of the array is:" + secondlargest);
    }
}
