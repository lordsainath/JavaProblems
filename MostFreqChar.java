import java.util.Scanner;

public class MostFreqChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().replaceAll("\\s+", "");

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch]++;
        }


        for(int freqitem:freq){
            System.out.print(freqitem + " ");
        }
        int maxFrequency = -1;
        char mostFrequentChar = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFrequency ||
                    (freq[i] == maxFrequency && (char) i < mostFrequentChar)) {
                maxFrequency = freq[i];
                mostFrequentChar = (char) i;
            }
        }

        System.out.println("the most freq char is " + mostFrequentChar);
        sc.close();
    }
}