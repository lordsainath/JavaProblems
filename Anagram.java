import java.util.Scanner;

public class Anagram {

 public static boolean check(String s1,String s2){
           
    if(s1.length() != s2.length()){
        System.out.println("The String is not the same length");
        return false;
    }
    
    int[] freq1 = new int[26];
    int[] freq2 = new int[26];


    for(int i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
        freq1[ch - 'a']++;
    }
    for(int i=0;i<s2.length();i++){
        char ch = s2.charAt(i);
        freq2[ch - 'a']++;
    }

    // compare 2 frequency
    for(int i=0;i<freq1.length;i++){
      if(freq1[i] != freq2[i]){
        return false;
      }
    }
     
    return true;

 }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        boolean result = check(s1,s2);

        if(result){
            System.out.println("The strings are anagram");
        }
        else {
            System.out.println("strings are not anagram");
        }


        sc.close();
    }


}