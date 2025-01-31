package StringProblems;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        boolean ispalindrome = true;

        for(int i=0;i<s1.length()/2;i++){
            if(s1.charAt(i) != s1.charAt(s1.length()-1-i)){
                ispalindrome =  false;
                break; 
            }
        }

        if(!ispalindrome){
            System.out.println("String is not palindrome");
        }
        else{
            System.out.println("Stirng is palindrome");
        }


        sc.close();
         
          
    }
    
}
