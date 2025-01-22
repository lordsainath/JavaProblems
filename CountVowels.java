import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string that you want to count the vowels");
        String s1 = sc.nextLine();
        int vowelcount = 0;

        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c == 'a'|| c == 'e' || c == 'i'|| c== 'o' || c == 'u'){
                vowelcount++;
            }
        }

        System.out.println("The vowel count is " + vowelcount);
        sc.close();


    }
}
