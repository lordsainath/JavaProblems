package practice2;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 5, 23};
        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int number:numbers){    
            if(number > largest){
                SecondLargest = largest;
                largest = number;
            }
            else if(number > SecondLargest && number != largest){
                SecondLargest = number;
            }
        }

      

        if(SecondLargest == Integer.MIN_VALUE){
            System.out.println("No Second largest number found");
        }
        else{
            System.out.println("The Largest Number is " + largest);
            System.out.println("The Secons Largest numbers is  " + SecondLargest);
        }


    }
    
    
}
