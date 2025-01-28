import java.util.Scanner;

public class CapitalizeTheFirstWord {
    // Capitalize the First Letter of Each Word
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder();

        String currentword = "";
       for(int i=0;i<=s1.length();i++){
 
         if(i<s1.length() && s1.charAt(i)!=' '){
            currentword += s1.charAt(i);
            if(currentword.length() == 1){
                currentword = currentword.toUpperCase();
            }
            
         }else {
            currentword += " ";
           sb1.append(currentword);
           currentword = "";
         }
              
       }
       System.out.println(sb1);
        sc.close();
        
    }
}
