package exercises.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream100 {
    public static void main(String[] args) {
        Stream<Integer> stream100 = Stream.iterate(0, x -> x + 1);
        List<Integer> list = stream100.filter(x -> x > 100 && x < 1000 && x % 5 == 0).limit(10).map(x -> x * 3).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
