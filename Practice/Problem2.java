import java.util.Scanner;

// check palindrome of a string and a number
public class Problem2 {

    //

    public static boolean checkpalindromestring(String s1) {
        String checks1 = s1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (checks1.length() < 1) {
            return false;
        }

        for (int i = 0; i < checks1.length() / 2; i++) {
            if (checks1.charAt(i) != checks1.charAt(checks1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checknumberpalindrome(int num) {
        int originalnum = num;
        int reversenum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversenum = reversenum * 10 + digit;
            num = num / 10;
        }
        return originalnum == reversenum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String that you want to check palindrome");
        String s1 = sc.nextLine().trim();

        boolean result = checkpalindromestring(s1);
        if (result) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

        System.out.println("Enter the Number that you want to check palindrome");
        int num = sc.nextInt();
        result = checknumberpalindrome(num);
        if (result) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

        sc.close();

    }

}
