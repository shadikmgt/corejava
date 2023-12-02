package src.java_i_o;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name : ");
        String filePath = Paths.get(input.nextLine()).toString();


        int character = 0;
        int words = 0;
        int lines = 0;

        try{
            var allLines = Files.readAllLines(Path.of(filePath));
            lines = allLines.size();

            for (String line : allLines){
                character += line.length();
                String[] parts = line.split("\\s+");
                words = parts.length;
            }
        }catch (Exception e){
            System.out.println("Error reading file : " + e.getMessage());
            return;
        }
        System.out.println("Character : " + character);
        System.out.println("Words : " + words);
        System.out.println("Lines : " + lines);
    }
}
