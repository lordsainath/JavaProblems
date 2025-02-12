package practice2;

public class SortArray {
    // 5. "Sort an array using bubble sort"
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 5, 23};
        boolean swapped = false;

        for(int i=0;i<numbers.length;i++){
            swapped = false;

            
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;

        }

        for(int number:numbers){
            System.out.print(number + " ");
        }
    }
    
}
