public class Aproblem2 {

    // Reverse an Array
    public static void main(String[] args) {
        int[] arr1 = { 9, 6, 7, 3, 4, 8, 5, 9, 2, 7 };


         for(int i=0;i<arr1.length/2;i++){
            int temp = arr1[arr1.length-1-i];
            arr1[arr1.length-1-i] = arr1[i];
            arr1[i] = temp;
         }

         for(int arritem:arr1){
            System.out.println(arritem);
         }

    }
}
