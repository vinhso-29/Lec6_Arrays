
package Lec6_Arrays;
import java.util.Scanner;
public class CharacterFrequencyArray_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (lowercase letters only): ");
        String text = scanner.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') { 
                freq[c - 'a']++;
            }
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + ": " + freq[i]);
            }
        }

        scanner.close();
    }
}

