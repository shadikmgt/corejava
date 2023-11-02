package string_java_mathAPI;

public class VowelCounter {
    private static final String VOWELS = "aeiou";

    public static int countVowels(String text) {
        int count = 0;

        String textLoweCase = text.toLowerCase();

        for (char c : textLoweCase.toCharArray()) {
            if (VOWELS.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "Hello, World";

        int vowelCount = countVowels(string);
        System.out.println("The number of vowels in '" + string + "' is " + vowelCount + ".");

    }
}
