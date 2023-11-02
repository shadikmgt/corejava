package src.string_java_mathAPI;

import java.util.HashMap;
import java.util.Map;

public class PlaceHolderReplace {

    public static void main(String[] args) {
        String template = "Hello, {name}. Your email is {email}";
        Map<String, String> values =  new HashMap<>();
            values.put("name", "Sadik");
            values.put("email", "sdik@gmail.com");

            String result = formateString(template,values);
        System.out.println(result);
    }

    public static String formateString(String template, Map<String, String> values){
        String result = template;

        for (Map.Entry<String, String> entry : values.entrySet()){
            result = result.replace("{" + entry.getKey() + "}", entry.getValue());
        }
        return result;
    }

}
