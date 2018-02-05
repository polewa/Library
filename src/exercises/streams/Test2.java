package exercises.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
        //lista 100 pierwszych liczb podzielnych przez 2
        List<Integer> numbers = numStream.filter(x -> x % 2 == 0).limit(100).collect(Collectors.toList());
        numbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println();
        /*//lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = numStream.map(x -> x*x).limit(100).collect(Collectors.toList());
        squareNumbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println();
        //lista 100 liczb ujemnych w kolejności malejącej
        List<Integer> negativeNumbers = numStream.map(x -> -x).limit(100).collect(Collectors.toList());
        negativeNumbers.forEach(x -> System.out.print(x + " ; "));*/
    }
}
