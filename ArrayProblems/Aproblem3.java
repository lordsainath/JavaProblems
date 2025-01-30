public class Aproblem3 {
    public static void main(String[] args) {
        // Sum of All Elements
        int[] arr1 = { 9, 6, 7, 3, 4, 8, 5, 9, 2, 7 };

        int sum = 0;
        for(int arritem:arr1){
            sum+= arritem;
        }
        System.out.println("the sum of numbers is " + sum);
    }
    
}
