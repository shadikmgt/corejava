package src.string_java_mathAPI;

public class TitleCaseConverter {
    public static String toTitleCase(String string){
        String [] words = string.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (String word  : words){
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String string = "the quick brown fox";
        String titleCase = toTitleCase(string);
        System.out.println("'Original String : '" + string);
        System.out.println("'Title case text : '" + titleCase);
    }
}
