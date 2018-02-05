package exercises.sets;

import java.util.TreeSet;

public class SetsExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(4);
        System.out.println("Size: " + set.size());
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Contains 2? " + set.contains(2));
    }
}
