package StringProblems;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        int consonenent = 0;

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);

            if(Character.isLetter(ch) && !(ch == 'a'|| ch == 'e' ||  ch == 'i' || ch == 'o' ||ch == 'u')){
                consonenent++;
            }
        }

        System.out.println("Total consonents are " + consonenent);
        sc.close();
    }
    
}
