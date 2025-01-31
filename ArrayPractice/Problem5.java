package ArrayPractice;

public class Problem5 {

    public static void main(String[] args) {
        int[] numbers = {23, 78, 12, 45, 89, 34, 67, 90, 10, 56};

        for(int i=0;i<numbers.length-1;i++){
            boolean swapped = false;
            for(int j=0;j<numbers.length-1-i;j++){
               if(numbers[j] > numbers[j+1]){
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
                swapped = true;
               }

               
            }
            if(!swapped){
                break;
               }
        }


        for(int number:numbers){
            System.out.print(number + " ");
        }
    }
}