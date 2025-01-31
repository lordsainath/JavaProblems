package StringProblems;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        StringBuilder rs = new StringBuilder();

        String[] words = s1.split("\\s+");

        for (String word : words) {
            StringBuilder rw = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                rw.append(word.charAt(word.length() - 1 - i));
            }
            rw.append(" ");
            rs.append(rw);
            rw.setLength(0);

        }

        System.out.println(rs);

        sc.close();
    }

}
