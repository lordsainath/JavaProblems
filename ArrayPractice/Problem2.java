package ArrayPractice;

import java.util.Scanner;
// Reverse an Array
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// we can comment this
        System.out.println("Enter How many element you want to add in an array");
        int length = sc.nextInt();

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + (i + 1) + " element");
            int element = sc.nextInt();
            numbers[i] = element;
        }

// til this

// int[] numbers = {23, 78, 12, 45, 89, 34, 67, 90, 10, 56};

        for(int i=0;i<numbers.length/2;i++){
            int temp = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = numbers[i];
            numbers[i] = temp;
        }

        System.out.println("Reversed Array Is ");
        for(int number:numbers){
            System.out.print(number + " ");
        }



        sc.close();
    }
    
}
