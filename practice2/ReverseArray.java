package practice2;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 5, 23};
        
        for(int i=0;i<numbers.length/2;i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
        }

         for(int number:numbers){
            System.out.print(number + " ");
         }

    }
}
