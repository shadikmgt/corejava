package src.java_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of word: ");
        int numWords = scanner.nextInt();

        List<String> words = new ArrayList<>();
        for (int i = 0; i < numWords; i++) {
            System.out.println("Enter word " + (i + 1) + " : ");
            words.add(scanner.next());
        }
        Collections.sort(words);
        System.out.println("Word in alphabetical order : " + words);
    }
}
