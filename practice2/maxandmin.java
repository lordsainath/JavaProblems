package practice2;

public class maxandmin {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 5, 23};

        int min = numbers[0];
        int max = numbers[0];

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            else if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("The Maximum Number is " + max);
        System.out.println("The minimum number is " + min);

    }
    
}
