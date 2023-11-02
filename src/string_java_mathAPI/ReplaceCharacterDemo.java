package string_java_mathAPI;

public class ReplaceCharacterDemo {
    public static String replaceChar(String string, char oldChar, char newChar){
        char [] charArray = string.toCharArray();

        for (int i = 0; i <  charArray.length; i++){
            if (charArray[i] == oldChar){
                charArray[i] = newChar;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String string = "Hello, World";
        String modifiedString = replaceChar(string, 'o', '0');
        System.out.println("Orginal String: '" + string +"'");
        System.out.println("Modified String: '" + modifiedString +"'");
    }

}
