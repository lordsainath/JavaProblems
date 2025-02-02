

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many numbers that you want to add in an array ");
        int length = sc.nextInt();

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + (i + 1) + " Number in an array");
            int num = sc.nextInt();
            numbers[i] = num;
        }
        int[] unique = removeduplicate(numbers, length);
        for (int uniquenumber : unique) {
            System.out.print(uniquenumber + " ");
        }
        sc.close();
    }

    private static int[] removeduplicate(int[] numbers, int length) {

        int[] temparray = new int[length];
        int newsize = 0;

        for (int i = 0; i < length; i++) {

            boolean isduplicate = false;
            for (int j = 0; j < newsize; j++) {
                if (numbers[i] == temparray[j]) {
                    isduplicate = true;
                    break;
                }

            }

            if (!isduplicate) {
                temparray[newsize] = numbers[i];
                newsize++;
            }

        }

        int[] uniquearray = new int[newsize];
        for (int i = 0; i < newsize; i++) {
            uniquearray[i] = temparray[i];

        }

        return uniquearray;

    }

}
