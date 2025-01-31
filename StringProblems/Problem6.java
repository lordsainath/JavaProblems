package StringProblems;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        int vowel = 0;
      

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);

            if(ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' ||ch == 'u'){
                vowel++;
            }
        }

        System.out.println("vowels are " + vowel);

        sc.close();
    }
    
}
