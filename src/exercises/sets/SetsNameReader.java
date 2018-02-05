package exercises.sets;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsNameReader {
    public static void main(String[] args) {
        String nazwaPliku = "namespl.txt";
        TreeSet<String> nazwy = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        try (
                FileReader fileReader = new FileReader(nazwaPliku);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ) {
            String input = bufferedReader.readLine();
            while ((input = bufferedReader.readLine()) != null) {
                nazwy.add(input);
            }
            /*for (String s: nazwy){
                System.out.println(s);
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ilość elementów w zbiorze: " + nazwy.size());
        System.out.println("Pierwszy element w zbiorze: " + nazwy.first());
        System.out.println("Ostatni element w zbiorze: " + nazwy.last());
    }
}
