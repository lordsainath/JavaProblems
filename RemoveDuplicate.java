import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase().trim();
       
        String result = removeduplicate(s1);
        System.out.println(result);

        sc.close();
    }

    static String removeduplicate(String s1){
        StringBuilder result = new StringBuilder();
        if(s1.length() == 0){
            return "Empty String";
        }

        boolean[] freq = new boolean[26];

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);

            if(!freq[ch - 'a']){
                result.append(ch);
                freq[ch - 'a'] = true;
            }
        }


  
        return result.toString();

    }
    
}
