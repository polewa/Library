package exercises.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IteratorAlphabetico {
    public static void main(String[] args) {
        Map<String, String> persons = new TreeMap<>();

        persons.put("Szczęch", "Dominika Szczęch - 27");
        persons.put("Tomczak", "Kamil Tomczak - 21");
        persons.put("Stefaniak", "Bartek Stefaniak - 29");
        persons.put("Polewczyk", "Michał Polewczyk - 26");
        persons.put("Stańczyk", "Jakub Stańczyk - 25");

        Iterator<String> ageIterator = persons.values().iterator();
        while (ageIterator.hasNext()){
            System.out.println(ageIterator.next());
        }
    }
}
