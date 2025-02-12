package practice2;

public class Countevenandodd {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 5, 23};

        int even = 0;
        int odd = 0;
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] % 2 ==0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Even Numbers in an array is " + even);
        System.out.println("Odd numbers in an array is " + odd);
    }
    
}
