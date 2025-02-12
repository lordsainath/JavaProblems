package practice2;

public class CheckSorted {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 5, 23};
        boolean issorted = true;
        
       
        for(int i= 0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                issorted = false;
                break;

            }

        }

        if(issorted){
            System.out.println("Array is sorted");

        }else{
            System.out.println("Array is not sorted");
        }

    }
    
}
