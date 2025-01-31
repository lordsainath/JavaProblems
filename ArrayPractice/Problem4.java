package ArrayPractice;

public class Problem4 {
    public static void main(String[] args) {

        int[] numbers = {23, 78, 12, 45, 89, 34, 67, 90, 10, 56};

        int even=0;
        int odd = 0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] % 2 ==0){ 
                even++;
            }
            else  {
                odd++;
            }

        }

        System.out.println("Even numbers are " +even);
        System.out.println("Odd numbers are " + odd);
        
    }
}
