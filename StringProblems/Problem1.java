package StringProblems;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder();

        for(int i=0;i<s1.length();i++){
            sb1.append(s1.charAt(s1.length()-1-i));
        }
        System.out.println(sb1);

        sc.close();
    }
    
}
