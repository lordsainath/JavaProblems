

public class RotateArraytoleft {

    public static void main(String[] args) {
        int[] numbers = { 23, 78, 12, 45, 89, 34, 67, 90, 10, 56 };
        int positiontororate = 12;
        if (positiontororate > numbers.length) {
            positiontororate = positiontororate % numbers.length;
        }

        int[] rotatedarray = rotatearray(numbers, positiontororate);

        for (int rotatedarrayitem : rotatedarray) {
            System.out.print(rotatedarrayitem + " ");
        }

    }

    public static int[] rotatearray(int[] numbers, int positiontororate) {
       
        for(int k=0;k<positiontororate;k++){
            int numbersvar = numbers[0];
            for(int i=0;i<numbers.length-1;i++){
                numbers[i] = numbers[i+1];
             }
              
        numbers[numbers.length-1] = numbersvar;

        }
        return numbers;

    }
}