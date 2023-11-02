package string_java_mathAPI;

public class SplitString {
    public static String[] splitString(String string, String delimiter){
        String[] result = string.split(delimiter);
        for (String word: result){
            System.out.println(word);
        }

        return string.split(delimiter);
    }

    public static void main(String[] args) {
        String oldString = "Hello, i am from, bd";
        splitString(oldString, ",");
//        System.out.println(oldString);
//        System.out.println(Arrays.toString(splitString(oldString, "")));

    }

}
