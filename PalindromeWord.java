import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String that you want to palindrome");
        String s1 = sc.nextLine();
        boolean ispalindrome = true;


        for(int i=0;i<s1.length()/2;i++){
            if(s1.charAt(i) !=s1.charAt(s1.length()-1-i)){
                     ispalindrome = false;
                     break;

            }
        }

      if(ispalindrome){
        System.out.println("The Given String is palindrome");
      }
      else {
        System.out.println("Given String is not palindrome");
      }
        sc.close();
    }

}
