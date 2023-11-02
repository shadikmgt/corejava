package src.string_java_mathAPI;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramVerifier {
    public static void main(String[] args) {
        Scanner  scanner  = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        if (isAnagram(word1, word2)){
            System.out.println("This is an anagram.");
        }else {
            System.out.println("This is not an anagram.");
        }
    }

    public static boolean isAnagram(String word1, String word2){
        if (word1.length() != word2.length()){
            return false;
        }

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char [] char1 = word1.toCharArray();
        char [] char2 = word2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
