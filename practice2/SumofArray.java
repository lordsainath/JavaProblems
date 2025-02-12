package practice2;

public class SumofArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 5, 23};

        int sum = 0;

        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }

        System.out.println("The sum of all numbers in an array is " + sum);
    }
    
}
