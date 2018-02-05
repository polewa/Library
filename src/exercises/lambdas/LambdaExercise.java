package exercises.lambdas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExercise {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Random r = new Random();
        generate(ints, 10, () -> r.nextInt(50));
        consumeList(ints, integer -> System.out.print(integer + " "));
        System.out.println();
        filterByPredicate(ints, integer -> integer % 2 == 0);
        consumeList(ints, integer -> System.out.print(integer + " "));
    }

    private static <T> void generate(List<T> list, int num, Supplier<T> sup) {
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t: list) {
            consumer.accept(t);
        }
    }

    private static <T> void filterByPredicate(List<T> list, Predicate<T> pre) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T tmp = it.next();
            if (pre.test(tmp)) {
                it.remove();
            }
        }
    }
}
