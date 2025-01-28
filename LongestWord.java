import java.util.Scanner;
// Find the Longest Word in a String
public class LongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String longestword = "";
        int length = 0;


        String currentword = "";
        for(int i=0;i<=s1.length();i++){
            if(i<s1.length() && s1.charAt(i) != ' '){
                currentword += s1.charAt(i);

            }else {
                if(currentword.length() > length){
                    length = currentword.length();
                    longestword = currentword;
                }
                currentword = "";
            }

        }

        System.out.println(longestword);
     
        sc.close();
    }

}
