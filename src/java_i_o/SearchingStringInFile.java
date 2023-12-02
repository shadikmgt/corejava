package src.java_i_o;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchingStringInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file path : ");
        String filePath = scanner.nextLine();

        System.out.println("Enter a string to search for : ");
        String searchingString = scanner.nextLine();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String line;
            int lineNumber = 0;
            while ((line = bufferedReader.readLine()) != null){
                lineNumber++;
                if (line.contains(searchingString)){
                    System.out.println("Found on line " + lineNumber
                           + " : " + line
                            );
                    break;
                } else {
                    System.out.println("Not found");
                }
            }

        }catch (IOException e){
            System.out.println("An error occurred when reading the file : " + e.getMessage());
        }
    }
}
