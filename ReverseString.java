// Reverse A string using String Builder

import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String That You Want to Rerverse");
        String input1 = sc.nextLine();
        StringBuilder reverseString = new StringBuilder();

        for(int i=0;i<input1.length();i++){
            reverseString.append(input1.charAt(input1.length()-1-i));
        }

        System.out.println(reverseString);

        sc.close();
      
    }
}