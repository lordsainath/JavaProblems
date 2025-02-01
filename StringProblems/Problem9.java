package StringProblems;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        boolean isrepeat;
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            isrepeat = false;
            for(int j=0;j<s1.length();j++){
                if(j!=i && s1.charAt(j) == ch){
                    isrepeat = true;
                    break;
                }
            }

            if(!isrepeat){
                System.out.println("The first non repeating char is "  +ch);
                break;

            }

        }




        sc.close();
    }
    
}
