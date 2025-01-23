import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number that you want to check the palindrome");
       int num = sc.nextInt();
       int originalnum = num;
      int revrsenum = 0;

      while(num!=0){
        int digit = num%10; //extract the last digit
        revrsenum = revrsenum * 10+digit;
        num = num/10; //remover the last digit from the number

      }

      if(originalnum == revrsenum){
        System.out.println("The number is palindrome");
      }else {
        System.out.println("Number is not palindrome");
      }
       
       sc.close();
      
    }
}