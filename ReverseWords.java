import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String s1 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder();
        String[] words = s1.split(" ");


        for(String word:words){
            StringBuilder rw = new StringBuilder();
            for(int i=0;i<word.length();i++){
                rw.append(word.charAt(word.length()-1-i));
            }
            sb1.append(rw + " ");

        }

        System.out.println(sb1);

       
     


        sc.close();
    }
}
