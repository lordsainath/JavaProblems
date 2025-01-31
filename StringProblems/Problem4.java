package StringProblems;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int originalnum = num;
        int revesenum = 0;

        while(num!=0){
            int digit = num % 10;
            revesenum = revesenum * 10 + digit;
            num = num / 10;
        }

        if(originalnum == revesenum){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }

        sc.close();
    }
    
}
