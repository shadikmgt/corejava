package src.java_collection_framework;

import java.util.*;

public class UniqueCharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = scanner.nextLine();

        Set <Character> uniqueChar = new HashSet<>();
        for (char c : input.toCharArray()){
            uniqueChar.add(c);
        }

        System.out.println("Number of unique characters : " + uniqueChar);
    }
}
