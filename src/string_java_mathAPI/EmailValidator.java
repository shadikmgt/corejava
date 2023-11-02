package string_java_mathAPI;

public class EmailValidator {
    public static boolean isValidEmail(String email){
        if(email == null || email.isEmpty()){
            return false;
        }

        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length()-1){
            return false;
        }
        for (int i = 0; i < atIndex; i++){
            char c = email.charAt(i);

            if (!Character.isLetterOrDigit(c) && c != '.' && c != '-' && c != '_') {
                return false;
            }
        }
        if (!email.substring(atIndex).contains(".")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String email = "!!!@gmail.com";

        if (isValidEmail(email)){
            System.out.println(email + " is a valid email.");
        }else {
            System.out.println(email + " is not a valid email.");
        }
    }

}
