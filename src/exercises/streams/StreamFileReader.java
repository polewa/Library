package exercises.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileReader {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();

        try (
                BufferedReader reader = new BufferedReader(new FileReader("loremipsum.txt"));
                )
        {
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                wordsList.addAll(Arrays.asList(nextLine.split(" ")));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        wordsList = wordsList.stream().map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long wordsCount = wordsList.stream()
                .filter(s -> s.startsWith("s"))
                .count();
        System.out.println("Liczba wyrazów spełniających warunek: " + wordsCount);
        long wordsLength5 = wordsList.stream()
                .filter(s -> s.length() == 5)
                .count();
        System.out.println("Liczba słów których długość wynosi 5: " + wordsLength5);
    }

}
