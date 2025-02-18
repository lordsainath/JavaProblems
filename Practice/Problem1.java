import java.util.Scanner;
// reverse a string and reverse a word in string without changing the order
public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        StringBuilder reversesting = new StringBuilder();
        StringBuilder reversewordstring = new StringBuilder();

        for(int i=0;i<s1.length();i++){
            reversesting.append(s1.charAt(s1.length()-1-i));
        }
        System.out.println(reversesting);

        StringBuilder word = new StringBuilder();
        for(int i=0;i<=s1.length();i++){
            if(i<s1.length() && s1.charAt(i) != ' '){
                word.append(s1.charAt(i));
               
            }
            else {
                if(word.length() > 0){
                    for(int j=0;j<word.length();j++){
                        reversewordstring.append(word.charAt(word.length()-1-j));
                    }
                    reversewordstring.append(" ");
                    word.setLength(0);
    
                }
                
            }
        }

        System.out.println(reversewordstring);


        sc.close();
    }
}