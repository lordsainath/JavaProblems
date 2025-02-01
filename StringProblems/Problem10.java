package StringProblems;

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();


        int[] freq = new int[256];
        char  maxchar = ' ';
        int maxfreq = 0;

        for(int i=0;i<s1.length();i++){
           char ch = s1.charAt(i);
            if(ch!= ' '){
                freq[ch]++;
            }

            if(freq[ch]>maxfreq){
                maxfreq = freq[ch];
                maxchar = ch;
                
            }
        }


        if(maxfreq > 0){
            System.out.println("The most freq char is " + maxchar);
        }
        else{
            System.out.println("No max char found");
        }





        sc.close();
    }
}