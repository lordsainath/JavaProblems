package ArrayPractice;


public class Problem3 {
    public static void main(String[] args) {
        int[] numbers = {23, 78, 12, 45, 89, 34, 67, 90, 10, 56};

        int sum = 0;

        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }

        System.out.println("The Total sum is " + sum);

    }
    
}
