import java.util.Scanner;

// 11.Replace Spaces with a Specific Character
public class ReplaceSpaceWithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String result = replacechar(s1, s2);
        System.out.println(result);

        sc.close();

    }

    static String replacechar(String s1,String s2){

       StringBuilder sb = new StringBuilder();

       for(int i = 0;i<s1.length();i++){
        char ch = s1.charAt(i);

        if(ch == ' '){
            sb.append(s2);
        }else {
            sb.append(ch);
        }
       }


            return sb.toString();

        
    }
}
