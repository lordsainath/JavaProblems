package ArrayPractice;

// Find Second Largest Number
public class Problem6 {

    public static void main(String[] args) {
        int[] numbers = { 23, 78, 12, 45, 89, 34, 67, 90, 10, 56 };

        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                Secondlargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > Secondlargest && numbers[i] != largest) {
                Secondlargest = numbers[i];
            }

        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("the largest elemenet is " + largest);
        System.out.println("The Second largest elemetn is " + Secondlargest);

    }

}
