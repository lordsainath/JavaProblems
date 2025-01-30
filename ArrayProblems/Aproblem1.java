public class Aproblem1 {
    public static void main(String[] args) {
        // Write a program to find the **maximum** and **minimum** element in an array.
        int[] arr1 = { 9, 6, 7, 3, 4, 8, 5, 9, 2, 7 };

        int min = arr1[0];
        int max = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }

        System.out.println("The minimum number is " + min);
        System.out.println("The maximum number is " + max);

    }

}
