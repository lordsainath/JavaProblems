package ArrayPractice;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How many element you want to add in an array");
        int length = sc.nextInt();

        int[] arr1 = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + (i + 1) + " element");
            int element = sc.nextInt();
            arr1[i] = element;
        }

        for (int arritem : arr1) {
            System.out.print(arritem + " ");
        }
        

        int min = arr1[0];
        int max = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }

        }
        System.out.println();
        System.out.println("The Minimum element in an array is " + min);
        System.out.println("The Maximum element in an array is " + max);
        sc.close();

        // 23 78 12 45 89 34 67 90 10 56
    }
}