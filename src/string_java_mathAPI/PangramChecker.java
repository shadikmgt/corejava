package string_java_mathAPI;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String string){
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++){
            alphabet.add(c);
        }

        Set <Character> charSet = new HashSet<>();
        for (char c : string.toLowerCase().toCharArray()){
            if (Character.isLetter(c)){
                charSet.add(c);
            }
        }
        return charSet.containsAll(alphabet);
    }

    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy dog";
        if (isPangram(string)){
            System.out.println("'"+string+"'"+"is a pangram.");
        } else {
            System.out.println("'"+string+"'"+"is not a pangram.");

        }
    }
}
