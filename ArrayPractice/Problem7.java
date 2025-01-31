package ArrayPractice;

// 6. **Check if Array is Sorted**  
//    - Write a function to check if an array is sorted in ascending order. 
public class Problem7 {
    public static void main(String[] args) {
        // unsorted array
        int[] numbers = { 23, 78, 12, 45, 89, 34, 67, 90, 10, 56 };

        // sorted array
        // int[] sorted1 = { 10, 12, 23, 34, 45, 56, 67, 78, 89, 90 };

        boolean issorted = issorted(numbers);
        // boolean issorted = issorted(sorted1);
        if (issorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }

    public static boolean issorted(int[] arr1) {

        for (int i = 0; i < arr1.length-1; i++) {
            if(arr1[i] > arr1[i+1]){
                return false;
            }
        }

        return true;
    }

}
