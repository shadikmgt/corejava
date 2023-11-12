package src.java_collection_framework;

import java.util.HashMap;
import java.util.Map;

public class MapOperation {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Lemon", 4);

        int value = map.get("Orange");
        System.out.println(value);

    }
}
