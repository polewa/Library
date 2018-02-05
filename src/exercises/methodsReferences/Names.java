package exercises.methodsReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Names {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Polewczyk");
        names.add("Szczęch");
        names.add("Bachura");
        names.add("Korwin");
        names.add("Andrzejewicz");

        Collections.sort(names, String::compareToIgnoreCase);
        System.out.println(names);
    }

    /*private static int sortAscending(String t1, String t2) {
        return t1.compareTo(t2);
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t: list) {
            consumer.accept(t);
        }
    }*/
}
