// count words in string
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
   
        String[] data = s1.trim().split(" ");
        
        System.out.println("The total words are " + data.length);



        sc.close();
    }
}
