package src.java_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ClearSet {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("indigo");
        colors.add("violet");
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);

    }
}
