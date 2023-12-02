package src.java_i_o;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your file name : "  );
        String filePath = input.nextLine();

        int characters = 0;
        int lines = 0;
        int words = 0;

        try {
            var allLines = Files.readAllLines(Path.of(filePath));
            lines = allLines.size();

            for (String line : allLines){
                characters += line.length();
                String[] parts = line.split("\\s+");
                words += parts.length;
            }
        } catch (IOException e){
            System.out.println("Error reading file " + e.getMessage());
            return;
        }
        System.out.println("Character: " + characters);
        System.out.println("lines : " + lines);
        System.out.println("Words: " + words);
    }
}
