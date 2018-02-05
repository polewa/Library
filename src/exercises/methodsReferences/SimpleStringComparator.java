package exercises.methodsReferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleStringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");

        Collections.sort(names, String::compareToIgnoreCase);

        for (String name: names) {
            System.out.println(name);
        }
    }
}
