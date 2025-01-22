import java.util.Scanner;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean isrepeat = false;

            for (int j = 0; j < s1.length(); j++) {
                if (i != j && s1.charAt(i) == s1.charAt(j)) {
                    isrepeat = true;
                    break;
                }
            }

            if (!isrepeat) {
                System.out.println("The first non repeating char is " + c);
                break;
            }
        }

        sc.close();
    }

}
