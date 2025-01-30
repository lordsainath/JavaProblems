public class Aproblem4 {
    // Count Even and Odd Numbers
    public static void main(String[] args) {

        int[] arr1 = { 9, 6, 7, 3, 4, 8, 5, 9, 2, 7,0 };

        int even = 0;
        int odd = 0;

        for(int arritem:arr1){
            if(arritem%2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("The even numbers are " +even);
        System.out.println("the odd numbers are "  + odd);
        
    }
    
}
