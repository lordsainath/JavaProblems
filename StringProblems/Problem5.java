package StringProblems;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
         int wordCount = 0;
        boolean inWord = false;

        for(int i=0;i<s1.length();i++){
           char ch = s1.charAt(i);

           if(ch != ' '&& !inWord){
             wordCount++;
             inWord = true;
           }else if(ch == ' '){
            inWord = false;
           }
        }

        System.out.println(wordCount);
         

        sc.close();
    }
    
}
